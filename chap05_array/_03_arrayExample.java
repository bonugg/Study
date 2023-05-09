package chap05_array;

public class _03_arrayExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] chArr = {'B', 'c', 'T', 'p', 'P', 'i'};
		char[] convertArr = new char[6];
		
		//소문자는 대문자로, 대문자는 소문자로 변경 후 convertArr에 저장
		for(int i = 0; i < chArr.length; i++) {
			if(chArr[i] >= 'A' && chArr[i] <= 'Z') {
				convertArr[i] = (char)(chArr[i] + 32);
			} else {
				convertArr[i] = (char)(chArr[i] - 32);
			}
			
			System.out.print(convertArr[i] + ", ");
		}
		
		
		
		
		
		
		
		
	}

}
