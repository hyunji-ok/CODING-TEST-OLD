import java.util.*;

class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = n - lost.length;
        
        Arrays.sort(lost);
        Arrays.sort(reserve);
        
        for(int i=0; i<lost.length; i++){
            for(int j=0; j<reserve.length; j++){
                if(lost[i] == reserve[j]) {
                    answer+=1;
                    lost[i] = -1;
                    reserve[j]=-1;
                }
            }
        }
        
        for(int i: lost){
            for(int j=0; j<reserve.length; j++){
                if(i == reserve[j]-1 || i ==reserve[j]+1) {
                    answer+=1;
                    reserve[j] = -1;
                    break;
                }
            }
        }
        
        return answer;
    }
}