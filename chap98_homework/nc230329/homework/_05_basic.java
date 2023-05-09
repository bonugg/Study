package chap98_homework.nc230329.homework;

import java.util.Scanner;

public class _05_basic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//      1. 1부터 10까지의 정수의 합을 출력하세요.
/*      int sum=0;
        for (int i = 1; i <= 10; i++) {
            sum += i;
        }
        System.out.println(sum);*/



//      2. 2의 거듭제곱을 10회동안 반복하며 출력하세요.(2 * 2 = 4, 2 * 2 * 2 = 8 .....) 10회 반복 출력
       /* int sum = 2;
        for(int i=1;i<=10;i++){
            for(int j=0;j<i;j++){
                System.out.print("2 * ");
            }
            sum *= 2; //sum = sum * 2
            System.out.print("2 = " + sum);
            System.out.println("");
        }*/



//      3. 사용자가 입력한 정수까지의 모든 소수를 출력하세요.
/*      int num = sc.nextInt();
        for (int i = 1; i <=num ; i++) {
            int cnt = 0;
            for (int j = 1; j <=num ; j++) {
                if(i%j==0){
                    cnt++;
                }
            }
            if(cnt == 2){
                System.out.println(i);
            }
        }*/



//      4. 사용자가 입력한 정수의 약수를  출력하세요.
/*      int num = sc.nextInt();
        for (int i = 1; i <= num; i++) {
            if(num%i==0){
                System.out.println(i);
            }
        }*/



//      5. 사용자가 입력한 10개의 정수를 역순으로 출력하세요.(배열 사용)
/*      int[] num = new int[10];
        for (int i = 0; i < num.length; i++) {
            num[i] = sc.nextInt();
        }

        for (int i = num.length-1; i >=0; i--) {
            System.out.print(num[i]+" ");
        }*/



//      6. 사용자가 입력한 문자열을 역순으로 출력하세요.
/*      String str= sc.next();
        char[] arr = new char[str.length()];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = str.charAt(i);
        }

        for (int i = arr.length-1; i >= 0; i--) {
            System.out.print(arr[i]+ " ");
        }*/



//      7. 사용자가 입력한 두 정수의 최소공배수 출력하세요.
/*      int num1= sc.nextInt();
        int num2 = sc.nextInt();
        int cnt = 0;

        int[] arr1 = new int[100];
        int[] arr2 = new int[100];
        for (int i = 1; i < arr1.length; i++) {
            arr1[i] = num1 * i;
        }
        for (int i = 1; i < arr2.length; i++) {
            arr2[i] = num2 * i;
        }

        for (int i = 0; i < arr1.length; i++) {
            if(cnt == 1){
                break;
            }
            for (int j = 0; j < arr2.length; j++) {
                if(arr1[i] == arr2[j] && arr1[i] != 0) {
                    System.out.println("최소공배수 : " + arr2[j]);
                    cnt++;
                    break;
                }
            }
        }*/



//      7. 사용자가 입력한 두 정수의 최소공배수와 최대공약수를 출력하세요.
/*      int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        int min = (num1 < num2) ? num1 : num2;
        int gcd = 0;
        for (int i = 1; i <= min; i++) {
            if (num1 % i == 0 && num2 % i == 0)
                gcd = i;
        }
        System.out.println("최대공약수 : " + gcd);
        System.out.println("최소공배수 : " + num1 * num2 / gcd);*/



//      8. 중첩 for문으로 이용해서 다음과 같이 출력하세요.
//      *
//      **
//      ***
//      ****
//      *****
/*      for (int i = 1; i <= 5; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }*/



//     *****
//      ****
//       ***
//        **
//         *
/*      for (int i = 1; i <= 5; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int j = i; j <= 5; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }*/



//      9. 사용자가 q를 입력하기 전까지 계속 반복하면서 입력한 정수의 값을 더해서 출력하세요.
/*      int sum = 0;
        while (true){
            String str = sc.next();
            if(str.equals("q")){
                break;
            }
            int num = Integer.parseInt(str);
            sum += num;
            System.out.println(sum);
        }*/
    }
}
