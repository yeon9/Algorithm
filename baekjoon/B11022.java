import java.io.*;

public class B11022 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int n = Integer.parseInt(br.readLine());
        int[] sum = new int[n];
        String[] input = new String[n];

        for(int i=0; i<n; i++){
            input[i] = br.readLine();
            String[] arr = input[i].split(" ");
            input[i] = input[i].replace(" ", " + ");
            
            sum[i] = Integer.parseInt(arr[0]) + Integer.parseInt(arr[1]);
        }

        for(int i=0; i<n; i++){
            bw.write("Case #" + (i+1) + ": " + input[i] + " = " + sum[i]);
            bw.newLine();
        }

        bw.flush();
        bw.close();

    }
}
