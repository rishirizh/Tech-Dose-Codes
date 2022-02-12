class Solution {
    public void rotate(int[][] matrix) {
        int n = matrix.length;
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                int t = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = t;
            }
        }
        int l,h;
        for(int i=0;i<n;i++){
            // l = 0;h = n-1;
            // while (l<h){
            //     int t =matrix[i][l];
            //     matrix[i][l] = matrix[i][h];
            //     matrix[i][h] = t;
            //     l++;
            //     h--;
            // }
            for(int j=0;j<n/2;j++){
                int t =matrix[i][j];
                matrix[i][j] = matrix[i][n-j-1];
                matrix[i][n-j-1] = t;
            }
            
        }
        
    }
}
