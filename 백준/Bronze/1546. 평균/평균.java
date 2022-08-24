import java.util.Arrays;
import java.util.Scanner;


public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int num = in.nextInt();
		double[] nums = new double[num];
		double[] nums2 = new double[num];
		double sum = 0;
		
		for (int i=0;i<num;i++) {
			nums[i] = in.nextInt();
		}
		
		Arrays.sort(nums);
		
		for (int i=0;i<num;i++) {
			nums2[i]=(nums[i]/nums[num-1])*100;
			sum+=nums2[i];
		} 
		System.out.println(sum/num);
		}
}