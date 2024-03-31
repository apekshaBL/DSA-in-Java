package ArrayInJava;
import java.util.Arrays;
import java.util.Scanner;
public class FindNsmallestAndLargestElem {
    public static void PrintArray(int[] array){
        for(int i=0;i<array.length;i++){
            System.out.print(array[i]+" ");
        }
        System.out.println();
    }
    public static int[] NSmallestNLargest(int []array,int a,int b){
        int n=array.length;
        Arrays.sort(array);
        int []ans={array[a-1],array[b]};
        return ans;

    }

    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n=sc.nextInt();
        int[]array=new int[n];
        System.out.println("enter the elements of array");
        for(int i=0;i<array.length;i++){
            array[i]=sc.nextInt();
        }
        System.out.println("Our array is");
        PrintArray(array);
        System.out.println("Enter the N smallest number");
        int a=sc.nextInt();
        System.out.println("Enter the N largest number");
        int b=sc.nextInt();
        int [] ans= NSmallestNLargest(array,a,b);
        PrintArray(ans);


    }
}
