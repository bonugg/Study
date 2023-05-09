package chap21_stream.clazz;

public class CreditCard {
    private String company;
    private String cardName;
    private int limitMoney;

    public CreditCard(String company, String cardName, int limitMoney){
        this.company = company;
        this.cardName = cardName;
        this.limitMoney = limitMoney;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public int getLimitMoney() {
        return limitMoney;
    }

    public void setLimitMoney(int limitMoney) {
        this.limitMoney = limitMoney;
    }

    public String getCardName() {
        return cardName;
    }

    public void setCardName(String cardName) {
        this.cardName = cardName;
    }

    @Override
    public String toString() {
        return "CreditCard{" +
                "company='" + company + '\'' +
                ", cardName='" + cardName + '\'' +
                ", limitMoney=" + limitMoney +
                '}';
    }
}
