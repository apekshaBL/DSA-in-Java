package BinarySearchAlgorithm;
import java.util.Scanner;

public class SearchIndexInRotatedSortedArray {
    static void PrintArray(int[]array){
        for(int i=0;i<array.length;i++){
            System.out.print(array[i]+" ");
        }
        System.out.println();
    }
    static int search_index(int[]array,int target){
        int n=array.length;
        int str=0;
        int end=n-1;

        while(str<=end){
            int mid=str+(end-str)/2;

            if(target==array[mid]){
                return mid;
            }

            if(array[str]<=array[mid]){
                if(array[str]<=target && target <array[mid]){
                    end=mid-1;
                }
            else{
                str=mid+1;

            }
        }
            else{
                if(array[mid]<target && target<=array[end]){
                        str=mid+1;
                }
                else{
                    end=mid-1;
                }
                }
            }

        return -1;

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of array");
        int n=sc.nextInt();
        int[]array=new int[n];
        System.out.println("Enter the elements of sorted rotated array");
        for(int i=0;i<n;i++){
            array[i]=sc.nextInt();
        }
        System.out.println("Sorted rotated array is");
        PrintArray(array);
        System.out.println("Enter the targeted element whose index is to be searched in the array");
        int a=sc.nextInt();
        System.out.println("The index of target element in above array is");
        System.out.println(search_index(array,a));



    }
}
