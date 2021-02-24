import java.util.Scanner;

public class B2839 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int sugar = sc.nextInt();
        int carrier = 0;

        while(true) {
            if (sugar % 5 ==0) {
                System.out.println(sugar/5 + carrier);
                break;
            }else if(sugar <= 0) {
                System.out.println(-1);
                break;
            }
            sugar = sugar-3;
            carrier++;
        }
    }
}