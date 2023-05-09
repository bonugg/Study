package chap21_stream;

import java.util.Arrays;

public class _14_mathMethod {
    public static void main(String[] args) {
        int[] intArr = {1,2,3,4,5,6,7,8,9,10};

        long cnt = Arrays.stream(intArr).count();
        System.out.println(cnt);

        int first = Arrays.stream(intArr).findFirst().getAsInt();
        System.out.println(first);

        int max = Arrays.stream(intArr).max().getAsInt();
        System.out.println(max);

        int min = Arrays.stream(intArr).min().getAsInt();
        System.out.println(min);

        int sum = Arrays.stream(intArr).sum();

        double avg = Arrays.stream(intArr).average().getAsDouble();
        System.out.println(sum +" " +avg);
    }
}
