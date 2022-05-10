import java.util.*;
class Solution {
    public int[] solution(int[] answers) {
        int[] candi1 = new int[] {1,2,3,4,5};
        int[] candi2 = new int[] {2,1,2,3,2,4,2,5};
        int[] candi3 = new int[] {3,3,1,1,2,2,4,4,5,5};
        int[][] totalCandi = new int[][] {candi1, candi2, candi3};
        int answerCount = 0;
        
        int[] calMax = new int[3];
        for(int i=0; i<3; i++){
            calMax[i] = getAnswerCount(answers, totalCandi[i]);
        }
        
        List<Integer> arr = new ArrayList();
        int max = Arrays.stream(calMax).max().getAsInt();
        for(int i=0; i<3; i++){
            if(max == calMax[i]){
                arr.add(i+1);
            }
        }
        
        // System.out.println(arr);
        int[] answer = arr.stream().mapToInt(i->i).toArray();
        
        return answer;
    }
    
    static int getAnswerCount(int[] answers, int[] candi){
        int countAnswer = 0;
        for(int i=0; i<answers.length;i++){
            if(answers[i]==candi[i%candi.length]){
                countAnswer++;
            }
        }
        
        return countAnswer;
    }
}