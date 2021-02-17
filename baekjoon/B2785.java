import java.util.Arrays;
import java.util.Scanner;

public class B2785 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    int[] chains = new int[n];    

    for(int i=0; i<n; i++){
      chains[i] = sc.nextInt();
    }
    
    int cnt=0, idx = 0;

    Arrays.sort(chains);
    n--;
    while(idx<n){
      if(chains[idx] == 0) idx++;
      if(idx == n && idx != 0) break;
      chains[idx]--;
      n --;
      cnt++;
    //  System.out.println("idx : " + idx + " n : " + n + " cnt : " + cnt);
    }

    System.out.println("cnt : "+ cnt);

    sc.close();
  }  
}
