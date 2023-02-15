import java.io.*;

public class Main {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String a = br.readLine();
		
		int b = 0;
		
		for (int i=0;i<a.length();i++) {
			
			switch (a.charAt(i)) {
			case 'A': case 'B': case 'C':
				b+=3; break;
			case 'D': case 'E': case 'F':
				b+=4; break;
			case 'G': case 'H': case 'I':
				b+=5; break;
			case 'J': case 'K': case 'L':
				b+=6; break;
			case 'M': case 'N': case 'O':
				b+=7; break;
			case 'P': case 'Q': case 'R': case 'S':
				b+=8; break;
			case 'T': case 'U': case 'V':
				b+=9; break;
			case 'W': case 'X': case 'Y': case 'Z':
				b+=10; break;
			default:
				b+=11; break;
			}
		}
		System.out.println(b);
	}
	
}
