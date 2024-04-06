package ArrayInJava;
import java.util.Scanner;
public class SubArray {
    public static void PrintArray(int[]array){
        for(int i=0;i<array.length;i++){
            System.out.print(array[i]+" ");
        }
        System.out.println();
    }
    public static int TotalSum(int[]array) {
        int sum=0;
    for(int i=0;i<array.length;i++){
        sum=sum+array[i];
    }
    return sum;
    }
    public static Boolean SubArray(int[]array){
        int totalSum=TotalSum(array);
        int prefixSum=0;
        for(int i=0;i<array.length;i++){
            prefixSum=prefixSum+array[i];
            int suffixSum=totalSum-prefixSum;
            if(suffixSum==prefixSum){
                return true;
            }
        }
     return false;

    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n=sc.nextInt();
        int[]array=new int[n];
        System.out.println("Enter the elements of array");
        for(int i=0;i<array.length;i++){
            array[i]=sc.nextInt();
        }
        System.out.println("Our array is");
        PrintArray(array);
        System.out.println("The above array can be divided into to sub part whose each part sum is equal to each other :-");
        System.out.println(SubArray(array));

    }
}
