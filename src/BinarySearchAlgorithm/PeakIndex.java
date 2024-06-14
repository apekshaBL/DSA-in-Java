package BinarySearchAlgorithm;
import java.util.Scanner;
public class PeakIndex {
    static void PrintArray(int[]array){
        for(int i=0;i<array.length;i++){
            System.out.print(array[i]+" ");
        }
        System.out.println();
    }
    static int index(int[]array){
        int n=array.length;
        int str=0;
        int end=n-1;
        int index=-1;
        while(str<=end){
            int mid=str+(end-str)/2;
            if(array[mid]>array[mid+1] && array[mid]>array[mid-1] ){
                return mid;
            }
            else if(array[mid]<array[mid+1] ){
                str=mid+1;
                index=mid+1;
            }
            else if(array[mid]<array[mid-1]){
                end=mid-1;
               index=mid-1;

            }

        }
        return index;

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n=sc.nextInt();
        int[]array=new int[n];
        System.out.println("Enter the elements of array in mountain structure");
        for(int i=0;i<n;i++){
            array[i]=sc.nextInt();
        }
        System.out.println("Original array is");
        PrintArray(array);
        System.out.println("Peak index of element in array is");
        System.out.println(index(array));



    }
}
