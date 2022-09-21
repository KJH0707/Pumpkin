import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int a=in.nextInt();
		int b=in.nextInt();
		int c=in.nextInt();
		int d=in.nextInt();
		
		int x=0;
		int x1=0;
		int y=0;
		int y1=0;
		
		if (a<=c) {
			x=c-a;
			x1=a;
		}
		else {
			x=a-c;
			x1=c;
		}
		
		if (x1<x) {
			x=x1;
		}
		
		if (b<=d) {
			y=d-b;
			y1=b;
		}
		else {
			y=b-d;
			y1=d;
		}
		if (y1<y) {
			y=y1;
		}
		System.out.println((x<y)?x:y);
    }
}