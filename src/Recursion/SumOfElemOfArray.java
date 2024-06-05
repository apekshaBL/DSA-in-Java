package Recursion;
import java.util.Scanner;
public class SumOfElemOfArray {
    static void PrintArray(int[]array,int idx){
        if(idx==array.length){
            return;
        }
        System.out.println(array[idx]);
        PrintArray(array,idx+1);
    }
    static int Sum(int []array,int idx){
        if(idx==array.length-1){
            return array[idx];
        }
        int a=Sum(array,idx+1);
        return a+array[idx];
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n=sc.nextInt();
        int[]array=new int[n];
        System.out.println("Enter elements of array");
        for(int i=0;i<n;i++){
            array[i]=sc.nextInt();
        }
        System.out.println("Our array is");
        PrintArray(array,0);
        System.out.println("Sum of all the elements of array is");
        System.out.println(Sum(array,0));


    }
}
