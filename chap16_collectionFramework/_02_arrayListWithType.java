package chap16_collectionFramework;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import chap06_class.car.Car;

public class _02_arrayListWithType {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//타입을 지정한 ArrayList 선언
		//선언부와 생성자부분에 <>를 이용해서 타입을 지정
		ArrayList<String> strArrList = 
					new ArrayList<String>();
		/*
		 * [
		 * 		{
		 * 			company: "현대",
		 * 			model: "아반떼"
		 * 			price: 3000
		 * 			메소드
		 *  	},
		 *  	{
		 * 			company: "기아",
		 * 			model: "k7"
		 * 			price: 4000
		 * 			메소드
		 *  	},
		 * 		.....
		 * 
		 * ]
		 */
		ArrayList<Car> carArrList = 
					new ArrayList<Car>();
		
		Car car = new Car("현대", "아반떼", "검정", 3000);
		carArrList.add(car);
		
		Car car2 = new Car("기아", "k7", "검정", 4000);
		carArrList.add(car2);
		
		for(int i = 0; i < carArrList.size(); i++) {
			System.out.println(carArrList.get(i));
			carArrList.get(i).carInfo();
		}
		
		//mapList는 위의 객체 ArrayList와 형태는 같다.
		//하지만 메소드는 추가할 수 없다.
		ArrayList<Map<String, String>> mapList =
				new ArrayList<Map<String, String>>();
		for(int i = 0; i < 10; i++) {
			Map<String, String> map = 
					new HashMap<String, String>();
			
			map.put("company", "현대");
			map.put("model", "아반떼20" + (10 + i));
			map.put("price", "3000");
			
			mapList.add(map);
		}
		
		for(int i = 0; i < mapList.size(); i++) {
			System.out.println(mapList.get(i));
		}
		
		//인터페이스를 이용해서 다형성 구현도 가능
		List<String> list = 
					new ArrayList<String>();
		list = new LinkedList<String>();
		
		
		
		
		
	}

}
