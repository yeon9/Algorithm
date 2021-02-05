import java.util.*;

class Completion {
    public static String solution2(String[] participant, String[] completion) {
        String answer = "";
        Map<String, Integer> h = new HashMap<>();
       
        for(String partic : participant){
            if(h.get(partic) == null)
                h.put(partic, 1); 
            else{
                h.put(partic, h.get(partic)+1);
            }
        }

        for(String comple: completion){
            if(h.get(comple) != null)
                h.put(comple, h.get(comple)-1);
        }
 
        for(String key : h.keySet()){
            if(h.get(key) != 0){
                answer = key;
            }
        }
        
        return answer;
    }
    public static String solution1(String[] participant, String[] completion) {
        String answer = "";

        for(int i=0; i<participant.length; i++){
            for(int j=0; j<completion.length; j++){
                if(participant[i].equals(completion[j])){
                    participant[i] = " ";
                    break;
                }
            }
        }
        for(int i=0; i<participant.length; i++){
            if(!participant[i].equals(" "))
                answer = participant[i];
        }

        return answer;
    }
    public static void main(String[] args) {
        String[] participant1 = {"leo", "kiki", "eden"};
        String[] completion1 = {"eden", "kiki"};


        String[] participant3 = {"mislav", "stanko", "mislav", "ana"};
        String[] completion3 = {"stanko", "ana", "m0000islav"};

        String value = solution2(participant1, completion1);
        System.out.println(value);

    }
}