package win;

import javax.swing.*;

public class FallingLabel extends JLabel implements Runnable {
    private int x; //라벨의 x좌표
    private int y; //  라벨의 y좌표
    private int speed; //떨어지는 속도
    private JFrame parent; // 부모 윈도우

    public FallingLabel(String text, int speed, JFrame perent) {
        super( text );

        this.parent = parent;
        this.speed = speed;
        y = 0;
        x = (int)(Math.random() * (parent.getWidth()-getWidth())); // x좌표는 부모 윈도우의 넓이를 기준으로 랜덤하게 위치시킴

        setSize(getPreferredSize()); //글자 크기에 맞게 라벨의 넓이와 높이를 맞춤
    }

    @Override
    public void run() {
        while (true) {
            y += speed;

            SwingUtilities.invokeLater(() ->{
                setLocation(x, y); //x, y좌표로 이동 시킴
            });

            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }


}
