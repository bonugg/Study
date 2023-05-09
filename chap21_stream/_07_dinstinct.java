package chap21_stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class _07_dinstinct {
    public static void main(String[] args) {
        int[] intArr = {1, 2, 3, 4, 5, 5, 4, 4, 3, 6};
        List<Integer> list = new ArrayList<>();

        IntStream intStream = Arrays.stream(intArr);
        intStream.distinct().forEach(num-> list.add(num));

        System.out.println(list);
    }
}
