import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int fCost = in.nextInt();
		int pCost = in.nextInt();
		int sCost = in.nextInt();
		
		int cal =-1;
		
		if (sCost-pCost>0) {
		for (int i=1;;i++) {
			cal = fCost-(sCost-pCost)*i;
			if (cal<0) {
				cal=i;
				break;
				}
			}
		}
		System.out.print(cal);
	}
}