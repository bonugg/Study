package chap21_stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class _01_streamForEach {
    static int sum = 0;
    public static void main(String[] args) {
        List<Integer> inList = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            inList.add((int)(Math.random()*10)+1);
        }
        inList.forEach(num -> sum += num);

        Stream<Integer> intStream = inList.stream();
        intStream.forEach(num -> sum += num);
        //하나씩 꺼내서 sum에 더함

        System.out.println("총합 : "+ sum);
    }
}
