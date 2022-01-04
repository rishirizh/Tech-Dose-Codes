import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int max=Integer.MIN_VALUE,curr=0;
        for(int i=0;i<n;i++){
            curr += arr[i];
            if(curr<arr[i]){
                curr=arr[i];
            }
            if(curr>max){
                max=curr;
            }
            // max = Math.max(max,curr);
        }
        System.out.print(max);
		
		
		
	}
}
