package ArrayInJava;
import java.util.Arrays;
import java.util.Scanner;
public class SecondLargestElem {
    public static void PrintArray(int[]array){
        for(int i=0;i<array.length;i++){
            System.out.print(array[i]+" ");
        }
        System.out.println();
    }
    public static int[] SecondLargest(int[]array,int size){
        Arrays.sort(array);
        int []ans={array[size-2]};
        return ans;
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n=sc.nextInt();
        int []array=new int[n];
        System.out.println("Enter the elements of the array");
        for(int i=0;i<array.length;i++){
            array[i]=sc.nextInt();
        }
        System.out.println("Our array is-");
        PrintArray(array);
        int []ans=SecondLargest(array,n);
        PrintArray(ans);

    }
}
