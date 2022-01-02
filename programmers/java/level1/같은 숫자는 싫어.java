import java.util.*;

public class Solution {
    public Integer[] solution(int[] arr) {
        ArrayList<Integer> al = new ArrayList();
        
        int oldkey = 100;
        for(int key: arr) {
            if(oldkey != key) {
                al.add(key);
            }
            
            oldkey = key;
            
        }
        
        Integer[] answer = al.toArray(new Integer[al.size()]);

        return answer;
    }
}