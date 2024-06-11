package SortingAlgorithm;
import java.util.Scanner;
public class Move0 {
    static void PrintArray(int[]array){
        for(int i=0;i<array.length;i++){
            System.out.print(array[i]+" ");
        }
    }
    static void Sort(int[]array){
        for(int i=0;i<array.length-1;i++){
            for(int j=i+1;j<array.length;j++){
                if(array[i]==0 && array[j]!=0  ){
                    int temp=array[i];
                    array[i]=array[j];
                    array[j]=temp;
                }
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
        System.out.println("Original array is");
        PrintArray(array);
        System.out.println();
        System.out.println("Sorted array according to the condition is");
        Sort(array);
        PrintArray(array);


    }
}
