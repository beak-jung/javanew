package win;

import javax.imageio.IIOException;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.IOException;

public class FirstSwingApp {
    public static final int TEXT_HEIGHT = 30;
    public static int score = 0;

    public static void main(String[] args) throws IOException {

        GameWin

        JFrame frame = new JFrame("자바 스윙 앱", ); //메인 윈도우
        frame.setSize(800, 600); //메인 윈도우의 크기
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //x버튼을 클릭 했을 때 액션 ===> 앱 종료
        frame.setLayout( null ); //레이아웃 객체를 사용하지 않음
        frame.setResizable( false ); //윈도우 사이징을 막음
        frame.getContentPane().setBackground(new Color(0, 0, 0));
//        LayoutManager layoutManager = new FlowLayout(FlowLayout.CENTER);

//        label.setBounds(10, 10, 600, 50);

        WordManager wordManager = new WordManager( frame );
        wordManager.initWords("words.json");

        JTextField text = new JTextField();
        JLabel score = new JLabel();
        Font font = new Font("맑은 고딕", Font.BOLD, 14);
        score.setFont(font); // 라벨의 폰트를 저장함
//        setForeground(Color.WHITE);
        score.setBackground(new Color(255, 255, 255));
        score.setOpaque(true);
//        text.setBounds(10, 100, 600, TEXT_HEIGHT);



        //메인 윈도우가 생성된 후에 실행 되도록 설정
        //메인 윈도우가 나타나기 직전에 실행되도록 처리함
        SwingUtilities.invokeLater(text::requestFocusInWindow); //text 위젯에 포커싱을 해라

        frame.addComponentListener(new ComponentListener() {
            // 윈도우의 사이즈가 변경 됬을 때 실행 <--
            @Override
            public void componentResized(ComponentEvent e) {
                //text 위젯을 메인 윈도우 하단에 고정 시키기
                int y = frame.getContentPane().getHeight() - TEXT_HEIGHT;
                text.setBounds(0, y, frame.getWidth(), TEXT_HEIGHT);
                score.setBounds(0, 0, frame.getWidth(), TEXT_HEIGHT);
                score.setEnabled(false);
            }

            @Override
            public void componentMoved(ComponentEvent e) {} //메인 윈도우가 이동되었을 때 실행됨
            @Override
            public void componentShown(ComponentEvent e) {} //메인 윈도우가 보여졌을 때 실행됨
            @Override
            public void componentHidden(ComponentEvent e) {} //메인 윈도우가 숨겨졌을 때 실행됨
        });

        text.addKeyListener(new KeyListener() {
            @Override
            public void keyPressed(KeyEvent e) {
                //text 에서 enter 가 눌렀으면
                if(e.getKeyCode() == KeyEvent.VK_ENTER) {
                    //입력된 글자와 같은 라벨을 찾아서 지움
                    String inputText = text.getText();
                    System.out.println( inputText );
                    if(wordManager.remove( inputText )) {
                        FirstSwingApp.score += 10;
                        //점수 :100

                        score.setText( String.format("점수 : %d", FirstSwingApp.score) );
                        System.out.println( FirstSwingApp.score );
                    }

                    text.setText(""); //text clear
                }
            }

            @Override
            public void keyTyped(KeyEvent e) {}
            @Override
            public void keyReleased(KeyEvent e) {}
        });

//        frame.add(label);
        frame.add(text);
        frame.add(score);

        //timer Thread를 생성한다
        Timer timer = new Timer(1000, (event) -> {
            //Timer Thread를 하는 일 정의
            wordManager.add(); //FallingLabel 인스턴스를 한개씩 추가함



        });

        //Timer Thread
        timer.start();

        //윈도우가 보이게 함
        frame.setVisible(true);
    }
}
