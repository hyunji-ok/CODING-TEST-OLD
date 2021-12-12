import java.util.Arrays;
import java.util.Collections;

class Solution {
    public long solution(long n) {
        String m = Long.toString(n);
        String[] arr = m.split("");
        

        Arrays.sort(arr, Collections.reverseOrder());
        
        String temp = "";
        
        for(String i:arr){
            temp+=i;
        }
        
        long answer = Long.parseLong(temp);
        
        return answer;
    }
}