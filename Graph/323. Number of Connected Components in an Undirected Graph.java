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
    public int countComponents(int n, int[][] edges) {
        int[] disjointSet = new int[n];
        Arrays.fill(disjointSet,-1);
        for(int[] value:edges){
            int from = value[0];
            int to = value[1];
            union(disjointSet,from,to);
        }
        System.out.println(Arrays.toString(disjointSet));
        int count = 0;
        for(int i=0;i<n;i++){
            if (disjointSet[i]==-1){
                count++;
            }
        }
        return count;
    }
}
