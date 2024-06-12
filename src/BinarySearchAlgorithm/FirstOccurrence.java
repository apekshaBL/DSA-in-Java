package BinarySearchAlgorithm;
import java.util.Scanner;

public class FirstOccurrence {
    static void PrintArray(int[]array){
        for(int i=0;i<array.length;i++){
            System.out.print(array[i]+" ");
        }
        System.out.println();
    }
    static int  Find(int[]array,int target){
        int n=array.length;
        int str=0;
        int end=n-1;
        int first_occurrence=-1;
        while(str<=end){
            int mid=str+(end-str)/2;
            if(array[mid]==target){
                first_occurrence=mid;
                end=mid-1;

            }
            else if(target<array[mid]){
               end=mid-1;
            }
            else{
                str=mid+1;
            }
        }
        return first_occurrence;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter the size of array");
        int n=sc.nextInt();
        int[]array=new int[n];
        System.out.println("Enter the elements of array");
        for(int i=0;i<n;i++){
            array[i]=sc.nextInt();
        }
        System.out.println("Original array is");
        PrintArray(array);
        System.out.println("Enter the targeted element whose 1st occurrence is to search");
        int target=sc.nextInt();
        System.out.println("The 1st occurrence of target element is");
        System.out.println(Find(array,target));

    }
}
