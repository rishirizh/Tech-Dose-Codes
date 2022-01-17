import java.util.*;
public class GraphBFS {
    static List<List<Integer>> arr;
    static int N;
    GraphBFS(int n){
        N = n;
        arr = new ArrayList<>(n);
        for(int i=0;i<=n;i++){
            arr.add(new ArrayList<Integer>());
        }
        System.out.println(arr);
    }
    static void bfs(int id){
        boolean[] check = new boolean[N];
        Queue<Integer> queue = new LinkedList<>();
        queue.add(id);
        check[id] = true;
        while (!queue.isEmpty()){
            int t = queue.poll();
            System.out.print(t+" ");
            List<Integer> newList = arr.get(t);
            int len = newList.size();
            for(int i=0;i<len;i++){
                int ele = newList.get(i);
                if (check[ele] != true){
                    queue.add(ele);
                    check[ele] = true;
                }
                
            }

        }


    }


    static void addEdges(int u,int v){
        arr.get(u).add(v);
        
        
    }
    public static void main(String[] args) {
        
        
        new GraphBFS(4);
        addEdges(0,1);
        addEdges(0,2);
        addEdges(1,2);
        addEdges(2,0);
        addEdges(2,3);
        addEdges(3,3);
        addEdges(3,0);
        bfs(3);
        


    }
}



