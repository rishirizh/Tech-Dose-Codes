class Solution {
    public boolean validVal(int row,int col,int r,int c){
        if (r>=row || c>=col || c<0 || r<0)
            return false;
        return true;
    }
    public int orangesRotting(int[][] grid) {
        int r=grid.length,c=grid[0].length,ones=0,time=0;
        int[][] surr = new int[][]{{0,1},{0,-1},{-1,0},{1,0}};
        Queue<int[]> queue = new LinkedList<>();
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if (grid[i][j]==1)
                    ones++;
                if (grid[i][j]==2)
                    queue.add(new int[]{i,j});
            }
        }
        if (ones==0)
            return 0;
        while (!queue.isEmpty()){
            int size = queue.size();
            
            for(int i=0;i<size;i++){
                int[] curr = queue.poll();
                for(int k=0;k<4;k++){
                    int currR = curr[0]+surr[k][0];
                    int currC = curr[1]+surr[k][1];
                    if (validVal(r,c,currR,currC) && grid[currR][currC]==1){
                        grid[currR][currC] = 2;
                        queue.add(new int[]{currR,currC});
                        ones--;
                    }
                    
                }
            }
            time++;
        }
        if (ones!=0)
            return -1;
//         for(int row[]: grid) {
//             for(int cell: row) {
//                 if(cell == 1) return -1;
//             }
//         }
        
        
        return time-1;
    }
}
