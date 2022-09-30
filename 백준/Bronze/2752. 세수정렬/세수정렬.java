import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
    	Scanner in = new Scanner(System.in);
    	
    	int a = in.nextInt();
    	int b = in.nextInt();
    	int c = in.nextInt();
    	
    	int first = (a<b)?((a<c)?a:c):(b<c)?b:c;
    	int second = (a<b)?((b<c)?b:(a<c)?c:a):((a<c)?a:(b>c)?b:c);
    	int third = (a>b)?((a>c)?a:c):(b>c)?b:c;
    	
    	System.out.printf("%d %d %d",first,second,third);
	}
}