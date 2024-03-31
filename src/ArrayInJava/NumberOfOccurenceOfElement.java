package ArrayInJava;
import java.util.Scanner;
public class NumberOfOccurenceOfElement {
    public static void PrintArray(int[] array){
        for(int i=0;i<array.length;i++){
            System.out.print(array[i]+" ");
        }
        System.out.println();
    }
    public static int NumberOfOcc(int[] array,int num){
        int count=0;
        for(int i=0;i<array.length;i++){
            if(array[i]==num){
                count=count+1;
            }
        }
       return count;
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
        System.out.println("Our array is-");
        PrintArray(array);
        System.out.println("Enter the number whose occurence you have to count");
        int a=sc.nextInt();
        System.out.println(a +" is present " +NumberOfOcc(array,a) + " times");



    }
}
