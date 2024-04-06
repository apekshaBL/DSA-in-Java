package ArrayInJava;
import java.sql.SQLOutput;
import java.util.Scanner;
public class PrefixSumInArray {
    public static void PrintArray(int[]array){
        for(int i=0;i<array.length;i++){
            System.out.print(array[i]+" ");
        }
        System.out.println();
    }
    public static int[] PrefixSum(int[]array){
        int n=array.length;
        int [] PrefixArray=new int[n];
        PrefixArray[0]=array[0];
        for(int i=1;i<n;i++){
            PrefixArray[i]=PrefixArray[i-1]+array[i];
        }
        return PrefixArray;

    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size the of array");
        int n=sc.nextInt();
        int[]array=new int[n];
        System.out.println("Enter the elements of array ");
        for(int i=0;i<array.length;i++){
            array[i]=sc.nextInt();
        }
        System.out.println("Our array is");
        PrintArray(array);
        System.out.println("The array of its Prefix sum is");
        int []ans=PrefixSum(array);
        PrintArray(ans);


    }
}
