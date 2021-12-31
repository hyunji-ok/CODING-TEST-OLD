class Solution {
    public String solution(int a, int b) {
        String answer = ;
        String[] week = {FRI,SAT,SUN,MON,TUE,WED,THU};
        int[] month = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        
        int cal = 0;
        
        for(int i=0; ia-1; i++){
            cal += month[i];
        }
        
        answer = week[(cal+b-1)%7];
        
        return answer;
    }
}