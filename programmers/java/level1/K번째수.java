import java.util.*;

class Solution {
    public ArrayList solution(int[] array, int[][] commands) {
        ArrayList answer = new ArrayList();
        for(int[] arr:commands ){
            int start = arr[0]-1;
            int end = arr[1]-1;
            int target = arr[2]-1;
            
            ArrayList arr_temp = new ArrayList();
            for(int i=start;i<end+1;i++){
                arr_temp.add(array[i]);
                // System.out.println(i);
            }
            
            arr_temp.sort(Comparator.naturalOrder());
            
            // System.out.println(arr_temp.get(target));
            answer.add(arr_temp.get(target));
        }
        return answer;
    }
}