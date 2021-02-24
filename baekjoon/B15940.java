import java.util.Scanner;

public class B15940 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();
        
        System.out.println(input);
        int u = input.indexOf("U");
        if(u < 0){
            System.out.println("I hate UCPC");
            return;
        }
        input = input.substring(u+1);

        System.out.println(input);
        int c = input.indexOf("C");
        if(c < 0){
            System.out.println("I hate UCPC");
            return;
        }
        input = input.substring(c+1);

        System.out.println(input);
        int p = input.indexOf("P");
        if(p < 0){
            System.out.println("I hate UCPC");
            return;
        }
        input = input.substring(p+1);

        System.out.println(input);
        c = input.indexOf("C");
        if(c < 0){
            System.out.println("I hate UCPC");
            return;
        }

        System.out.println("I love UCPC");
    }
}
