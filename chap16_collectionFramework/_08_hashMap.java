package chap16_collectionFramework;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import chap06_class.car.Car;

public class _08_hashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, String> carMap =
				new HashMap<String, String>();
		
		//key, value의 쌍 저장
		carMap.put("company", "현대");
		carMap.put("model", "소나타");
		carMap.put("color", "검정색");
		carMap.put("price", "4000");
		
		System.out.println(carMap);
		
		//Map에 어떤 데이터가 들어있는지 확인할 때
		//Entry의 Set을 생성하고 Iterator를 꺼내서
		//Key, Value를 하나씩 확인한다.
		Set<Entry<String, String>> carSet = 
						carMap.entrySet();
		System.out.println(carMap);
		System.out.println(carMap.get("company"));
		
		Iterator<Entry<String, String>> it = 
						carSet.iterator();
		
		while(it.hasNext()) {
			Entry<String, String> ent = 
									it.next();
			System.out.println(ent.getKey());
			String key = ent.getKey();
			if(key.equals("company")) {
				ent.setValue("기아");
			}
			System.out.println(ent.getValue());
		}
		
		//value의 형태를 Object로 지정하면
		//어떤 형태의 데이터도 받을 수 있다.
		Map<String, Object> objMap =
					new HashMap<String, Object>();
		
		List<Car> carList = 
						new ArrayList<Car>();
		
		for(int i = 0; i < 5; i++) {
			Car car = 
					new Car("현대", "소나타20" + (10 + i),
							"검정", 3000);
			carList.add(car);
		}
		
		objMap.put("carList", carList);
		/*
		 * list<objMap> : [
		 * 					{
		 * 				carList : [
		 * 							car : {
		 * 
		 * 
		 * 
		 * 								   }
		 * 							car : {
		 * 
		 * 
		 * 
		 * 
		 * 								  }		
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 							]
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 			 },
		 * 			 {
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 			},
		 * 			]
		 * 
		 * 
		 * 
		 * */
//		List<Map<String, String>>
		
		
		
		
		
		
		
		
	}

}
