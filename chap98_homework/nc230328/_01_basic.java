package chap98_homework.nc230328;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class _01_basic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		1. 멤버변수로 private T t를 가지면서 getT(), setT() 메소드를 갖는 
//		제네릭클래스 GenericCla를 생성하세요.

//		2. public static <T> String add
//		(T t1, T t2) 제네릭 메소드를 정의하고 매개변수로 어떤 값이
//		들어오던 문자열 결합연산이 돼서 스트링값으로 
//		리턴하도록 만드세요.
		System.out.println(
				_01_basic.add(1, 1.3));

//		3. public static Integer add(List<?> list) 
//		와일드 카드를 이용한 list의 요소를 다 더해주는 메소드를 구현하세요.
		List<Double> doubleList = new ArrayList<Double>();
		for(int i = 0; i < 10; i++) {
			doubleList.add(i * 1.3);
		}
		
		System.out.println(_01_basic.add(doubleList));
		
//		4. 어떤 배열이던지 받아서 인덱스가 3의 배수인 요소만 출력하는 메소드 
//		void printArr을 구현하세요.
		Double[] dArr = new Double[5];
		for(int i = 0; i < 5; i++) {
			dArr[i] = i * 1.1;
		}
		
		_01_basic.printArr(dArr);

//		5. Number를 상속받은 클래스타입의 배열만 받아서 배열의 최소값을 구해서 
//		리턴하는 메소드 getMin을 구현하세요.
		System.out.println(getMin(dArr));
		
//		6. Map을 어떤형태로든 받아서 value를 String으로 변경했을 때 
//		길이가 10이상되는 value의 키 값을 출력하는 메소드 
//		void printOverTen을 구현하세요.
		Map<String, Integer> map = 
					new HashMap<String, Integer>();
		
		for(int i = 0; i < 20; i++) {
			map.put(String.valueOf(i), i * 100000000);
		}
		
		_01_basic.printOverTen(map);
	}
	//3.
	public static <T> String add(T t1, T t2) {
		return "" + t1 + t2;
	}
	
	public static Integer add(List<?> list) {
		int sum = 0;
		
		for(Object obj : list) {
			if(obj instanceof Integer ||
				obj instanceof Long) {
				sum += (int)obj;
			} else if(obj instanceof Double || 
					obj instanceof Float) {
				sum += ((Double)obj).intValue();
			} else if(obj instanceof String) {
				sum += Integer.parseInt((String)obj);
			} else {
				sum += Integer.parseInt(obj.toString());
			}
		}
		
		return sum;
	}
	
	//4.
	public static <T> void printArr(T[] tArr) {
		for(int i = 0; i < tArr.length; i++) {
			if(i % 3 == 0) {
				System.out.println(tArr[i]);
			}
		}
	}
	
	public static <T> T getMin(T[] tArr) {
		T min = tArr[0];
		
		for(int i = 1; i < tArr.length; i++) {
			if(min instanceof Integer ||
				min instanceof Long) {
				if((int)min > (int)tArr[i]) {
					min = tArr[i];
				}
			} else if(min instanceof Double || 
					min instanceof Float) {
				if(((Double)min).intValue() > 
						((Double)tArr[i]).intValue()) {
					min = tArr[i];
				}
			} else if(min instanceof String) {
				if(Integer.parseInt((String)min) > 
						Integer.parseInt((String)tArr[i])) {
					min = tArr[i];
				}
			} else {
				if(Integer.parseInt(min.toString()) >
						Integer.parseInt(tArr[i].toString())) {
					min = tArr[i];
				}
			}
		}
		
		return min;
	}
	
	public static <K, V> void printOverTen(Map<K, V> map) {
		for(Entry<K, V> ent : map.entrySet()) {
			if(ent.getValue().toString().length() >= 10) {
				System.out.println(ent.getKey());
			}
		}
	}
}
