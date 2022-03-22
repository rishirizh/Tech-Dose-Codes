class Solution {
    List<List<Integer>> l = new ArrayList<>();
    // public boolean isCycle(int k,int[] visited){
    //     if (visited[k]==2) return true;
    //     visited[k]=2;
    //     for(int i:l.get(k)){
    //         if(visited[i]!=1){
    //             if(isCycle(i,visited)) return true;
    //         }
    //     }
    //     visited[k]=1;
    //     return false;
    // }
    public boolean isCycle(int current,int[] visited){
        if (visited[current]==1){
            return true;
        }
        visited[current] = 1;
        for(int i:l.get(current)){
            if (visited[i]!=2){
                if (isCycle(i,visited)){
                    return true;
                }
            }

        }
        visited[current] = 2;
        return false;
    }
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        int[] visited = new int[numCourses];
        for(int i=0;i<numCourses;i++){
            l.add(new ArrayList<>());
        }
        for(int i=0;i<prerequisites.length;i++){
            l.get(prerequisites[i][0]).add(prerequisites[i][1]);
        }
        for(int i=0;i<numCourses;i++){
            if (visited[i]==0){
                if (isCycle(i,visited)){
                    return false;
                }
            }
        }
        return true;
        
        
    }
}
