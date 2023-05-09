package chap21_stream;

import chap21_stream.clazz.CreditCard;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class _15_collect {
    public static void main(String[] args) {
        List<CreditCard> cardList = new ArrayList<>();

        cardList.add(new CreditCard("a", "A", 100));
        cardList.add(new CreditCard("b", "B", 300));
        cardList.add(new CreditCard("c", "C", 600));
        cardList.add(new CreditCard("d", "D", 500));
        cardList.add(new CreditCard("e", "E", 800));
        cardList.add(new CreditCard("f", "F", 200));
        cardList.add(new CreditCard("g", "G", 500));

        //1. 특정 카드사의 카드만 뽑아서
        //   collect로 수집후 리스트로 변환
        List<CreditCard> aCompanyCardList =
                cardList.stream()
                        .filter(card ->
                                card.getCompany().equals("a"))
                        .collect(Collectors.toList());
        System.out.println(aCompanyCardList);

//		for(CreditCard c : cardList) {
//			if(c.getCardName().equals("a")) {
//				aCompanyCardList.add(c);
//			}
//		}

        //2. Map<cardname, limitmoney> 변환
        Map<String, Integer> cardMap =
                cardList.stream()
                        .filter(card ->
                                card.getLimitMoney() >= 500)
                        .collect(
                                Collectors.toMap(
                                        card -> card.getCardName(),
                                        card -> card.getLimitMoney())
                        );
        System.out.println(cardMap);
    }
}
