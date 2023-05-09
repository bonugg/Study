package chap21_stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

public class _10_flatMap {
    public static void main(String[] args) {
        //{{1, 2}, {3, 4}, {5, 6}}
        //Stream<int[]>
        //Stream<Stream> .flatMap => Stream<Integer>
        int[][] intArr = {{1, 2}, {3, 4}, {5, 6}};

        Arrays.stream(intArr)
                //.flatMapToInt(arr -> Arrays.stream(arr))
                .flatMapToInt(Arrays :: stream)
                 //.map(num -> num * 3)
                .forEach(num -> System.out.print(num));
    }
}