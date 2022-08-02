class Solution {
    public int solution(int n) {
        int answer = 0;
        
        String candiNumStr = getTernary(n);
        
        // System.out.println(candiNumStr);
        
        StringBuffer sb = new StringBuffer(candiNumStr);
        
        candiNumStr = sb.reverse().toString();
        
        // System.out.println(candiNumStr);
        
        int j=0;
        for(int i=candiNumStr.length()-1; i>=0; i--){
            answer += Integer.valueOf(String.valueOf(candiNumStr.charAt(i))) * Math.pow(3, j);
            j++;
            
            // System.out.println(answer);
        }
        
        
        return answer;
    }
    
    public String getTernary(int candiNum){
        if(candiNum<3){
            return String.valueOf(candiNum);
        }
        
        String remainder = String.valueOf(candiNum%3);
        
        return getTernary(candiNum/3)+remainder;
    }
}