import java.io.*;

public class B10871 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String first = br.readLine();
        String second = br.readLine();

        String[] inputV = first.split(" ");
        System.out.println(inputV[0] + ", " + inputV[1]);

        String[] arr = second.split(" ");
      
        for(int i=0; i<Integer.parseInt(inputV[0]); i++){
            if(Integer.parseInt(arr[i]) < Integer.parseInt(inputV[1]))
                System.out.println(arr[i] + " ");
        }
        System.out.println(" ");
        
        bw.flush();
        bw.close();
    }
}
