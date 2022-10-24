import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int[] nums = new int[30];
		int num = 31;
		int num2=31;
		
		for (int i=1;i<=30;i++) {
			nums[i-1]=i;
		}
		
		for (int i=0;i<28;i++) {
			nums[in.nextInt()-1]=0;
		}
		
		for (int i=0;i<30;i++) {
			if (nums[i]!=0 & num>nums[i]) {
				num=nums[i];
			}
			else if (nums[i]!=0) {
				num2=nums[i];
			}
		}
		System.out.println(num);
		System.out.println(num2);
	}

}