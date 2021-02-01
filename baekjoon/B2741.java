import java.io.*;

public class B2741 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());

        for(int i=0; i<n; i++){
            bw.write(String.valueOf(i+1));
            bw.newLine();
        }

        bw.flush();
        bw.close();
    }
}
