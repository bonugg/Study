package chap98_homework.nc230410;

public class _01_codingtest {
    public static void main(String[] args) {
        int a = 2;
        int b = 1;

        String[] day_of_week = {"SUN","MON","TUE","WED","THU","FRI","SAT"};
        int[] month = {31,29,31,30,31,30,31,31,30,31,30,31};
        int total = 0;

        if(a < 1 || a > 12){
            System.out.println("월을 다시 입력해주세요.");
        }else {
            if(b < 1 || b > month[a-1])
                System.out.println("일을 다시 입력해주세요");
            else {
                for (int i = 0; i < a; i++) {
                    total = total + month[i];
                }
                int day = (total +b+1)% 7;
                System.out.println(day);
                System.out.println(day_of_week[day]);
            }
        }
    }
}
