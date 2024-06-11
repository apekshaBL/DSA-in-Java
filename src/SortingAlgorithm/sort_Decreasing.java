package SortingAlgorithm;
import org.w3c.dom.ls.LSOutput;

import java.util.*;
public class sort_Decreasing {
    static void PrintArray(int[]array){
        for(int i=0;i<array.length;i++){
            System.out.print(array[i]+" ");
        }
        System.out.println();
    }
    static void Sort_Decreasing(int[]array){
        int n=array.length;
        for(int i=1;i<n;i++){
            int j=i;
            while(j>0 && array[j]>array[j-1]){
                int temp=array[j];
                array[j]=array[j-1];
                array[j-1]=temp;
                j--;
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n=sc.nextInt();
        int[]array=new int[n];
        System.out.println("Enter the elements of array");
        for(int i=0;i<n;i++){
            array[i]=sc.nextInt();
        }
        System.out.println("Our unsorted array is");
        PrintArray(array);
        System.out.println("Sorted array in Decreasing Order is");
        Sort_Decreasing(array);
        PrintArray(array);

    }
}
