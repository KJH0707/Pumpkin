import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int[] a = { in.nextInt(), in.nextInt(), in.nextInt(), in.nextInt()
        		, in.nextInt(), in.nextInt(), in.nextInt(), in.nextInt()
        		,in.nextInt(), in.nextInt()}; //10개
        int[] remainder = new int[10];
        int count = 1;
        int sameNnum =0;
        
        for (int i=0;i<10;i++) {
            remainder[i]=a[i]%42;
        }
        
        Arrays.sort(remainder);

        for (int i=0;i<9;i++) {
        	if  (remainder[i]!=remainder[i+1]) {
        		sameNnum=remainder[i+1];
        		count++;
        		}
        	}
        System.out.println(count);
    }
}