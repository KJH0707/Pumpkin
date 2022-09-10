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
		int x=0;
		int y=0;
		
		if (cnt%2==0) {
			y = (num-inNum)+1;
			x = cnt-num%inNum-1;
		}
		else {
			x = (num-inNum)+1;
			y = cnt-num%inNum-1;
		}
		
		
		System.out.println(y+"/"+x);
	}
}