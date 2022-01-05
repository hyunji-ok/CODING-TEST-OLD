class Solution {
    public String solution(String s) {
        String answer = "";
        String[] s_array = s.split("");
        int idx = 0;
        
        for(int i=0; i<s_array.length; i++){
            if(s_array[i].equals(" ")) {
                idx = 0;
                answer += " ";
            }
            
            else if(idx%2==0) {
                idx += 1;
                answer += s_array[i].toUpperCase();
            }
            else if (idx%2==1) {
                idx +=1;
                answer += s_array[i].toLowerCase();
            }
        }
        
        return answer;
    }
}