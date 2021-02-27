import java.util.Scanner;

public class B16533 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] cards = new int[n];

        for(int i=0; i<n; i++){
            cards[i] = sc.nextInt();
        }
        
        int pile = n;
        for(int i=1; i<n; i++){
            if(cards[i-1] >= cards[i]){
                pile = pile-1;
            }
        }
        System.out.println(pile);
    }
}
