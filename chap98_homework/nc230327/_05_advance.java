package chap98_homework.nc230327;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import chap98_homework.nc230327.member.Member;

public class _05_advance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Member> memberList = 
				new ArrayList<Member>();
		int cnt = 0;
		
		for(int i = 0; i < 10; i++) {
			Calendar cal = Calendar.getInstance();
			
			cal.set(2022, 3, 2);
			cal.add(Calendar.DATE, -i);
			
			Member member = 
					new Member(i + 1, "id" + (i + 1),
					"홍길동" + i, new Date(cal.getTimeInMillis()));
			
			memberList.add(member);
		}
		
		for(Member mem : memberList) {
			if(mem.getDiffDate() >= 365) {
				mem.setStatus("N");
				cnt++;
			}
			System.out.println(mem);
		}
		
		System.out.println(cnt);
	}

}
