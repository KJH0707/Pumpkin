import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int inNum = in.nextInt();
		int num = 0;
		int cnt=1;
		
		while (inNum>num) {
			num+=cnt;
			cnt++;
		}
		
		if (cnt%2==0) {
			System.out.println((num-inNum+1)+"/"+(cnt-num%inNum-1));
    }
		else {
			System.out.println((cnt-num%inNum-1)+"/"+(num-inNum+1));
    }
	}
}
