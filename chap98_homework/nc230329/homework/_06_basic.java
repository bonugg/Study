package chap98_homework.nc230329.homework;

import java.util.Random;
import java.util.Scanner;

public class _06_basic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//        1. 1부터 10까지의 정수를 배열에 저장하고 배열의 모든 요소를 출력하세요.
/*        int[] num = new int[10];
        for (int i = 0; i < 10; i++) {
            num[i] = i+1;
            System.out.print(num[i]+" ");
        }*/



//        2. 사용자가 q를 입력하기 전까지 정수를 입력받아 배열에 저장하고 배열의 모든 요소를 출력하세요.
/*        int cnt = 0;
        int[] arr = new int[100];
        while (true){
            String num = sc.next();
            if(num.equals("q")){
                for (int i = 0; i < arr.length; i++) {
                    if(arr[i] != 0)
                        System.out.print(arr[i]+ " ");
                }
                break;
            } else if (Integer.parseInt(num) == 0) {
                System.out.println("0을 제외하고 입력해주세요.");
                continue;
            }

            arr[cnt] = Integer.parseInt(num);
            cnt++;
        }*/



//        3. 사용자가 입력한 10개의 정수를 배열에 저장하고 평균을 계산하여 출력하세요.
/*        int sum = 0;
        int[] arr = new int[10];
        for (int i = 0; i < 10; i++) {
            int num = sc.nextInt();
            arr[i] = num;
            sum += arr[i];
        }
        System.out.println("평균 : "+sum / 10.0);*/



//        4. 1부터 100까지의 숫자 중에서 짝수만 배열에 저장하고 배열의 합을 계산하여 출력하세요.
/*        int sum = 0;
        int[] arr = new int[100];
        for (int i = 1; i <= 100; i++) {
            if(i % 2 ==0){
                arr[i-1] = i;
                sum += arr[i-1];
            }
        }
        System.out.println(sum);*/



//        5. 사용자가 입력한 10개의 정수를 배열에 저장하고 최소값과 최대값을 찾아서 출력하세요.
/*        int[] num = new int[10];
        for (int i = 0; i < 10; i++) {
            num[i] = sc.nextInt();
        }
        for (int i = 0; i < num.length-1; i++) {
            for (int j = i+1; j <num.length ; j++) {
                if(num[i] > num[j]){
                    int tmp = num[i];
                    num[i] = num[j];
                    num[j] = tmp;
                }
            }
        }
        System.out.println("최솟값 : "+ num[0]);
        System.out.println("최대값 : "+ num[9]);*/



//        6. 사용자가 입력한 5개의 문자열을 배열에 저장하고 길이가 가장 긴 문자열과 길이가 가장 작은 문자열을 출력하세요.
/*        String tmp = "";
        String[] arrst = new String[5];
        for (int i = 0; i < arrst.length; i++) {
            arrst[i] = sc.next();
        }
        for (int i = 0; i < arrst.length-1; i++) {
            for (int j = i+1; j <arrst.length ; j++) {
                if(arrst[i].length() > arrst[j].length()){
                    tmp = arrst[i];
                    arrst[i] = arrst[j];
                    arrst[j] = tmp;
                }
            }
        }
        System.out.println("최솟값 : "+ arrst[0]);
        System.out.println("최대값 : "+ arrst[4]);*/



//        7. 두 개의 정수형 배열을 만들고 1 ~ 100까지의 랜덤한 값으로 첫 번째 배열은 4개 두 번째 배열은 3개를
//        저장하고 두 배열을 합친 새로운 배열을 생성하세요.
/*        Random rand = new Random();
        int cnt = 4;
        int[] num1 = new int[4];
        int[] num2 = new int[3];
        int[] num3 = new int[7];
        for (int i = 0; i < num1.length; i++) {
            num1[i] = rand.nextInt(101)+1;
            System.out.print(num1[i]+ " ");
        }
        System.out.println("");
        for (int i = 0; i < num2.length; i++) {
            num2[i] = rand.nextInt(101)+1;
            System.out.print(num2[i]+ " ");
        }
        System.out.println("");
        for (int i = 0; i < num1.length; i++) {
            num3[i] = num1[i];
        }
        for (int i = 0; i < num2.length; i++) {
            num3[cnt] = num2[i];
            cnt++;
        }
        for (int i = 0; i < num3.length; i++) {
            System.out.print(num3[i]+" ");
        }*/



//        8. 사용자가 문자열을 입력하는데 문자열 사이사이에 -을 넣어 구분자로 만들어준다.
//        -기준으로 잘라진 문자열 배열을 생성하고 잘라진 문자열 중에
//        가장 길이가 긴 문자열의 인덱스와 그 문자열을 출력하세요.
        String str = sc.next();
        String arrstr[] = str.split("-"); //  1  2  3  4  5

        for (int i = 0; i < arrstr.length; i++) {
            int cnt = 0;
            for (int j = 0; j <arrstr.length ; j++) {
                if(arrstr[i].length() > arrstr[j].length()){
                    cnt++;
                    if(cnt == arrstr.length-1){
                        System.out.println(arrstr[i] + " 인덱스 : " + i);
                    }
                }
            }
        }


    }
}
