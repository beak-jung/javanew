package win;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FirstSwingApp {
    public static void main(String[] args) {
        JFrame frame = new JFrame("자바 스윙 앱");
        frame.setSize(800, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout( null );

        JLabel label = new JLabel("텍스트를 입력하시오");
        label.setBounds(10, 10, 600, 50);

        JTextField text = new JTextField();
        text.setBounds(10, 100, 600, 50);

        JButton button1 = new JButton("변경");
        button1.setBounds(10, 200, 600, 50);
        button1.addActionListener((e) -> {
            label.setText(text.getText());
        });
//        button.addActionListener();

        JButton button2 = new JButton("클리어");
        button2.setBounds(10, 300, 600, 50);
        button2.addActionListener((e) -> {
            text.setText("");

        });

        frame.add(label);
        frame.add(text);
        frame.add(button1);
        frame.add(button2);

        frame.setVisible(true);
    }
}
