package chap17_generic;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class _03_limitedGeneric {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Long> lList = 
						new ArrayList<Long>();
		
		for(int i = 0; i < 10; i++) {
			lList.add((long)5 * i);
		}
		
		System.out.println(_03_limitedGeneric.
										<Long>sumList(lList));
		
		List<Number> numList = 
					new ArrayList<Number>();
		
		for(int i = 0; i < 10; i++) {
			numList.add((Integer)3 * i);
		}
		
		System.out.println(_03_limitedGeneric.max(numList));
		
		Map<String, Integer> map = 
				new HashMap<String, Integer>();
		
		for(int i = 0; i < 10; i++) {
			map.put(String.valueOf(i), 
					Integer.valueOf(
							(int)(Math.random() * 100) + 1)
					);
			System.out.println(
				map.get(String.valueOf(i))
			);
		}
		
		System.out.println(
			_03_limitedGeneric.maxKey(map)
		);
	}
	
	//리스트를 받아서 리스트 요소의 합계를 리턴
	public static <T extends Number> double 
	sumList(List<T> tList) {
		double sum = 0.0;
		
		for(T t : tList) {
			sum += t.doubleValue();
		}
		
		return sum;
	}
	
	//와일드카드는 매개변수로만 사용가능하다.
	public static int 
	max(List<? super Integer> list) {
		int max = (int) list.get(0);
		
		for(int i = 1; i < list.size(); i++) {
			if((int)list.get(i) > max) {
				max = (int)list.get(i);
			}
		}
		
		return max;
	}
	
	public static <K, V extends Number> 
	int sumMapValue(Map<K, V> map) {
		int sum = 0;
		
		for(V v : map.values()) {
			sum += (int)v;
		}
		
		return sum;
	}
	
	//Map의 value의 맥스값을 찾고 해당 키값을 리턴하는 메소드
	public static <K, V extends Number> 
	K maxKey(Map<K, V> map) {
		//map의 형태
		/*
		 * {
		 * 	  "a" : 1,
		 * 	  "b" : 2,
		 * 	  "c" : 3
		 * 		...
		 * }
		 * 여기서 하나의 Entry<K, V> 꺼내면
		 * "a" : 1
		 *	map.entrySet()
		 *  => {
		 *  		{a: 1},
		 *  		{b: 2}
		 *  
		 *  
		 *     }
		 * */
		K maxkey = null;
		V maxval = null;
		
		int index = 0; 
		for(Entry<K, V> ent : map.entrySet()) {
			if(index == 0) {
				maxkey = ent.getKey();
				maxval = ent.getValue();
			} else {
				if(ent.getValue().doubleValue() 
						> maxval.doubleValue()) {
					maxkey = ent.getKey();
					maxval = ent.getValue();
				}
			}
			
			index++;
		}
		
		
		return maxkey;
	}
	
	public int add(List<?> inList) {
		return 1;
	}
	
	
	
}
