import java.util.Scanner;


public class Main {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String[] strs = new String[in.nextInt()];
		
		int i;
		
		for (i=0;i<strs.length;i++) {
			strs[i]=in.next();
		}
		
		for(i=0;i<strs.length;i++) {
			int cnt=0;
			int sum=0;
			
			for (int j=0;j<strs[i].length();j++) {
			if (strs[i].charAt(j)=='O') {
				cnt++;
			}
			else {
				cnt=0;
			}
			sum+=cnt;
			}
			System.out.println(sum);
		}
	}
}