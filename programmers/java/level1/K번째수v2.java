import java.util.*;
class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        for(int i=0; i<commands.length; i++){
            int[] cm = commands[i];
            int[] temp = Arrays.copyOfRange(array, cm[0]-1, cm[1]);
            Arrays.sort(temp);
            answer[i] = temp[cm[2]-1];
        }
        
        return answer;
    }
}