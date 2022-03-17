class Solution {
    public List<List<Integer>> result;
    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        int len = graph.length;
        result = new ArrayList<>();
        List<Integer> l = new ArrayList<Integer>();
        l.add(0);
        dfs(graph,0,len-1,l);
        return result;
    }
    public void dfs(int[][] graph,int index,int n,List<Integer> l){
        
        if (index==n){
            result.add(new ArrayList<>(l));
            return;
        }
        
        for(int i:graph[index]){
                l.add(i);
                dfs(graph,i,n,l);
                l.remove(l.size()-1);
            
            }
        }
        
        
        
    }
