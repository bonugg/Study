package chap22_io.clazz;

import java.io.Serializable;

//직렬화가 가능하도록 Serializable 인터페이스를 상속
//직렬화와 역직렬화가 일어날 때 사용되는 클래스는 동일한 클래스야애 한다.
public class Car implements Serializable {
    //직렬화할 때 SerialVersionUID 값을 설정해서
    //역직렬화할 때도 같은 클래스를 사용할 수 있도록 구분자를 넣어준다.
    private String company;
    private String model;
    private double maxSoeed;
    private int price;
    //직렬화에서 제외하고 싶은 멤버변수는
    //타입 앞에 transient 키워드를 붙여준다.
    public Car(String company, String model, double maxSoeed, int price) {
        this.company = company;
        this.model = model;
        this.maxSoeed = maxSoeed;
        this.price = price;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getMaxSoeed() {
        return maxSoeed;
    }

    public void setMaxSoeed(double maxSoeed) {
        this.maxSoeed = maxSoeed;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Car{" +
                "company='" + company + '\'' +
                ", model='" + model + '\'' +
                ", maxSoeed=" + maxSoeed +
                ", price=" + price +
                '}';
    }
}
