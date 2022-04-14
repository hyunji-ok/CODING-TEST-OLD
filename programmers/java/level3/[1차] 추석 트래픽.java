import java.util.*;
class Solution {
    public int solution(String[] lines) {
        
        ArrayList<ArrayList<Integer>> startEnd = new ArrayList();
        ArrayList<Integer> candidate = new ArrayList();
        
        for(String se : lines) {
            String[] temp1 = se.split(" ");
            String[] temp2 = temp1[1].split(":");
            int end = 0;
            // System.out.println(Arrays.toString(temp2));
            // System.out.println(Arrays.toString(temp3));
            end += Integer.parseInt(temp2[0]) * 3600 * 1000;
            end += Integer.parseInt(temp2[1]) * 60 * 1000;
            end += (int)(Double.parseDouble(temp2[2]) * 1000);

            
            int start = 0;

            int temp5 = (int) (Double.parseDouble(temp1[2].substring(0,temp1[2].length()-1))*1000);
            start = end+1-temp5;
            
            // System.out.println(end);
            // System.out.println(start);
            
            ArrayList<Integer> al = new ArrayList();
            al.add(start);
            al.add(end);
            startEnd.add(al);
            
            candidate.add(start);
            candidate.add(end);
            
        }
        
        // System.out.println(startEnd);
        Collections.sort(candidate);
        // System.out.println(candidate);
        int maxcount = 0;
        // for(int can=0; can<((23*3600)+59*60+59)*1000+999; can++) {
        for(int can: candidate){
            int s = can;
            int e = can+999;
            int count = 0;
            for(ArrayList<Integer> arr : startEnd){
                if(s<=arr.get(0) && arr.get(0)<=e) {
                    count+=1;
                    // System.out.println(s);
                    // System.out.println(e);
                }
                else if(s<=arr.get(1) && arr.get(1)<=e) {
                    count+=1;
                }
                else if(arr.get(0) <= s && e<= arr.get(1)) {
                    count+=1;
                }
            }
            maxcount = Math.max(count, maxcount);
        }
        
        return maxcount;
    }
}