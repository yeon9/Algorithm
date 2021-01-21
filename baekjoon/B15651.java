import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class B15651 {
     /***
      * 문제
      * 자연수 N과 M이 주어졌을 때, 아래 조건을 만족하는 길이가 M인 수열을 모두 구하는 프로그램을 작성하시오.
      
        1부터 N까지 자연수 중에서 M개를 고른 수열, 같은 수를 여러 번 골라도 된다.
     
        입력
        첫째 줄에 자연수 N과 M이 주어진다. (1 ≤ M ≤ N ≤ 7)

        출력
        한 줄에 하나씩 문제의 조건을 만족하는 수열을 출력한다. 중복되는 수열을 여러 번 출력하면 안되며, 각 수열은 공백으로 구분해서 출력해야 한다.

        수열은 사전 순으로 증가하는 순서로 출력해야 한다.
    */
        static int n, m;
        static int[] list;
    
        static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        static void func(int cnt) throws IOException{
            if(cnt == m){
                for(int i=0; i<m; i++){
                    bw.write(String.valueOf(list[i]) + " ");
                }
                bw.write('\n');
                return;
            }
    
            for(int i=0; i<n; i++){
                list[cnt] = i+1;
                func(cnt+1);
            }
        }

    public static void main(String[] args) throws IOException {   
        Scanner scan = new Scanner(System.in);

        n = scan.nextInt();
        m = scan.nextInt();
        
        list = new int[m];

        func(0);

        scan.close();
        bw.close();

    }
}
