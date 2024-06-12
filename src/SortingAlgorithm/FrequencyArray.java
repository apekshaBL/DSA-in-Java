package SortingAlgorithm;
import java.util.Scanner;
public class FrequencyArray {
    static void PrintArray(int[]array){
        for(int i=0;i<array.length;i++){
            System.out.print(array[i]+" ");
        }
    }
    static int findMax(int[]array){
        int max=Integer.MIN_VALUE;
        for(int i=0;i<array.length;i++){
            if(array[i]>max){
                max=array[i];

            }
        }
        return max;
    }
    static void count_sort(int []array){
        //to find Largest element of array

       int max=findMax(array);
       int []count=new int[max+1];
       for(int i=0;i<array.length;i++){
           count[array[i]]++;
       }
       int k=0;
       for(int i=0;i<count.length;i++){
           for(int j=0;j<count[i];j++){
               array[k++]=i;
            }
        }

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n=sc.nextInt();
        int []array=new int[n];
        System.out.println("Enter the elements of array");
        for(int i=0;i<n;i++){
            array[i]=sc.nextInt();
        }
        System.out.println("Original array is");
        PrintArray(array);
        System.out.println();
        System.out.println("Sorted frequency array is");
        count_sort(array);
        PrintArray(array);
    }
}
