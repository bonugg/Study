package chap17_generic;

import java.util.ArrayList;
import java.util.List;

import chap17_generic.clazz.Group;
import chap17_generic.clazz.GroupA;
import chap17_generic.clazz.StudyGroup;

public class _05_genericEx02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StudyGroup<Group> stGr = 
					new StudyGroup<Group>();
		List<Group> gList = new ArrayList<Group>(); 
		
		gList.add(new GroupA());
//		gList.add(new GroupB());
//		gList.add(new GroupC());
//		gList.add(new GroupD());
//		gList.add(new GroupE());
//		gList.add(new GroupF());
		
		stGr.setGroupList(gList);
		
		System.out.println(stGr.getCap());
	}	

}
