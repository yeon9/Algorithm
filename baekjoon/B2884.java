import java.util.Scanner;

public class B2884 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int h = scan.nextInt();
        int m = scan.nextInt();

        if(m-45 < 0){
            if(h == 0)  h = 23;
            else h = h-1;
            
            m = m-45+60;
        }
        else{
            m = m-45;
        }
        System.out.print(h + " " + m);

        scan.close();
    }
}
