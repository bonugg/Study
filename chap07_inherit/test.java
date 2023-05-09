package chap07_inherit;

import chap07_inherit.car.Car;
import chap07_inherit.car.HyundaiCarInherit;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car car = new HyundaiCarInherit();
		
		car.carInfo();
		car.speedDown();
	}

}
