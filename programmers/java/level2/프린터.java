import java.util.*;
import java.util.stream.*;
class Solution {
    public int solution(int[] priorities, int location) {
        
        int answer = 1;
        
        List<Integer> que = IntStream.of(priorities).boxed().collect(Collectors.toList());
        
        while(que.size()!=0){
            if(que.get(0) == Collections.max(que)){
                que.remove(0);
                if(location == 0){
                    break;
                } else{
                    answer++;
                    location--;
                }
            } else{
                que.add(que.get(0));
                que.remove(0);
                if(location == 0){
                    location = que.size()-1;
                } else{
                    location--;
                }
            }
            
        }
        
        
        return answer;
    }
}