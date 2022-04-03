import java.util.*;

class Solution {
    public int[] solution(String[] id_list, String[] report, int k) {
        int[] answer = new int[id_list.length];
        Map<String, Integer> index = new HashMap<>(); 
        Map<String, List<Integer>> list = new HashMap<>(); 
        
        for(int i=0; i<id_list.length; i++){
            index.put(id_list[i],i);
        }
        
        for(String rep : report){
            String[] idx = rep.split(" ");
            String fromId = idx[0], toId = idx[1];
            if(!list.containsKey(toId)) list.put(toId, new ArrayList<>());
            List<Integer> tmp = list.get(toId);
            
            if(!tmp.contains(index.get(fromId))) tmp.add(index.get(fromId));
        }
        // System.out.println("index="+index);
        // System.out.println("list="+list);
        
        for(int i=0; i<id_list.length; i++){
            String id= id_list[i];
            if(list.containsKey(id) && list.get(id).size() >= k){
                for(int ind : list.get(id)){
                    answer[ind]++;
                }
            }
        }
        
        return answer;
    }
}