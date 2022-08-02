class Solution {
    public int solution(int left, int right) {
        
        int answer = 0;
        
        for(int i=left; i<=right; i++){
            if(countDivisor(i)%2==0){
                answer+=i;
            } else{
                answer-=i;
            }
        }
        
        return answer;
    }
    
    public int countDivisor(int candidateNumber){
        
        int count = 0;
        
        for(int j=1; j<=candidateNumber; j++){
            if(candidateNumber%j==0){
                count++;
            } 
        }
        
        return count;
    }
}