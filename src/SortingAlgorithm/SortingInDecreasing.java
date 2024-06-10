package SortingAlgorithm;
import java.util.Scanner;
public class SortingInDecreasing {
    static void PrintArray(int[]array){
        for(int i=0;i<array.length;i++){
            System.out.print(array[i]+" ");
        }

    }
    static void sort_Decreasing(int[]array){
        for(int i=0;i<array.length-1;i++){
            int temp;
            for(int j=i+1;j<array.length;j++){
                if(array[i]<array[j]){
                    temp=array[j];
                    array[j]=array[i];
                    array[i]=temp;

                }
            }

        }

    }
    public static void main(String[]args){
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter the size of array");
        int n=sc.nextInt();
        int[]array=new int[n];
        System.out.println("Enter the elements of array");
        for(int i=0;i<n;i++){
            array[i]=sc.nextInt();
        }
        System.out.println("Sorted array in Decreasing Order is:-");
        sort_Decreasing(array);
        PrintArray(array);


    }
}
