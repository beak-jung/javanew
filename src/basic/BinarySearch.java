package basic;

import java.util.Random;
import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = new int[100];
        Random rand = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt(1000);
        }
        System.out.println(Arrays.toString(arr));

        // 정렬
        //Arrays.sort( arr );

        //버블 정렬 알고리즘 이용하여 배열을 정렬하세요.
//        for(int i=arr.length-1; i>=0; i--) {
//            for (int j = i - 1; j < arr.length; j++) {
//                if (arr[i] > arr[j]) {
//                    int tmp = arr[i];
//                    arr[i] = arr[j];
//                    arr[j] = tmp;
//                }
//            }
//        }

        //배열 줄력
        System.out.println(Arrays.toString(arr));

        int val = rand.nextInt(1000); //찾을 값을 랜덤하게 설정

        //이진 탐색
        int start = 0; //배열에 시작 인덱스
        int end = arr.length - 1; //배열의 마지막 인덱스

        int count = 0;

        boolean flag = false;
        while (start <= end) {
            count++;
            int mid = (end - start) / 2 + start; //현재 배열에 가운데 인덱스
            System.out.printf("mid ; %d\n", mid);
            if (arr[mid] == val) {
                System.out.printf("%d는 배열의 %d에 있습니다.\n", val, mid);
                System.out.printf("%d의 값을 찾았습니다.\n", count);
                flag = true;
                break;
            }

            if (arr[mid] > val)
                end = mid - 1;
            else
                start = mid + 1;
            }

            if (!flag) {
                System.out.printf("%d번 반복 수행함\n", count);
                System.out.printf("%d를 찾지 못했습니다\n", val);
            }

        }
    }
