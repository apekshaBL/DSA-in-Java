package SortingAlgorithm;
import java.util.Scanner;
public class SortArrayOfNegPositive {
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
        int n=array.length;
        if(n<=1){
            return;
        }
        int left=0;
        int right=n-1;
        while(left<=right){
            while( left<n && array[left]<0 ){
                left++;
            }
            while(right>=0&&array[right]>0){
                right--;
            }
            if(left<right){
                Swap(array,left,right);
                left++;
                right--;
            }
        }

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n=sc.nextInt();
        int []array=new int[n];
        System.out.println("Enter the negative and positive integer elements of array");
        for(int i=0;i<n;i++){
            array[i]=sc.nextInt();
        }
        System.out.println("Original unsorted array of positive and negative integers is");
        PrintArray(array);
        System.out.println("Sorted array is");
        Sort(array);
        PrintArray(array);

    }

}
