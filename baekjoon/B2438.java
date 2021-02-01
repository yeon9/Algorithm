import java.io.*;
public class B2438 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        for(int i=1; i<=n; i++){
            for(int j=0; j<n-i; j++){
                bw.write(" ");
            }
            for(int j=n-i; j<n; j++){
                bw.write("*");
            }            
            bw.newLine();
        }

        bw.flush();
        bw.close();
    }    
}
