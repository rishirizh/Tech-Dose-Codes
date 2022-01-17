import java.util.*;
public class DisjointSet {
    static int findParent(int[] arr,int v){
        if (arr[v]==-1)
            return v;
        return findParent(arr,arr[v]);
    }
    static void union(int[] arr,int x,int y){
        int parent1 = findParent(arr, x);
        int parent2 = findParent(arr, y);
        if (parent1!=parent2)
            arr[parent1] = parent2;
    }
    static void addEdge(int[] arr,int from,int to){
        if (findParent(arr,from)!=findParent(arr, to) || (arr[from]==-1 && arr[to]==-1))
                arr[from] = to;
    }
    static boolean isCyclic(int[] arr,int x,int y){
        int parent1 = findParent(arr, x);
        int parent2 = findParent(arr, y);
        if (parent1==parent2 && parent1!=-1 && parent2!=-1)
            return true;
        return false;
    }
    public static void main(String[] args) {
        //  Nodes 0 to 3
        //          1
        //        / |  \
        //      0   |    2
        //        \ |  /
        //          3

        int[] arr = new int[4];
        for(int i=0;i<4;i++){
            arr[i] =-1;
        }
        Scanner sc = new Scanner(System.in);
        int E=sc.nextInt(),from=0,to=0;
        
        for(int i=0;i<E;i++){
            from = sc.nextInt();
            to = sc.nextInt();
            // addEdge(arr, from, to);
            union(arr, from, to);
            isCyclic(arr, from, to);
            
        }
        System.out.println(Arrays.toString(arr));




    }
}
