import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int L = in.nextInt();
		double A = in.nextInt();
		double B = in.nextInt();
		int C = in.nextInt();
		int D = in.nextInt();
		
		
		int n = (A/C<=B/D)?(int)Math.ceil(B/D) : (int)Math.ceil(A/C);
		
		System.out.println(L-n);
	}

}