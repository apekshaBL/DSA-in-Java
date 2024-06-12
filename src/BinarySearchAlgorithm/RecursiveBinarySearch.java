package BinarySearchAlgorithm;
import java.util.Scanner;
public class RecursiveBinarySearch {
    static void PrintArray(int[]array){
        for(int i=0;i<array.length;i++){
            System.out.print(array[i]+" ");
        }
        System.out.println();
    }
    static boolean RecursionSearch(int[]array,int str,int end,int target){
        if(str>end){
            return false;
        }
        int mid=(str+end)/2;
        if(target==array[mid]){
            return true;
        }
        else if(target>array[mid]){
            return RecursionSearch(array,mid+1,end,target);
        }
        else{
            return RecursionSearch(array,str,mid-1,target);
        }

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of array");
        int n=sc.nextInt();
        int[]array=new int[n];
        System.out.println("Enter elements of array in sorted form");
        for(int i=0;i<n;i++){
            array[i]=sc.nextInt();
        }
        System.out.println("Original sorted array is");
        PrintArray(array);
        System.out.println("Enter the target element to be searched");
        int a=sc.nextInt();
        System.out.println(RecursionSearch(array,0,n-1,a));

    }
}
