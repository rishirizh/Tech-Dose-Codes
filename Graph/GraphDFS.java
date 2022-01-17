import java.util.*;

public class GraphDFS {
    static List<List<Integer>> arr;
    static int N;
    GraphDFS(int n){
        arr = new ArrayList<>(n);
        N = n;
        for(int i=0;i<n;i++){
            arr.add(new ArrayList<Integer>());
        }
    }
    static void addEdge(int u,int v){
        arr.get(u).add(v);
        
    }
    static void dfs(int id,boolean[] check){
        check[id] = true;
        System.out.print(id+" ");
        List<Integer> l = arr.get(id);
        int len = l.size();
        for(int i=0;i<len;i++){
            int ele = l.get(i);
            if (check[ele]==false){
                dfs(ele, check);
                check[ele] = true;
            }
        }
        return;
    }
    public static void main(String[] args) {
        new GraphDFS(4);
        // addEdge(0,1);
        // addEdge(0,2);
        // addEdge(1,3);
        // addEdge(1,0);
        // addEdge(2,1);
        // addEdge(2,3);
        // addEdge(3,1);
        // addEdge(3,2);
        addEdge(0, 1);
        addEdge(0, 2);
        addEdge(1, 2);
        addEdge(2, 0);
        addEdge(2, 3);
        addEdge(3, 3);
        
        System.out.println(arr);
        boolean[] check = new boolean[4];
        dfs(2,check);




    }
    
}
