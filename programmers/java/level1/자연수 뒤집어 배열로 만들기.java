import java.util.ArrayList;

class Solution {
    public ArrayList solution(long n) {
        String m = Long.toString(n);
        String[] arr = m.split("");
        ArrayList answer = new ArrayList();
        
        for(int i=arr.length-1 ;i>-1;i--){
            int num = Integer.parseInt(arr[i]);
            answer.add(num);
        }
        
        
        return answer;
    }
}