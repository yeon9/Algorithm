import java.io.*;

public class B10952 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while(true){
            String line = br.readLine();
            String[] arr = line.split(" ");
            
            int a = Integer.parseInt(arr[0]);
            int b = Integer.parseInt(arr[1]);

            if(a == 0 && b == 0)
                break;
            else
                System.out.println(a+b);
        }

    }
}
