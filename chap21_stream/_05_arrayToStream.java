package chap21_stream;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class _05_arrayToStream {
    public static void main(String[] args) {
        int[] intArr = new int[10];

        System.out.print("변경 전 : ");
        for (int i = 0; i < 10; i++) {
            intArr[i] = (int) (Math.random() * 10) + 1;
            System.out.print(intArr[i]+" ");
        }

        System.out.print("\n변경 후 : ");
//      IntStream intStream = Arrays.stream(intArr);
//      IntStream fiveStream = intStream.filter(num -> num >= 5);
//      IntStream fourStream = fiveStream.map(num -> num * 4);
//      fourStream.forEach(map -> System.out.print(map + " "));
        Arrays.stream(intArr).filter(num-> num >=5)
                .map(num -> num * 4)
                .forEach(map-> System.out.print(map+ " "));
    }
}
