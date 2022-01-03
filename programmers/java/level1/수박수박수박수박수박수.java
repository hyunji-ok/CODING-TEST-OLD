class Solution {
    public String solution(int n) {
        String answer = "";
        if(n%2==1) {
            int q = n/2;
            answer += "수박".repeat(q);
            answer += "수";
        }
        else{
            int q = n/2;
            answer += "수박".repeat(q);
        }
        
        return answer;
    }
}