import java.util.*;

public class Solution {
    public int solution(int n) {
        int answer = 0;
        String temp = Integer.toString(n);
        String[] arr = temp.split("");
        
        
        for(String i:arr){
            answer+=Integer.parseInt(i);
        }
        
        
        return answer;
    }
}