class Solution {
    public int solution(long num) {

        int count = 0;
        
        for(int i=0; i<500; i++) {
            if (num==1) {
                break;
            }
            
            count +=1;
            
            if (num%2==0) {
                num /= 2;
            }
            else {
                num = (num*3) +1;
            }
            
            if (num==1) {
                break;
            }
            
            if (i==499) {
                count = -1;
            }
        }
        

        return count;
    }
}