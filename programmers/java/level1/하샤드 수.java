class Solution {
    public boolean solution(int x) {
        boolean answer = true;
        String temp_str = Integer.toString(x);
        String[] temp_str_arr = temp_str.split("");
        int temp_int = 0;
        for(String t:temp_str_arr){
            
            temp_int+= Integer.parseInt(t);

        }
        if(x%temp_int==0) {
            
        }
        else {
            answer = false;
        }
        
        return answer;
    }
}