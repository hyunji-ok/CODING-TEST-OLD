import java.util.*;
class Solution {
    public String solution(int[] numbers, String hand) {
        String answer = "";
        int left = 10;
        int right = 12;
        
        for(int num : numbers) {
            if(num == 1 || num == 4 || num == 7) {
                answer += "L";
                left = num;
            }
            else if(num==3 || num==6 || num==9){
                answer += "R";
                right = num;
            }
            else {
                int leftL = getLength(left, num);
                int rightL = getLength(right, num);
                if(leftL < rightL) {
                    answer += "L";
                    left = num;
                }
                else if (leftL > rightL){
                    answer += "R";
                    right = num;
                }
                else {
                    if(hand.equals("left")) {
                        answer += "L";
                        left = num;
                    }
                    else {
                        answer += "R";
                        right = num;
                    }
                }
            }
        }
        
        
        return answer;
    }
    
    static int getLength(int index, int num) {
        index = (index == 0) ? 11 : index;
        num = (num == 0) ? 11 : num;
        
        int indexRow = (index-1) / 3;
        int indexCol = (index-1) % 3;
        
        int numRow = (num-1) /3;
        int numCol = (num-1) %3;
        
        return Math.abs(indexRow-numRow) + Math.abs(indexCol-numCol);
    }
}