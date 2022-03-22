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
    public boolean isCycle(int[] disjointSet,int from,int to){
        int parent1 = findParent(disjointSet,from);
        int parent2 = findParent(disjointSet,to);
        if (parent1==parent2 && parent1!=-1 && parent2!=-1){
            return true;
        }
        return false;
    }
    
    public boolean validTree(int N, int[][] edges) {
        
        int[] disjointSet = new int[N];
        Arrays.fill(disjointSet,-1);
        int count = 0;
        int len = edges.length;
        for(int i=0;i<len;i++){
            if (isCycle(disjointSet,edges[i][0],edges[i][1])){
                return false;
            }
            union(disjointSet,edges[i][0],edges[i][1]);
        }
        for(int i=0;i<N;i++){
            if (disjointSet[i]==-1){
                count++;
            }
        }
        return count==1 ? true : false;
        
    }
}
