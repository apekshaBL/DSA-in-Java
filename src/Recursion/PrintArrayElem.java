package Recursion;
import java.util.Scanner;
public class PrintArrayElem {
    static void PrintArray(int []array,int idx){
       if(idx==array.length){
           return;
       }
        System.out.println(array[idx]);
        PrintArray(array,idx+1);
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n=sc.nextInt();
        int array[]=new int[n];
        System.out.println("Enter elements of array");
        for(int i=0;i<n;i++){
            array[i]=sc.nextInt();
        }
        System.out.println("Our array is ");
        PrintArray(array,0);

    }
}
