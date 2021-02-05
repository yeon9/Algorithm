import java.util.*;

public class PhoneBook {
    public static boolean solution(String[] phone_book) {
        boolean answer = true;
        Map<Integer, String> h = new HashMap<>();

        for(int i=0; i<phone_book.length; i++){
            System.out.println(phone_book[i]);
            h.put(i, phone_book[i]);           
        }
        
        for(int i=0; i<phone_book.length; i++){
            for(int j=0; j<phone_book.length; j++){
                if(i == j) continue;
                System.out.println("i : " + i + " - " + h.get(i) + ", j : " + j + " - " + phone_book[j]);
                if(h.get(i).startsWith(phone_book[j])){
                    answer = false;    
                    break;   
                }
            }
        }
        return answer;
    }
   
    public static void main(String[] args) {
        String[] phone_book1 = {"119", "97674223", "1195524421"};
        String[] phone_book2 = {"123","456","789"};
        String[] phone_book3 = {"12","123","1235","567","88"};

        boolean result = solution(phone_book3);
        System.out.println("result : " + result);

    }
}
