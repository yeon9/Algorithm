    import java.util.Scanner;

    public class B1434 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            int n = sc.nextInt();   // 박스의 개수
            int m = sc.nextInt();   // 책의 개수

            int box[] = new int[n];
            int book[] = new int[m];

            int space = 0;
            int boxn = 0;
            int bookn = 0;

            for(int i=0; i<n; i++){
                box[i] = sc.nextInt();
            }
            for(int i=0; i<m; i++){
                book[i] = sc.nextInt();
            }

            while(true){
                if(boxn >= n || bookn >= m) break;  // 각 인덱스가 박스, 책 크기보다 커지면  종료

                if(book[bookn] <= box[boxn]){   // 책 크기가 박스보다 작으면
                    box[boxn] = box[boxn] - book[bookn];
                    bookn++;
                    boxn = 0;
                }
                else{
                    boxn++;
                }
            }

            for(int i=0; i<n; i++){
                space += box[i];
            }

            System.out.println(space);
        }
    }
