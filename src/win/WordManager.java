package win;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import javax.swing.*;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class WordManager {
    //Fallinglabel 인스턴스를 저장하는 리스트
    private ArrayList<FallingLabel> labelArray;

    private List<String> wordArray;
    private JFrame parent;

    public WordManager(JFrame parent) {
        this.parent = parent;
        labelArray = new ArrayList<>();
    }

    public JFrame getParent() {
        return parent;
    }

    public void initWords(String fileName) throws IOException {
        try (FileReader reader = new FileReader(fileName))
        {
            Gson gson = new Gson();

            // Json형식으로부터 리스트를 읽기 위한 타입 생성
            Type type = new TypeToken<List<String>>() {}.getType();
            wordArray = gson.fromJson(reader, type); //위에서 생성한 타입 형식의 리스트를 읽음(List 인스턴스가 생성됨)
            wordArray.forEach(System.out::println); //
        }
    }

    public void add() {

        //int index = (int)(Math.random() * wordArray.size());
        Random rand = new Random();
        int index = rand.nextInt(wordArray.size());
        String randomText = wordArray.get(index);

        int speed = rand.nextInt(2, 11);

        FallingLabel label = new FallingLabel(randomText, speed, parent); //위젯(Widget), 컴포넌트(Component)
        parent.add( label ); //라벨을 메인 윈도우에 추가시킴
        Thread th = new Thread( label ); //떨러뜨리는 Thread생성
        th.start();

        //Fallinglabel 인스턴스 저장 배열에서 관리
        labelArray.add( label );
    }

    public boolean remove(String text) {
        // 리스트에서 매개변수로 주어지는 text와 비교하여 Fallinglabel인스턴스를 찾아서 삭제함
        for(FallingLabel label : labelArray) {
            if( label.getText().equals(text) ) {
                System.out.println( text + "가 삭제됨");
                parent.remove( label ); // 리스트에서 삭제
                labelArray.remove( label ); // 윈도우에서 삭제
                parent.repaint();  //메인 윈도우를 다시 그림
                return true;
            }
        }

        return false;

    }

    public void remove(FallingLabel label) {
        labelArray.remove(label);
        parent.remove(label);
        parent.repaint();
    }
}
