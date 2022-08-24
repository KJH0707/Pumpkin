import java.util.Arrays;
import java.util.Scanner;


public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		double[] nums = new double[in.nextInt()];
		double sum = 0;
		
		for (int i=0;i<nums.length;i++) {
			nums[i] = in.nextInt(); // int로 받는게 좀 더 빠름. 어차피 배열에 들어갈때 double로 변환. (100ms 차이)
		}
		
		Arrays.sort(nums);
		
		for (int i=0;i<nums.length;i++) {
			sum+=(nums[i]/nums[nums.length-1])*100;
		} 
		System.out.println(sum/nums.length);
    }
}
