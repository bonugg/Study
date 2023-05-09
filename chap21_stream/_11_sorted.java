package chap21_stream;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class _11_sorted {
    public static void main(String[] args) {
        List<Integer> intList = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            intList.add((int)(Math.random()*10)+1);
        }
        //오름차순
        intList.stream()
                .sorted()
                .forEach(num -> System.out.print(num + " "));

        System.out.println("");
        //내림차순
        intList.stream()
                .sorted(Comparator.reverseOrder())
                .forEach(num -> System.out.print(num + " "));
    }
}
