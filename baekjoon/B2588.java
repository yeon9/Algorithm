import java.util.Scanner;

public class B2588 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a, b;
        int hun, ten, one;
        a = scan.nextInt();
        b = scan.nextInt();
       
        hun = b/100;
        ten = b/10 - hun*10;
        one = b - hun*100 - ten*10;
        System.out.println(a*one);
        System.out.println(a*ten);
        System.out.println(a*hun);
        System.out.println(a*one + a*ten*10 + a*hun*100);
        scan.close();
    }
}
