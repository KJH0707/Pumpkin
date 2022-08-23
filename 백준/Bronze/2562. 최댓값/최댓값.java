import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
       
        int[] b = new int[9];
        int maxIdx = 0;
        int max = 0;
        
        for (int i=0;i<9;i++) {
            b[i]=in.nextInt();
        }
        

         for (int i=0;i<9;i++) {
        	if (max<b[i]) {
        		maxIdx=i+1;
        		max=b[i];
        	}
        }
        
        
        
        System.out.println(max);
        System.out.println(maxIdx);
        
        
    }
}