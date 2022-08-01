import java.util.*;
// import java.util.Stream.*;

class Solution {
    static int row;
    static int col;
    static int[] dr = {1,0,-1,0};
    static int[] dc = {0,1,0,-1};
    static boolean[][][] visited;
    
    public int[] solution(String[] grid) {
        List<Integer> answer = new ArrayList<>();
        row = grid.length;
        col = grid[0].length();
        visited = new boolean[row][col][4];
        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                for(int k=0; k<4; k++){
                    if(!visited[i][j][k]) answer.add(light(i,j,k, grid));
                }
            }
        }
        
        return answer.stream().sorted().mapToInt(i->i).toArray();
    }
    
    public int light(int r, int c, int d, String[] grid){
        
        int cnt=0;
        
        while(true){
            if(visited[r][c][d]){
                break;
            }

            cnt++;
            
            visited[r][c][d] = true;
            
            if(grid[r].charAt(c)=='R'){
                d = (d+1)%4;
            } else if(grid[r].charAt(c)=='L'){
                d = (d+3)%4;
            }
            
            r = (r + dr[d]+row)%row;
            c = (c + dc[d]+col)%col;
        }
            
        
        return cnt;
    }
}