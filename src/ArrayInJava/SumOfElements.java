package ArrayInJava;
import java.util.Scanner;
public class SumOfElements {
    public static void PrintArray(int[] array){
        for(int i=0;i<array.length;i++){
            System.out.print(array[i]+" ");
        }
        System.out.println();
    }
    public static int Sum(int []array){
        int sum=0;
        for(int i=0;i<array.length;i++){
            sum=sum+array[i];
            array[i]++;
        }
        return sum;
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n=sc.nextInt();
        int []array=new int[n];
        System.out.println("Enter the elements of array");
        for(int i=0;i<n;i++){
            array[i]=sc.nextInt();
        }
        System.out.println("Our array is");
        PrintArray(array);
        System.out.println("Sum of all elements of array is");
        System.out.println(Sum(array));




    }
}
