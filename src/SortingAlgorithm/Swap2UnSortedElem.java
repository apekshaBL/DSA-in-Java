package SortingAlgorithm;
import java.util.Scanner;
public class Swap2UnSortedElem {
    static void PrintArray(int[]array){
        for(int i=0;i<array.length;i++){
            System.out.print(array[i]+" ");
        }
        System.out.println();
    }
    static void Swap(int[]array,int x,int y){
        int temp=array[x];
        array[x]=array[y];
        array[y]=temp;
    }
    static void Sort(int[]array){
        int x=-1;int y=-1;
       int n=array.length;
       for(int i=1;i<n;i++){
           if(array[i-1]>array[i]){
               if(x==-1){
                   x=i-1;
                   y=i;
               }
               else{
                   y=i;
               }
           }
       }
       Swap(array,x,y);

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n=sc.nextInt();
        int [] array=new int[n];
        System.out.println("Enter the elements in increasing sorted only two elements should be unsorted ");
        for(int i=0;i<n;i++){
            array[i]=sc.nextInt();
        }
        System.out.println("Original array is");
        PrintArray(array);
        System.out.println("Sorted array is");
        Sort(array);
        PrintArray(array);

    }

}
