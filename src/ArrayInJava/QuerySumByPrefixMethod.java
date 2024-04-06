package ArrayInJava;
import java.util.Scanner;
public class QuerySumByPrefixMethod {
    public static void PrintArray(int[]array){
        for(int i=1;i<array.length;i++){
            System.out.print(array[i]+" ");
        }
        System.out.println();
    }
    public static int SumOfQuery (int[]array,int l,int r){
        int sum=0;
        for(int i=2;i<array.length;i++){
            array[i]=array[i]+array[i-1];
            sum=array[r]-array[l-1];
        }
        return sum;
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n=sc.nextInt();
        int[]array=new int[n+1];
        System.out.println("Enter the elements of array");
        for(int i=1;i<array.length;i++){
            array[i]=sc.nextInt();
        }
        System.out.println("Our array is");
        PrintArray(array);
        System.out.println("enter the starting range");
        int l=sc.nextInt();
        System.out.println("Enter the ending range");
        int r=sc.nextInt();
        System.out.println("Sum of queries is");
        System.out.println(SumOfQuery(array,l,r));

    }
}
