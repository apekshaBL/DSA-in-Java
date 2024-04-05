package ArrayInJava;
import java.util.Scanner;
public class Sorting0and1ElemArray {
    public static void PrintArray(int[]array){
        for(int i=0;i<array.length;i++){
            System.out.print(array[i]+" ");
        }
        System.out.println();
    }
    public static void Swap(int[]array,int i,int j){
        int temp=array[i];
        array[i]=array[j];
        array[j]=temp;
    }
    public static void Sort(int[]array){
        int n=array.length;
        int left=0;
        int right=n-1;
        while(left<right){
            if(array[left]==1 && array[right]==0){
                Swap(array,left,right);
                left++;
                right--;
            }
            if(array[left]==0){
                left++;
            }
            if(array[right]==1){
                right--;
            }
        }

    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n=sc.nextInt();
        int []array=new int[n];
        System.out.println("Enter the elements of array");
        for(int i=0;i<array.length;i++){
            array[i]=sc.nextInt();
        }
        System.out.println("Our array is");
        PrintArray(array);
        System.out.println("Our Sorted array is");
        Sort(array);
        PrintArray(array);
    }
}
