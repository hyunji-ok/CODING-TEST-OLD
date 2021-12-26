import java.util.*;

class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        Map<String, Integer> hm = new HashMap();
        
        for(String parti: participant){
            if(hm.get(parti) == null) {
                hm.put(parti, 1);
            }
            else{
                int val = hm.get(parti)+1;
                hm.put(parti, val);
            }
        }
        
        for(String comp: completion) {
            int val = hm.get(comp)-1;
            hm.put(comp, val);
        }
        
        for(String key: hm.keySet()){
            if(hm.get(key)==1){
                answer = key;
            }
        }
        
        return answer;
    }
}