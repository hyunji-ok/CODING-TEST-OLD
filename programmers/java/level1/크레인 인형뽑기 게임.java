import java.util.*;
class Solution {
    public int solution(int[][] board, int[] moves) {
        int row = board.length;
        int answer = 0;
        // System.out.println(row);
        Stack<Integer> st = new Stack();
        st.push(0);
        
        for(int mov : moves){
            int i = 0;
            while(i<row){
                if(board[i][mov-1] != 0) {
                    if(st.peek() == board[i][mov-1]) {
                        answer +=2;
                        st.pop();
                    }
                    else{
                        st.push(board[i][mov-1]);
                    }
                    
                    board[i][mov-1] = 0;
                    
                    break;
                }
                i++;
            }
        }
        
        
        return answer;
    }
}