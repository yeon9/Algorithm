import java.io.Console;
import java.util.Scanner;

public class B18238 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input = sc.next();

        char[] zoac = input.toCharArray();

        int now=65;
        int sum=0;

        for(int i=0; i<zoac.length; i++){            
            int left = Math.abs(zoac[i]-now);
            int right = 26- Math.abs(zoac[i]-now);
            
            now = zoac[i];
            sum += (left>=right)? right : left;
        }

        System.out.println(sum);
    }
    
}
