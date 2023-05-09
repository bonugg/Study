package chap98_homework.nc230405.clazz;

public class Card {
    //6. 클래스 Card를 만들고 String cardName; int validYear;
    // 멤버변수를 생성하고 getter/setter 및 유효기간을 연장하는 void validEnlong을 만듭니다.
    private String cardName;
    private int validYear;

    public Card(){}

    public Card(String cardName, int validYear){
        this.cardName = cardName;
        this.validYear = validYear;
    }

    public String getCardName() {
        return cardName;
    }

    public void setCardName(String cardName) {
        this.cardName = cardName;
    }

    public int getValidYear() {
        return validYear;
    }

    public void setValidYear(int validYear) {
        this.validYear = validYear;
    }

    public void validEnlong(int validYear, CardVali cv){
        this.validYear += validYear;
        cv.enlong(this.validYear);
    }
}
