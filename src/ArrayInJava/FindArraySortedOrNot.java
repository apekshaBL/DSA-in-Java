package ArrayInJava;
import java.util.Scanner;
public class FindArraySortedOrNot {
    public static void PrintArray(int[]array){
        for(int i=0;i<array.length;i++){
            System.out.print(array[i]+" ");
        }
        System.out.println();
    }
    public static boolean SortedOrNot(int []array){
        for(int i=0;i<array.length;i++){
            for(int j=i+1;j<array.length;j++){
                if(array[i]<array[j] && array[j]<array[j+1]){
                    return true;
                }
                else{
                    return false;
                }
            }
        }
        return false;
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n=sc.nextInt();
        int [] array=new int[n];
        System.out.println("enter the elements of array");
        for(int i=0;i<array.length;i++){
            array[i]=sc.nextInt();
        }
        System.out.println("Our array is");
        PrintArray(array);
        System.out.println("The above array is sorted in increasing Order this is " +SortedOrNot(array));


    }
}
