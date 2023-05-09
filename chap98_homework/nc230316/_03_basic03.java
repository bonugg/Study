package chap98_homework.nc230316;

public class _03_basic03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = new int[10];
		
		for(int i = 0; i < nums.length; i++) {
			nums[i] = (int)(Math.random() * 10) + 1;
		}
		
		for(int num : nums) {
			if(num % 2 == 1) {
				System.out.println(num);
			}
		}
	}

}
