import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    	Scanner in = new Scanner(System.in);
    	
    	int N = in.nextInt();
    	int cnt=0;
    	int copy=N;
    	
    	in.close();
    	do {
    		N = ((N%10)*10)+(((N/10)+(N%10))%10);
    		cnt++;
    	} while (N!=copy);
        
    	System.out.println(cnt);
    }
}
