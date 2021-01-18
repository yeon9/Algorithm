import java.util.Scanner;

public class B1008 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a, b;

        a = scan.nextInt();
        b = scan.nextInt();

        System.out.println((double)a/b);

        scan.close();
    }
}
