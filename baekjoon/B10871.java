import java.io.*;

public class B10871 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String first = br.readLine();
        String second = br.readLine();

        String[] inputV = first.split(" ");

        String[] arr = second.split(" ");
      
        for(int i=0; i<Integer.parseInt(inputV[0]); i++){
            if(Integer.parseInt(arr[i]) < Integer.parseInt(inputV[1]))
                bw.write(arr[i] + " ");
        }
        bw.newLine();

        bw.flush();
        bw.close();
    }
}
