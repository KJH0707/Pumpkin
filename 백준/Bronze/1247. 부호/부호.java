import java.math.BigInteger;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		
		for (int i=0;i<3;i++) {
			int T = in.nextInt();
			BigInteger sum = new BigInteger("0");
			for (int j=0;j<T;j++) {
				BigInteger N= in.nextBigInteger();
				sum=sum.add(N);
			}
			if (sum.compareTo(BigInteger.ZERO)==-1) {
				System.out.println("-");
			}
			else if (sum.compareTo(BigInteger.ZERO)==1) {
				System.out.println("+");
			}
			else {
				System.out.println(0);
			}
		}
	}

}