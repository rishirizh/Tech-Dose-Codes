

public class Main
{
    public static void swap(int[] arr,int i,int j){
        arr[i]^=arr[j];
        arr[j]^=arr[i];
        arr[i]^=arr[j];
    }
	public static void main(String[] args) {
		int arr[] = {10, 90, 49, 2, 1, 5, 23};
        int n = arr.length;
        for(int i=0;i<n;i+=2){
            if (i>=1 && arr[i]<=arr[i-1]){
                swap(arr,i,i-1);
            }
            if (i<n-1 && arr[i]<=arr[i+1]){
                swap(arr,i,i+1);
            }
            
        }
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
	}
}
