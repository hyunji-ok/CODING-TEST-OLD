import java.util.Arrays;
import java.util.ArrayList;

class Solution {
    public ArrayList solution(int[] arr) {
        int[] sorted_arr = arr.clone();
        Arrays.sort(sorted_arr);
        int min = sorted_arr[0];
        
        // System.out.print(arr.getClass().getSimpleName());
        // System.out.print(answer.getClass().getSimpleName());
            
        ArrayList answer = new ArrayList();
        
        
        for(int i:arr){
            if(i==min){
                
            }
            else{
                answer.add(i);
            }
        }
        
        if(answer.size()==0) {
            answer.add(-1);
        }
        
        return answer;
    }
}