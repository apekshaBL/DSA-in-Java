package SortingAlgorithm;
import java.util.Scanner;
public class sortingInIncreasing {
    static void increasing(int[]array){
        int n=array.length;
        for(int i=0;i<n-1;i++){
            int min_idx=i;
            for(int j=i+1;j<n;j++){
                if(array[min_idx]>array[j]){
                    min_idx=j;
                }
            }
            int temp=array[i];
            array[i]=array[min_idx];
            array[min_idx]=temp;
        }
    }
    static void PrintArray(int[]array){
        for(int i=0;i<array.length;i++){
            System.out.println(array[i]+" ");
        }
        System.out.println();
    }
    public static  void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n=sc.nextInt();
        int []array=new int[n];
        System.out.println("Enter the elements of array");
        for(int i=0;i<n;i++){
            array[i]=sc.nextInt();
        }
        System.out.println("Sorted array in Increasing order is");
        increasing(array);
        PrintArray(array);


    }
}
