package Recursion;
import java.util.Scanner;
public class ProductOfElemInArray {
    static void PrintArray(int[]array,int idx){
        if(idx==array.length){
            return;
        }
        System.out.println(array[idx]);
        PrintArray(array,idx+1);
    }
    static int Product(int[]array,int idx){
        if(idx==array.length-1){
            return array[idx];
        }
        int a=Product(array,idx+1);
        return array[idx]*a;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of array");
        int n=sc.nextInt();
        int []array=new int[n];
        System.out.println("Enter elements of array");
        for(int i=0;i<n;i++){
            array[i]=sc.nextInt();
        }
        System.out.println("Our array is");
        PrintArray(array,0);
        System.out.println("Product of all elements of array is");
        System.out.println(Product(array,0));



    }
}
