import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        String a = in.next();
        String b = in.next();
        
        if (a.length() < b.length()) {
            System.out.println("no");
        }
        else {
            System.out.println("go");
        }
    }
}