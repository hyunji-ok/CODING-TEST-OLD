import java.util.*;

class Solution {
    public int[] solution(int[] answers) {
        int[] answer = {};
        int[] person1 = {1,2,3,4,5};
        int[] person2 = {2,1,2,3,2,4,2,5};
        int[] person3 = {3,3,1,1,2,2,4,4,5,5};
        int score1 = 0, score2 = 0, score3 = 0;
        
        for(int i=0; i<answers.length; i++) {
            if(person1[i%person1.length] == answers[i]) {
                score1+=1;
            }
            if(person2[i%person2.length] == answers[i]) {
                score2+=1;
            }
            if(person3[i%person3.length] == answers[i]) {
                score3+=1;
            }
        }
        
        int max = Math.max(score1, Math.max(score2, score3));
        
        ArrayList<Integer> arr = new ArrayList();
        
        if(max == score1) {arr.add(1);}
        if(max == score2) {arr.add(2);}
        if(max == score3) {arr.add(3);}
        
        answer = new int[arr.size()];
        
        // System.out.print(arr);
        
        for(int i=0; i<arr.size(); i++){
            answer[i]=arr.get(i);
        }
        
        return answer;
    }
}