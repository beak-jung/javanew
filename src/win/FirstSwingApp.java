package win;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class FirstSwingApp {
    public static final int TEXT_HEIGHT = 30;

    public static void main(String[] args) {
        JFrame frame = new JFrame("자바 스윙 앱"); //메인 윈도우
        frame.setSize(800, 600); //메인 윈도우의 크기
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //x버튼을 클릭 했을 때 액션 ===> 앱 종료
        frame.setLayout( null ); //레이아웃 객체를 사용하지 않음
//        LayoutManager layoutManager = new FlowLayout(FlowLayout.CENTER);

        JLabel label = new FallingLabel("텍스트", 10, frame); //위젯(Widget), 컴포넌트(Component)
        Thread th = new Thread( label );
        th.start();
//        label.setBounds(10, 10, 600, 50);

        JTextField text = new JTextField();
//        text.setBounds(10, 100, 600, TEXT_HEIGHT);

        //메인 윈도우가 생성된 후에 실행 되도록 설정
        //메인 윈도우가 나타나기 직전에 실행되도록 처리함
        SwingUtilities.invokeLater(text::requestFocusInWindow); //text 위젯에 포커싱을 해라

        frame.addComponentListener(new ComponentListener() {
            // 윈도우의 사이즈가 변경 됬을 때 실행
            @Override
            public void componentResized(ComponentEvent e) {
                //text 위젯을 메인 윈도우 하단에 고정 시키기
                int y = frame.getContentPane().getHeight() - TEXT_HEIGHT;
                text.setBounds(0, y, frame.getWidth(), TEXT_HEIGHT);
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

                    text.setText(""); //text clear
                }
            }

            @Override
            public void keyTyped(KeyEvent e) {}
            @Override
            public void keyReleased(KeyEvent e) {}
        });

        frame.add(label);
        frame.add(text);


        //윈도우가 보이게 함
        frame.setVisible(true);
    }
}
