package chap98_homework.nc230316;

public class _05_middle01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = new int[20];
		
		for(int i = 0; i < nums.length; i++) {
			nums[i] = (int)(Math.random() * 101);
			
		}
		
		for(int j = 0; j < nums.length; j++) {
			if(j % 2 == 1) {
				System.out.println(nums[j]);
			} else {
				System.out.println(nums[nums.length - 2 - j]);
			}
		}
	}

}
