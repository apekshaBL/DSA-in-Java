package SortingAlgorithm;
import java.util.Scanner;
public class Sort_Increasingly {
    static void PrintArray(int[]array){
        for(int i=0;i<array.length;i++){
            System.out.print(array[i]+" ");
        }
    }
    static void Sort_Increasing(int[]array){
        int n=array.length;
        //array[0] is sorted suppose and other unsorted
        for(int i=1;i<n;i++){
           int j=i;
           while( array[j]<array[j-1] && j>0){
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
        System.out.println("Sorted array in Increasing Order is");
        Sort_Increasing(array);
        PrintArray(array);


    }
}
