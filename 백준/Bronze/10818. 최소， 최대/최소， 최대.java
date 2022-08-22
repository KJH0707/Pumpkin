import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int a = in.nextInt();
        int[] b = new int[a];
        int max=-1000001;
        int min=1000001;
        
        
        for (int i=0;i<a;i++) {
            b[i]=in.nextInt();
        }
        

         for (int i=0;i<a;i++) {
        	if (max<b[i]) {
        		max=b[i];
        	}
        	if (b[i]<min) {
        		min = b[i];
        	}
        }
        
        
        
        System.out.println(min+" "+max);
        
        
    }
}