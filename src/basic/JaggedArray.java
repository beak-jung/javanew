package basic;

import java.util.Arrays;
import java.util.Random;

public class JaggedArray {
    public static void main(String[] args) {

        //Jagged Array : 불규칙적인 가변길이 배열
        Random rand = new Random();

        int [][] arr = new int [3][]; //1차원 배열의 개수가 만들어지지 않음
        for(int i=0; i< arr.length; i++){
            int len = rand.nextInt(10)+1;
            arr[i] = new int [len]; //2차원 배열의 아이템을 1차원 배열로 할당한다
            for(int j=0; j< arr[i].length; j++){
                arr[i][j] = rand.nextInt(10) + 1;
            }

            System.out.println(Arrays.toString(arr[i]));
        }

        String [] strArr = {"hello", "world", "java", "is", "good"};
        for(String str : strArr){
            System.out.printf("%s ", str);
        }

        System.out.println();

        for(String arg : args){
            System.out.printf("%s ", arg);
        }
    }
}
