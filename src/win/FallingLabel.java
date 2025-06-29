package win;

import javax.swing.*;
import java.awt.*;

public class FallingLabel extends JLabel implements Runnable {
    private int x; //라벨의 x좌표
    private int y; //  라벨의 y좌표
    private int speed; //떨어지는 속도
    //private JFrame parent; // 부모 윈도우
    private WordManager mgr;

    public FallingLabel(String text, int speed, WordManager mrg) {
        super( text );

        this.mgr = mgr;
        this.speed = speed;
        y = 0;
        x = (int)(Math.random() * (parent.getWidth()-getWidth())); // x좌표는 부모 윈도우의 넓이를 기준으로 랜덤하게 위치시킴

        //폰트 생성

        Font font = new Font("맑은 고딕", Font.PLAIN, 14);
        setFont(font); // 라벨의 폰트를 저장함
//        setForeground(Color.WHITE);
        setForeground(new Color(255, 255, 255));
        setSize(getPreferredSize());//글자 크기에 맞게 라벨의 넓이와 높이를 맞춤
    }

    @Override
    public void run() {
        while (true) {
            y += speed;

            SwingUtilities.invokeLater(() ->{
                setLocation(x, y); //x, y좌표로 이동 시킴
            });

            if( y> mgr.getParent().getHeight() )
                break;

            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

        System.out.println("라벨 스레드가 종료됨!");
        //parent.remove( this ); //이 라벨이 메인 윈도우에서 제거됨
        mgr.remove(this);

    }
}
