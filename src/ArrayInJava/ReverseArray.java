package ArrayInJava;
import java.util.Scanner;
public class ReverseArray {
    public static void PrintArray(int[]array){
        for(int i=0;i<array.length;i++){
            System.out.print(array[i]+" ");
        }
        System.out.println();
    }
    public static void Reverse(int[] array){
        int n=array.length;
        for(int i=n-1;i>=0;i--){
            System.out.print(array[i]+" ");
        }
        System.out.println();
    }

    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n=sc.nextInt();
        int [] array=new int[n];
        System.out.println("Enter the elements of array");
        for(int i=0;i<array.length;i++){
            array[i]=sc.nextInt();
        }
        System.out.println("Our array is");
        PrintArray(array);
        System.out.println("Reverse array is");
        Reverse(array);

    }
}
