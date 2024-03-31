package ArrayInJava;
import java.util.Scanner;
public class MinimumElementInArray {
    public static void PrintArray(int []array){
        for(int i=0;i<array.length;i++){
            System.out.print(array[i]+" ");
        }
        System.out.println();
    }
    public static int Min(int []array){
        int min=0;
        for(int i=0;i<array.length;i++){
            for(int j=i+1;j<array.length;j++){
                if(array[i]<array[j] && array[i]<array[j+1]){
                    min=array[i];
                    array[i]++;
                }
                return min;
            }
        }
        return 0;
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
        System.out.println("Our minimum element of above array is");
        System.out.println(Min(array));


    }
}
