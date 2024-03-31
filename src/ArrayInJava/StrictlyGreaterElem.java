package ArrayInJava;
import java.sql.SQLOutput;
import java.util.Scanner;
public class StrictlyGreaterElem {
    public static void PrintArray(int[] array){
        for(int i=0;i<array.length;i++){
            System.out.print(array[i]+" ");
        }
        System.out.println();
    }
    public static int Greater(int[]array,int num){
        int greatest=0;
        for(int i=0;i<array.length;i++){
            if(array[i]>num){
                greatest=array[i];
            }
        }
        return greatest;
    }
    public static void main(String[]args){
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
        System.out.println("Enter the element whose strictly greater element you have to find");
        int a=sc.nextInt();
        System.out.println(Greater(array,a) +" is strictly greater than " +a);
    }
}
