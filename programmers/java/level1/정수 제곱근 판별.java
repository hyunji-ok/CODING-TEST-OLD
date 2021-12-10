import java.util.*;

class Solution {
    public long solution(long n) {
        
        double sq = Math.sqrt(n);
        
        if(sq == Math.round(sq)){
            return (long)Math.pow(sq+1,2);
        }
        else{
            return -1;
        }
        
       
    }
}