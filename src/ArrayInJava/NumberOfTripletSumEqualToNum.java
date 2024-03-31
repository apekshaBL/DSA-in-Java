package ArrayInJava;
import java.util.Scanner;
public class NumberOfTripletSumEqualToNum {
    public static void PrintArray(int[] array){
        for(int i=0;i<array.length;i++){
            System.out.print(array[i]+" ");
        }
        System.out.println();
    }
    public static int countPair(int[]array,int target){
        int count=0;
        for(int i=0;i<array.length;i++){
            for(int j=i+1;j<array.length-1;j++){
                if (array[i] + array[j] + array[j+1]==target) {
                    count=count+1;
                }
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
        System.out.println("Our array is");
        PrintArray(array);
        System.out.println("Enter the targeted sum");
        int a=sc.nextInt();
        System.out.println("The number of triple pairs of " +a+ " is " +countPair(array,a));




    }
}
