import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		while(true) {
			String num = in.next();
			int cnt=0;
			
			if (num.equals("0")) break;
			
			for (int i=0;i<num.length();i++) {
				
				if (num.charAt(i)=='0') cnt+=5;
				else if (num.charAt(i)=='1') cnt+=3;
				else cnt+=4;
			}
			System.out.println(cnt+1);
		}
	}
}