class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int row = matrix.length,col = matrix[0].length;
        int top = 0,down = row-1,left = 0,right = col-1,cmd=0;
        ArrayList<Integer> l = new ArrayList();
        while (top<=down && left<=right){
            if (cmd==0){
                for(int i=left;i<=right;i++){
                    l.add(matrix[top][i]);
                }
                top++;
            }
            else if (cmd==1){
                for(int i=top;i<=down;i++){
                    l.add(matrix[i][right]);
                }
                right--;
            }
            else if (cmd==2){
                for(int i=right;i>=left;i--){
                    l.add(matrix[down][i]);
                }
                down--;
            }
            else{
                for(int i=down;i>=top;i--){
                    l.add(matrix[i][left]);
                }
                left++;
            }
            cmd = (++cmd)%4;
        }
        return l;
        
    }
}
