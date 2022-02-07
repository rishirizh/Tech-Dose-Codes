import java.util.Arrays;
public class MergeSort {
    static void swap(int[] arr,int i,int j){
        arr[i]^=arr[j];
        arr[j]^=arr[i];
        arr[i]^=arr[j];
    }
    static void printArray(int[] arr){
        int l =arr.length;
        for(int i=0;i<l;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    static void divide(int[] arr,int l,int h){
        if (l>=h)
            return;
        System.out.println("low "+l+" high "+h);
        int m = l+(h-l)/2;
        divide(arr, l, m);
        divide(arr, m+1, h);
        merge(arr,l,m,h);

    }
    static void merge(int[] arr,int low,int mid,int high){
        int[] temp = new int[high-low+1];
        int i=low,j=mid+1,c=0;
        while (i<=mid && j<=high){
            if (arr[i] <= arr[j]){
                temp[c] = arr[i++];
            }
            else{
                temp[c] = arr[j++];
            }
            c++;
        }
        while (i<=mid){
            temp[c++] = arr[i++];
        }
        while (j<=high){
            temp[c++] = arr[j++];
        }
        for(int k=low;k<=high;k++){
            arr[k] = temp[k-low];
        }
    }
    public static void main(String[] args) {
        int[] arr = new int[]{107,22,48,202,-23,444,9048,-777};
        int[] nn = new int[]{107,22,48,202,-23,444,9048,-777};
        Arrays.sort(nn);
        int n=arr.length;
        divide(arr, 0, n-1);
        printArray(arr);
        System.out.println("NN");
        printArray(nn);

    }
}
