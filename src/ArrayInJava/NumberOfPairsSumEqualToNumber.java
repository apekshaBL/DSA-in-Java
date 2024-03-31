package ArrayInJava;
import java.util.Scanner;
public class NumberOfPairsSumEqualToNumber {
    public static void PrintArray(int []array){
        for(int i=0;i<array.length;i++){
            System.out.print(array[i]+" ");
        }
        System.out.println();
    }
    public static int CountPair(int [] array,int num){
        int count=0;
        for(int i=0;i<array.length;i++){
            for(int j=i+1;j<array.length;j++){
                if(array[i]+array[j]==num ){
                    count=count+1;
                    array[i]++;
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
        System.out.println("Enter the number ");
        int b=sc.nextInt();
        System.out.println("Number of pairs that gives " +b+ " sum is " +CountPair(array,b));



    }
}
