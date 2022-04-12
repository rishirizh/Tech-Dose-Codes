// Simple implementation
import java.util.*;

public class Main {
    public static void main(String[] args) {
        int[] arr = new int[]{0,0,1,1,2,2,3,3,3,3,4,2,6,8,8,4,5,6,6};
        int[] countArray = new int[9];
        for(int value:arr){
          countArray[value]++;
        }
        for(int index=1;index < 9;index++){
          countArray[index] += countArray[index-1];
        }
        int len = arr.length;
        int[] resultArray = new int[len];
        for(int index=len-1;index >= 0;index--){
          countArray[arr[index]]--;
          resultArray[countArray[arr[index]]] = arr[index];
        }
        for(int value:resultArray){
          System.out.print(value+" ");
        }
    }
}



//
import java.util.Scanner;

public class countingSort {
    public static void countingsort(int[] arr,int n,int max,int min){
        int[] freq = new int[max-min+1],arr1 = new int[n];
        for(int i=0;i<n;i++) freq[arr[i]-min]++;
        for(int i=1;i<max-min+1;i++) freq[i]+=freq[i-1];
        for(int i=n-1;i>=0;i--) arr1[--freq[arr[i]-min]]=arr[i];
        for(int i=0;i<n;i++) arr[i]=arr1[i];
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n=scanner.nextInt(),max=Integer.MIN_VALUE,min=Integer.MAX_VALUE; int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=scanner.nextInt();
            if(arr[i]>max) max=arr[i];
            if(arr[i]<min) min=arr[i];
        }
        countingsort(arr, n, max, min);
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        
    }
}



