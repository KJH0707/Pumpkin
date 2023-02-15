import java.io.*;

public class Main {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String a = br.readLine();
		
		int b = 0;
		int len = a.length();
		
		for (int i=0;i<len;i++) {
			
			char c = a.charAt(i);
			
			if (c=='c' && i<len-1) {
				if (a.charAt(i+1)=='=' || a.charAt(i+1)=='-') {
					i++;
				}
			}
			
			if (c=='d' && i<len-1) {
				if (a.charAt(i+1)=='-') {
					i++;
				}
				
				else if (a.charAt(i+1)=='z' && i<len-2) {
					if (a.charAt(i+2)=='=') {
						i++;
						i++;
					}
				}
			}
			
			if ((c=='l' || c=='n') && i<len-1) {
				if (a.charAt(i+1)=='j') {
					i++;
				}
			}
			
			if ((c=='s' || c=='z') && i<len-1) {
				if (a.charAt(i+1)=='=') {
					i++;
				}
			}
			
			b++;
		}
		
		System.out.println(b);
	}
	
}
