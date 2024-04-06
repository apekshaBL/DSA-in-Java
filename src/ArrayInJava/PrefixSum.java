package ArrayInJava;
import java.util.Scanner;
public class PrefixSum {
    public static void PrintArray(int[]array){
        for(int i=0;i<array.length;i++){
            System.out.print(array[i]+" ");
        }
        System.out.println();
    }
    public static int[] PrefixSum(int[]array){
        for(int i=1;i<array.length;i++){
            array[i]=array[i]+array[i-1];
        }
        return array;
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n=sc.nextInt();
        int []array=new int[n];
        System.out.println("Enter the size of array");
        for(int i=0;i<array.length;i++){
            array[i]=sc.nextInt();
        }
        System.out.println("Our array is");
        PrintArray(array);
        System.out.println("The prefix sum of above array is");
        PrintArray(PrefixSum(array));

    }
}
