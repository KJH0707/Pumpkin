import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int si = in.nextInt();
		int min = in.nextInt();
		int sec = in.nextInt();
		
		int mT = in.nextInt();
		
		min+=(mT/60);
		sec+=(mT%60);
		
		if (sec>59) {
			min+=(sec/60);
			sec=sec%60;
		}
		if(min>59) {
			si+=(min/60);
			min=min%60;
		}
		if(si>23) {
			si=si%24;
		}
		System.out.println(si+" "+min+" "+sec);
		
	}
}