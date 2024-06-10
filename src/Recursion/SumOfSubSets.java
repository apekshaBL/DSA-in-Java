package Recursion;
import java.util.Scanner;
public class SumOfSubSets {
    static void PrintArray(int[]array){
        for(int i=0;i<array.length;i++){
            System.out.print(array[i]+" ");
        }
        System.out.println();

    }
    static void SumOfSubset(int[]array,int n,int idx,int sum){
        if(idx>=n){
            System.out.println(sum);
            return;
        }
        SumOfSubset(array,n,idx+1,sum+array[idx]);
        SumOfSubset(array,n,idx+1,sum);

    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n=sc.nextInt();
        System.out.println("Enter the array of Integers");
        int []array=new int[n];
        for(int i=0;i<n;i++){
            array[i]=sc.nextInt();
        }
        System.out.println("Our array of Integer is");
        PrintArray(array);
        System.out.println("Sum of subset is");
        SumOfSubset(array,n,0,0);


    }
}
