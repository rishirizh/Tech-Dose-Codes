class Solution {
    public int findParent(int[] disjointSet,int element){
        if (disjointSet[element]==-1){
            return element;
        }
        return findParent(disjointSet,disjointSet[element]);
    }
    public void union(int[] disjointSet,int from,int to){
        int parent1 = findParent(disjointSet,from);
        int parent2 = findParent(disjointSet,to);
        if (parent1!=parent2){
            disjointSet[parent1] = parent2;
        }
    }
    public int findCircleNum(int[][] isConnected) {
        int N = isConnected.length;
        int[] disjointSet = new int[N];
        Arrays.fill(disjointSet,-1);
        int count = 0;
        for(int i=0;i<N;i++){
            for(int j=0;j<N;j++){
                if (isConnected[i][j]==1){
                    union(disjointSet,i,j);
                }
            }
        }
        for(int i=0;i<N;i++){
            if (disjointSet[i]==-1){
                count++;
            }
        }
        return count;
    }
}
