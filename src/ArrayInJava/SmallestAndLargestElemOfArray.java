package ArrayInJava;
import java.util.Arrays;
import java.util.Scanner;
public class SmallestAndLargestElemOfArray {
    public static void PrintArray(int []array){
        for(int i=0;i<array.length;i++){
            System.out.print(array[i]+" ");
        }
        System.out.println();
    }
    public static int[] LargeSmall(int[] array){
        int n=array.length;
        Arrays.sort(array);
        int[] ans={array[0],array[n-1]};
        return ans;
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
        System.out.println("The smallest and largest Element of array is");
        int []ans= LargeSmall(array);
       PrintArray(ans);




    }
}
