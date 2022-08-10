import java.util.*;
class Solution {
    public String solution(int[] numbers) {
        
        // String[] strArray = Arrays.stream(numbers).mapToObj(String::valueOf).sorted((o1,o2) -> Integer.valueOf((o2+o2+o2).substring(0,3)) - Integer.valueOf((o1+o1+o1).substring(0,3))).toArray(String[]::new);
        
        String[] strArray = Arrays.stream(numbers).mapToObj(String::valueOf).sorted((o1,o2) -> Integer.valueOf(o2+o1) - Integer.valueOf(o1+o2)).toArray(String[]::new);
        
        // System.out.println(Arrays.toString(strArray));
        
        String answer = String.join("",strArray);
        
        if(answer.substring(0,1).equals("0")){
            return "0";
        }
        
        return answer;
    }
}