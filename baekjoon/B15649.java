import java.util.Scanner;

/*
문제
자연수 N과 M이 주어졌을 때, 아래 조건을 만족하는 길이가 M인 수열을 모두 구하는 프로그램을 작성하시오.

1부터 N까지 자연수 중에서 중복 없이 M개를 고른 수열

입력
첫째 줄에 자연수 N과 M이 주어진다. (1 ≤ M ≤ N ≤ 8)

출력
한 줄에 하나씩 문제의 조건을 만족하는 수열을 출력한다. 중복되는 수열을 여러 번 출력하면 안되며, 각 수열은 공백으로 구분해서 출력해야 한다.

수열은 사전 순으로 증가하는 순서로 출력해야 한다.
*/
public class B15649 {
    public static int[] num;
    public static boolean[] isVisit;
    public static int n, m;

    public static void func(int cnt) {
        System.out.println("func("+cnt+")");
        
        System.out.print("num : ");
        for(int idx : num){
            System.out.print(idx + " ");
        }
        System.out.println(" ");
        System.out.print("isVisit : ");
        for(boolean idx : isVisit){
            System.out.print(idx + " ");
        }
        System.out.println(" ");
        

        if(cnt == m){
            for(int i : num){
                System.out.print(i + " ");
            }
            System.out.println(" ");      
            return;
        }
        for(int i=1; i<=n; i++){
            if(isVisit[i])
                continue;

            num[cnt] = i;
            isVisit[i] = true;
            func(cnt+1);
            isVisit[i] = false;
        }
         
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        n = scan.nextInt();
        m = scan.nextInt();

        num = new int[n];
        isVisit = new boolean[n+1];
        
        func(0);

        scan.close();

    }
}
