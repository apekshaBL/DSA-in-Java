package BinarySearchAlgorithm;
import java.util.Scanner;
public class Search {
    static void PrintArray(int[]array){
        for(int i=0;i<array.length;i++){
            System.out.print(array[i]+" ");
        }
        System.out.println();
    }
    static boolean Search(int[]array,int target){
        int n=array.length;
        int str=0;
        int end=n-1;
        while(str<=end){
            int mid=(str+end)/2;
            if(target==array[mid]){
                return true;
            }
            else if(target>array[mid]){
                str=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n=sc.nextInt();
        int[]array=new int[n];
        System.out.println("Enter the sorted elements of array");
        for(int i=0;i<n;i++){
            array[i]=sc.nextInt();
        }
        System.out.println("Sorted original array is");
        PrintArray(array);
        System.out.println("Enter the target");
        int a=sc.nextInt();
        System.out.println(Search(array,a));



    }
}
