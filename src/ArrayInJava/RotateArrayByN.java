package ArrayInJava;
import java.sql.SQLOutput;
import java.util.Scanner;
public class RotateArrayByN {
    public static void PrintArray(int[]array){
        for(int i=0;i<array.length;i++){
            System.out.print(array[i]+" ");
        }
        System.out.println();
    }
    public static int [] Rotate(int[] array,int num){
        int n=array.length;
        num=num%n;
        int []ans=new int[n];
        int j=0;
        for(int i=n-num;i<n;i++){
            ans[j++]=array[i];
        }
        for(int i=0;i<n-num;i++){
            ans[j++]=array[i];
        }
        return ans;

    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n=sc.nextInt();
        int [] array=new int[n];
        System.out.println("Enter the elements of array");
        for(int i=0;i<array.length;i++){
            array[i]=sc.nextInt();
        }
        System.out.println("Our array is");
        PrintArray(array);
        System.out.println("Enter the number of rotation");
        int a=sc.nextInt();
        System.out.println("Rotated array is");
        int []ans=Rotate(array,a);
        PrintArray(ans);


    }
}
