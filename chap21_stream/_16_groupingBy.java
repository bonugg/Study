package chap21_stream;

import chap21_stream.clazz.CreditCard;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class _16_groupingBy {
    public static void main(String[] args) {
        List<CreditCard> cardList = new ArrayList<>();

        cardList.add(new CreditCard("a", "A", 100));
        cardList.add(new CreditCard("b", "B", 300));
        cardList.add(new CreditCard("b", "C", 600));
        cardList.add(new CreditCard("a", "D", 500));
        cardList.add(new CreditCard("c", "E", 800));
        cardList.add(new CreditCard("c", "F", 200));
        cardList.add(new CreditCard("c", "G", 500));

        //groupingBy메소드로 Map<company, List<CreditCard>> 로 매핑
        Map<String, List<CreditCard>> companyCardMap = cardList.stream()
                .collect(Collectors.groupingBy(
                        card -> card.getCompany()
                ));
        System.out.println(companyCardMap);

        //groupingBy메소드로 Map<company, average(limitmoney)>
        Map<String, Double> avLimiMoneyMap = cardList.stream()
                .collect(Collectors.groupingBy(
                        card -> card.getCompany(),
                        Collectors.averagingDouble(
                                card -> card.getLimitMoney()
                        )
                ));
        System.out.println(avLimiMoneyMap);

    }
}
