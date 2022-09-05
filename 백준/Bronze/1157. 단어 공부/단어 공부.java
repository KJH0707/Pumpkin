import java.util.Scanner;



public class Main {
	public static void main(String[] args) {
    	Scanner in = new Scanner(System.in);
    	
    	int[] arr = new int[26];
    	String a = in.next();
    	
    	for (int i=0;i<a.length();i++) {
    		
    		if ('a'<=a.charAt(i) & a.charAt(i)<='z') {
    			arr[a.charAt(i)-'a']++;
    		}
    		else {
    			arr[a.charAt(i)-'A']++;
    		}
    	}
    	
    	int max=-1;
    	char ch='?';
    	
    	for (int i=0;i<26;i++) {
    		if (max<arr[i]) {
    			max=arr[i];
    			ch = (char)(i+65);
    		}
    		else if (max==arr[i]) {
    			ch='?';
    		}
    	}
    	System.out.print(ch);
    }
}