package chap98_homework.nc230328;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import chap98_homework.nc230328.clazz.Calculator;

public class _02_middle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		
		map.put(10, 20);
		map.put(100, 200);
		map.put(10000, 2);
		map.put(1000, 2009);
		map.put(100, 20000);
		
		System.out.println(getMaxMul(map));
		
		map.clear();
		
		for(int i = 0; i < 5; i++) {
			map.put(i, i);
		}
		printKVDesc(map);
		
		Calculator<Double> calc = 
			new Calculator<Double>(15.13, 11.99);
		System.out.println(calc.add());
		System.out.println(calc.sub());
		System.out.println(calc.mul());
		System.out.println(calc.div());
	}
//	1. key와 value 모두 Number를 상속받은 클래스의 타입을 가지고 key, value의 곱이 가장 큰
//    Entry를 리턴하는 메소드 getMaxMul을 구현하세요.
	public static <K extends Number, V extends Number> 
	Entry<K, V> getMaxMul(Map<K, V> map) {
		Entry<K, V> maxEntry = null;
		Number num = null;
		
		int index = 0;
		
		for(Entry<K, V> ent : map.entrySet()) {
			if(index == 0) {
				num = ent.getKey().doubleValue() * ent.getValue().doubleValue();
				maxEntry = ent;
			} else {
				if(num.doubleValue() < 
						ent.getKey().doubleValue() 
						* ent.getValue().doubleValue()) {
					num = ent.getKey().doubleValue() 
							* ent.getValue().doubleValue();
					maxEntry = ent;
				}
			}
			
			index++;
		}
		
		return maxEntry;		
	}
	
//	2. Map을 매개변수로 받아서 key는 정순 출력, value는 역순 출력하는 printKVDesc라는 제네릭 메소드를
//	   구현하세요.
	public static <K, V> void printKVDesc(Map<K, V> map) {
		List<Entry<K, V>> entList = 
					new ArrayList<Entry<K, V>>();
		
		for(Entry<K, V> ent : map.entrySet()) {
			entList.add(ent);
		}
		
		for(int i = 0; i < entList.size(); i++) {
			System.out.println(
					entList.get(i).getKey() 
					+ " : " 
					+ entList.get(entList.size() - (i + 1)).getValue());
		}
	}
}
