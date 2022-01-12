import java.util.*;

public class Graph {
    static void addEdges(Map d,int node1,int node2){
        List<Integer> temp;
        temp = (List<Integer>) d.get(node1);
        temp.add(node2);
        d.put(node1, temp);
        temp = (List<Integer>) d.get(node2);
        temp.add(node1);
        d.put(node2, temp);
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<Integer,List<Integer>> d = new HashMap<>();
        //  tHE GRAPH
        //      0 -- 1
        //      |  /  \
        //      | /     2
        //      |/    / 
        //      4 ---3
        d.put(0,new ArrayList<>());
        d.put(1,new ArrayList<>());
        d.put(2,new ArrayList<>());
        d.put(3,new ArrayList<>());
        d.put(4,new ArrayList<>());

        addEdges(d, 0, 1);
        addEdges(d, 0, 4);
        addEdges(d, 1, 4);
        addEdges(d, 1, 2);
        addEdges(d, 4, 3);
        addEdges(d, 3, 2);
        addEdges(d, 2, 1);
        System.out.println(d);






    }
}
