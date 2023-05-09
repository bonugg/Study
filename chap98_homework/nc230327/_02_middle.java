package chap98_homework.nc230327;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class _02_middle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		1. 학생이름을 key로 시험점수를 value로 가지는 Map<String, Integer>를 생성하고
//	    4명의 학생 데이터를 입력한 후 4명 중 최고 점을 맞은 학생의 이름과 점수을 출력하세요.
		Map<String, Integer> stMap = 
				new HashMap<String, Integer>();
		stMap.put("홍길동", 50);
		stMap.put("임꺽정", 90);
		stMap.put("조병조", 100);
		stMap.put("고기천", 70);
		
		Set<Entry<String, Integer>> entrySet = 
							stMap.entrySet();
		
		Iterator<Entry<String, Integer>> it = 
						entrySet.iterator();
		
		String name = "";
		int score = 0;
		int cnt = 0;
		
		while(it.hasNext()) {
			Entry<String, Integer> ent = 
									it.next();
			if(cnt > 0) {
				if(ent.getValue() > score) {
					score = ent.getValue();
					name = ent.getKey();
				}
			} else {
				score = ent.getValue();
				name = ent.getKey();
			}
			
			cnt++;
		}
		
		System.out.println(name + " : " + score);

//	    2. 정수 배열 {1, 2, 3, 4, 5}에서 두 수의 합을 
//		구할 때 같은 값이 나오는 개수를 세서 
//		Map<String, Integer>에 담은 후 출력하세요. 
//	    ex) {"3" : 1({1, 2}), 
//		"4" : 1({1, 3}, "5" : 2({1, 4}, {2, 3})
		int[] intArr = {1, 2, 3, 4, 5};
		
		//더해준 값을 담아줄 리스트
		List<Integer> intList = new ArrayList<Integer>();
		
		//출력할 Map
		Map<String, Integer> sumMap = new HashMap<String, Integer>();
		
		for(int i = 0; i < intArr.length; i++) {
			for(int j = i + 1; j < intArr.length; j++) {
				if(j != i) {
					intList.add(
						intArr[i] + intArr[j]
					);
				}
			}
		}
		
		System.out.println(intList);
		
		for(int i = 0; i < intList.size(); i++) {
			int sumCnt = 1;
			
			for(int j = 0; j < intList.size(); j++) {
				if(i != j) {
					if(intList.get(i) == 
							intList.get(j)) {
						System.out.println(
								intList.get(i));
						sumCnt++;
					} 
				}
			}
			
			if(sumCnt > 0)
				sumMap.put(String.valueOf(
						intList.get(i)), sumCnt);
		}
		
		System.out.println(sumMap);
//		3. 16일 숙제였던 PhoneInfo를 List<Map<String, String>>이용하여 재구성하세요.
	}

}
