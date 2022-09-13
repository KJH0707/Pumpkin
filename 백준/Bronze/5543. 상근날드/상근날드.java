import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int[] burg= new int[3];
		int[] drink= new int[2];
		
		int a;
		int b=4000;
		
		int i;
		
		for (i=0;i<3;i++) {
			burg[i]=in.nextInt();
		}
		
		for (i=0;i<2;i++) {
			drink[i]=in.nextInt();
		}
		
		for (i=0;i<3;i++) {
			a=burg[i];
			for (int j=0;j<2;j++) {
				if (b>(a+drink[j])-50) {
					b=(a+drink[j])-50;
				}
			}
		}
		System.out.println(b);
	}
}