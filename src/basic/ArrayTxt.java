package basic;

import java.util.Comparator;
import java.util.Random;
import java.util.Arrays;


public class ArrayTxt {
    public static void main(String[] args) {
        //primitive type :byte, char, short, int, long, float, double
        // referenced type : String, class
        //Wrapper Class
        Byte a1 = 1;
        byte a = 1;
        //Byte, Character, Short, Integer, Long, Float, Double

        //int a = 10;
        //int b = 5;
        //int tmp;
        //tmp = a;
        //a = b;


        Integer [] arr = new Integer[10];

        Random rand = new Random();
        for(int i=0; i<arr.length; i++){
            arr[i] = rand.nextInt(45)+1;
        }

        //for(int n : arr) {
        //   System.out.printf("%d\t", n);
        //}
        //Array.toString(arr) : arr배열을 문자열로 변환
        System.out.println( Arrays.toString(arr)); //디벙깅 용도

        //Arrays.sort(arr);
        //System.out.println( Arrays.toString(arr)); //오름차순

        //Arrays.sort(arr, Comparator.reverseOrder()); //내림차순
        //System.out.println( Arrays.toString(arr));

        //val을 찾아보고 몇변째 인덱스에 있는지 배열과 해당 인덱스를 츨력하는 코드를 작성
        //찾았을 때
        //[배열 .....]
        //val :

        //못 찾았을 때
        //[배열.....]

        System.out.println( Arrays.toString(arr));

        int val = rand.nextInt(45) +1;

        boolean find = false;
        for(int i = 0; i<arr.length; i++){
            if(val == arr[i]){
                System.out.printf("val = %d는 인덱스 %d에 있습니다\n", val, i );
                find = true;
                break;
            }

            if (!find) {
                System.out.printf("val = %d는 인덱스 존재하지 않습니다\n", val);
            }
        }

        //순차정렬

        for(int i=0; i<arr.length-1; i++){
            for(int j=i+1; j<arr.length; j++){
                if(arr[i] > arr[j]){
                   int tmp = arr[i];
                       arr[i] = arr[j];
                        arr[j] = tmp;
                }
           }
        }
        //System.out.println( Arrays.toString(arr));
    }
}
