import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int T = in.nextInt();
		int sum=0;;
		
		for (int i=0;i<T;i++) {
			int a=in.nextInt();
			sum+=a-1;
		}
		System.out.println(sum+1);

	}

}