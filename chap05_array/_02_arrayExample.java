package chap05_array;

public class _02_arrayExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = new int[10];
		
		//1씩 증가하면서 3의배수인지 검사될 변수
		//3의 배수면 nums배열에 저장
		int num = 0;
		
		//3의 배수를 nums에 저장할 때마다 1씩증가할 배열의 인덱스
		int index = 0;
		
		while(index < 10) {
			//1부터 3의 배수인지 검사
			num++;
			
			if(num % 3 == 0) {
				//index는 num이 3의 배수일 때만 1씩 증가
				//num = 1, index = 0
				//num = 2, index = 0
				//num = 3, nums[0] = 3, index = 1
				//num = 6, nums[1] = 6, index = 2
				//....
				//num = 30, nums[9] = 30, index = 10
 				nums[index++] = num;
			}
		}
		
		
		
		
		
	}

}
