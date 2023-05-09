package chap15_usefulClass;

public class _07_stringBuffer02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer sb1 = new StringBuffer(100);
		StringBuffer sb2 = new StringBuffer("bitcamp");
		
		
//		sb2 = sb2.append("hello");
//		System.out.println(sb2.capacity());
//		for(int i = 0; i < sb2.capacity() - sb2.length(); i++) {
//			sb2 = sb2.append("a");
//		}
//		System.out.println(sb2);
		System.out.println(sb2.capacity());
		
		sb1.append("navercloud");
		
		//capacity()와 length()의 차이점
		System.out.println(sb1.capacity());
		System.out.println(sb1.length());
		
		//delete()와 insert()
		StringBuffer sb3 = sb2.delete(3, 7);
		System.out.println(sb3);
		
		sb3 = sb3.insert(3, "camp");
		System.out.println(sb3);
		
		//reverse()
		sb1 = sb1.reverse();
		System.out.println(sb1);
		
		//setCharAt()
		sb3.setCharAt(3, 'C');
		System.out.println(sb3);
		
		//setLength()
		sb3.setLength(10);
		System.out.println(sb3);
	}

}
