import java.util.Scanner;

public class B10950 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    
        int n = sc.nextInt();
        int[] sum = new int[n];

        for(int i=0; i<n; i++){
            sum[i] = sc.nextInt() + sc.nextInt();
        }

        for(int idx : sum){
            System.out.println(idx);
        }

        sc.close();
    }
}
