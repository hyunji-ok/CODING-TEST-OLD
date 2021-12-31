class Solution {
    public String solution(String s) {
        String answer = "";
        
        if(s.length()%2==0) {
            int idx = (s.length())/2;
            answer += s.substring(idx-1, idx+1);
        }
        else {
            int idx = (s.length()-1)/2;
            answer += s.charAt(idx);
        }
        
        return answer;
    }
}