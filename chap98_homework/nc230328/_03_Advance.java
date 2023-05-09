package chap98_homework.nc230328;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import chap98_homework.nc230328.clazz.Group;
import chap98_homework.nc230328.clazz.GroupA;
import chap98_homework.nc230328.clazz.GroupB;
import chap98_homework.nc230328.clazz.GroupC;
import chap98_homework.nc230328.clazz.GroupD;
import chap98_homework.nc230328.clazz.GroupE;
import chap98_homework.nc230328.clazz.GroupF;
import chap98_homework.nc230328.clazz.StudyGroup;

public class _03_Advance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StudyGroup<Group> stGroup = 
				new StudyGroup<Group>();
		
		List<Group> groupList = 
				new ArrayList<Group>();
		
		int idx = 1;
		for(int j = 0; j < 6; j++) {
			Map<String, String> memberMap = 
							new HashMap<String, String>();
			
			for(int i = 0; i < 5; i++) {
				if(i == 0) {
					memberMap.put(String.valueOf(idx++), "조장");
				} else {
					memberMap.put(String.valueOf(idx++), "조원");
				}
			}
			
			Group gr = getGroupInstance(j, memberMap);
			groupList.add(gr);
		}
		stGroup.settList(groupList);
		
		List<Entry<String, String>> entList 
							= stGroup.getCaptins();
		
		System.out.println(entList);
	}
	
	public static Group getGroupInstance(int idx, Map<String, String> map) {
		Group gr = new Group();//값이라고 생각
		//20230329제조 = new 부품();
		//int[] intArr = new int[10];
		
//		int a = "aaa";
//		
//		String str = new String();
//		
//		
//		= new String("ㅁㅁㅁ");
//		str.charAt(idx);
//		
//		Integer intval;
		
		
		
		switch(idx) {
			case 0 :
				gr = new GroupA(map);
				break;
			case 1 :
				gr = new GroupB(map);
				break;
			case 2 :
				gr = new GroupC(map);
				break;
			case 3 :
				gr = new GroupD(map);
				break;
			case 4 :
				gr = new GroupE(map);
				break;
			case 5 :
				gr = new GroupF(map);
				break;
			default :
				gr = null;
				break;
		}
		
		return gr;
	}
}
