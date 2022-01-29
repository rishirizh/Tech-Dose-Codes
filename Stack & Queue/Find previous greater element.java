
import java.util.*;
public class Main
{
	public static void main(String[] args) {
		int[] a1 = new int[]{4,1,2,-1,-44};
		int[] a2 = new int[]{1,3,2,-8,-1,-44,6,90,5,4};
		 
		HashMap<Integer,Integer> map = new HashMap();
        Stack<Integer> stack = new Stack();
        int len = a1.length,len2=a2.length,num;
        for(int i=len2-1;i>=0;i--){
            num = a2[i];
            while (!stack.empty() && stack.peek() < num){
                map.put(stack.pop(),num);
            }
            stack.push(num);
        }
		for(int i=0;i<len;i++){
            a1[i] = map.getOrDefault(a1[i],-1);
        }
        System.out.print(Arrays.toString(a1));
		
	}
}
