package chap21_stream;

import chap21_stream.clazz.CreditCard;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class _08_mapToInt {
    public static void main(String[] args) {
        List<CreditCard> cardList = new ArrayList<>();

        for (int i = 1; i <= 10; i++) {
            cardList.add(new CreditCard("회사"+i, "카드"+i, 100*i));
        }
        Stream<CreditCard> cardStream = cardList.stream();
        IntStream limitStream = cardStream.mapToInt(card -> card.getLimitMoney());
        //limitStream.forEach(money -> System.out.print(money+" "));

        //합
        //System.out.println(limitStream.sum());

        System.out.println(limitStream.average().getAsDouble());

    }
}
