import java.util.Scanner;

public class B3109 {
    public static int r, c;
    public static boolean[][] map, visit;
    public static int[] direction  = {-1, 0, 1};
    public static int cnt = 0;

    public static boolean recurs(int x, int y){
        visit[x][y] = true;
        if(y == c-1) return true;

        for(int i=0; i<3; i++){ // 대각선 위, 오른쪽, 대각선 아래의 위치를 탐색
            int x_ = x + direction[i];
            int y_ = y + 1;
            if(x_>=0 && x_<r && y_>=0 && y_<c){
                if(!visit[x_][y_] && map[x_][y_]){      // 방문한 곳이 아니고 갈 수 있는 길이면
                    boolean result = recurs(x_, y_);
                    if(result) return result;
                }
            }
        }
        return false;          
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        r = sc.nextInt();
        c = sc.nextInt();

        map = new boolean[r][c];
        visit = new boolean[r][c];

        for(int i=0; i<r; i++){ // 지도를 배열로 표현
            String input = sc.next();
            String[] inputArr = input.split("");

            for(int j=0; j<c; j++){                
                if(inputArr[j].equals(".")){
                    map[i][j] = true;
                }
                else if(inputArr[j].equals("x"))
                    map[i][j] = false;
            }  
        }

        for(int i=0; i<r; i++){
            boolean result = recurs(i, 0);
            System.out.println("result : " + result);
            if(result) cnt++;
        }

        System.out.println(cnt);
        sc.close();
    }
}
