package BinarySearchAlgorithm;
import java.util.Scanner;
public class lastOccurrence {
    static void PrintArray(int[]array){
        for(int i=0;i<array.length;i++){
            System.out.print(array[i]+" ");
        }
        System.out.println();
    }
    /*static void Sort(int[]array){
        for(int i=0;i<array.length-1;i++){
            for(int j=i+1;j<array.length;j++){
                if(array[i]<array[j]){
                    int temp=array[i];
                    array[i]=array[j];
                    array[j]=temp;
                }
            }
        }
    }*/
    static int last_Occurrence(int[]array,int target){
        //Sort(array);
        int n=array.length;
        int str=0;
        int end=n-1;
        int last_occurrence=-1;
        while(str<=end){
            int mid=str+(end-str)/2;
            if(array[mid]==target){
                last_occurrence=mid;
                str=mid+1;
            }
            else if(target<array[mid]){
                end=mid-1;

            }
            else{
                str=mid+1;
            }
        }
        return last_occurrence;

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n=sc.nextInt();
        int[]array=new int[n];
        System.out.println("Enter the elements of array in sorted manner ");
        for(int i=0;i<n;i++){
            array[i]=sc.nextInt();
        }
        System.out.println("Original sorted array is ");
        PrintArray(array);
        System.out.println("Enter the target element");
        int target=sc.nextInt();
        System.out.println("last Occurrence of target element is");
        System.out.println(last_Occurrence(array,target));




    }
}
