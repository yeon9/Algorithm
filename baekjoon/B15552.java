import java.io.*;


public class B15552 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int n = Integer.parseInt(br.readLine());
        int[] sum = new int[n];

        for(int i=0; i<n; i++){
            String org = br.readLine();  
            String[] arr = org.split(" ");
            sum[i] = Integer.parseInt(arr[0]) + Integer.parseInt(arr[1]);
        }

        for(int idx : sum){
            bw.write(String.valueOf(idx) + " ");
            bw.newLine();
        }

        bw.flush();
        bw.close();
    }
}
