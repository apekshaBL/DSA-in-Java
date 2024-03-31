package ArrayInJava;
import java.util.Scanner;
public class SearchFroElement {
    public static void PrintArray(int[] array){
        for(int i=0;i<array.length;i++){
            System.out.print(array[i]+" ");
        }
        System.out.println();
    }
    public static int Search(int array[],int num){
        for(int i=0;i<array.length;i++){
            if(array[i]==num || array[i+1]==num){
                return 1;
            }
            else{
                return -1;
            }
        }
        return 0;
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n=sc.nextInt();
        int[] array=new int[n];
        System.out.println("Enter the elements of array");
        for(int i=0;i<array.length;i++){
            array[i]=sc.nextInt();
        }
        System.out.println("Our array is");
        PrintArray(array);
        System.out.println("Enter the number you want to search in the above array");
        int a=sc.nextInt();//number to search taken input
        System.out.println(Search(array,a));
    }
}
