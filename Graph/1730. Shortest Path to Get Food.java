class Solution {
    public int getFood(char[][] grid) {
        Queue<int[]> queue = new LinkedList<>();
        int R = grid.length,C = grid[0].length;
        boolean[][] visited = new boolean[R][C];
        for(int i=0;i<R;i++){
            for(int j=0;j<C;j++){
                if (grid[i][j]=='*'){
                    queue.add(new int[]{i,j});
                    visited[i][j] = true;
                    break;
                }
            }
        }
        int[][] surr = new int[][]{{-1,0},{1,0},{0,-1},{0,1}};
        int count = 0;
        while (!queue.isEmpty()){
            
            int currentLen = queue.size();
            for(int i=0;i<currentLen;i++){
                int[] currentValue = queue.poll();
                if (grid[currentValue[0]][currentValue[1]]=='#'){
                    return count;
                }
                for(int[] dir:surr){
                    int r = dir[0]+currentValue[0];
                    int c = dir[1]+currentValue[1];
                    if (r>=0 && c>=0 && r<R && c<C && grid[r][c]!='X' && !visited[r][c]){
                        queue.add(new int[]{r,c});
                        visited[r][c] = true;
                    }
                }
                
            }
            count++;
        }
        return -1;
    }
}
