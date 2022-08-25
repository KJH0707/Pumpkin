import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int[] nums = new int[in.nextInt()];
		int count=0;
		
		for (int i=0;i<nums.length;i++) {
			nums[i]=in.nextInt();
		}
		
		int v = in.nextInt();
		
		for (int i=0;i<nums.length;i++) {
			if (nums[i]==v) {
				count++;
			}
		}
		System.out.println(count);
    }
}
