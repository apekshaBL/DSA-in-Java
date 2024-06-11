package SortingAlgorithm;
import java.util.Scanner;
public class lexicographicalOrder {
    static void PrintArray(String[]array){
        for(int i=0;i<array.length;i++){
            System.out.print(array[i]+" ");
        }
    }
    static void Sort(String[]array){
        int n=array.length;
        for(int i=0;i<n-1;i++){
           int min_idx=i;
           for(int j=i+1;j<n;j++){
               if(array[j].compareTo(array[min_idx])<0){
                   min_idx=j;
               }
           }
           String temp=array[i];
           array[i]=array[min_idx];
           array[min_idx]=temp;
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n=sc.nextInt();
        String[]array=new String[n];
        System.out.println("Enter the String elements of the array");
        for(int i=0;i<n;i++){
            array[i]=sc.next();
        }
        System.out.println("Original array of String is");
        PrintArray(array);
        System.out.println();
        System.out.println("The array sorted in lexicographical order is ");
        Sort(array);
        PrintArray(array);

    }
}
