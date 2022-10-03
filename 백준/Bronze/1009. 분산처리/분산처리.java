import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int T = in.nextInt();
		
		for(int i=0;i<T;i++) {
			int num = in.nextInt();
			int squared = in.nextInt();
			int T2=1;
			int fNum=1;
			
			if (num%10==1 | num%10==0 | num%10==5 | num%10==6) {
				fNum=num%10;
			}
			else if (num%10==4|num%10==9) {
				T2=squared%2;
				if (T2==0) T2=2;
			}
			else {
				T2=squared%4;
				if (T2==0) T2=4;
			}
			for (int j=0;j<T2;j++) {
				fNum*=num;
				fNum%=10;
			}
			if (fNum==0) fNum=10;
			System.out.println(fNum);
		}
		in.close();
	}
}
