import java.util.Scanner;

public class B15650 {
    /*** 
         * 문제
         * 자연수 N과 M이 주어졌을 때, 아래 조건을 만족하는 길이가 M인 수열을 모두 구하는 프로그램을 작성하시오.
         * 1부터 N까지 자연수 중에서 중복 없이 M개를 고른 수열
         * 고른 수열은 오름차순이어야 한다.
         * 
         * 입력
         * 첫째 줄에 자연수 N과 M이 주어진다. (1 ≤ M ≤ N ≤ 8)
         */
    static int n, m;
    static int[] list;
    static boolean[] isVisit;

    static void func(int cnt, int index){
        if(cnt == m){
            for(int idx : list){
                System.out.print(idx + " ");
            }
            System.out.println("");
            return;
        }

        for(int i=index; i<n; i++){
            if(isVisit[i])
                continue;
            list[cnt] = i+1;
            isVisit[i] = true;
            func(cnt+1, i);
            isVisit[i] = false;
        }
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        n = scan.nextInt();
        m = scan.nextInt();
        
        list = new int[m];
        isVisit = new boolean[n];

        func(0, 0);

        scan.close();
    }
}
