package BinarySearchAlgorithm;
import java.util.Scanner;
public class SearchInRotatedSortedArray {
    static void PrintArray(int[]array){
        for(int i=0;i<array.length;i++){
            System.out.print(array[i]+" ");
        }
        System.out.println();
    }
    static int min_search(int[]array){
        int n=array.length;
        int str=0;
        int end=n-1;
        int min_value=-1;
        while(str<=end){
            int mid=str+(end-str)/2;
            if(array[mid]<=array[n-1]){
                min_value=array[mid];
                end=mid-1;
            }
            else{
                str=mid+1;
            }
        }
        return min_value;

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n=sc.nextInt();
        int [] array=new int[n];
        System.out.println("Enter the sorted elements of rotated array"); //eg. 10 11 12 1 2 3 4 5 6 7 8 9
        for(int i=0;i<n;i++){
            array[i]=sc.nextInt();
        }
        System.out.println("Sorted rotated array is");
        PrintArray(array);
        System.out.println("minimum element in this array is");
        System.out.println(min_search(array));

    }
}
