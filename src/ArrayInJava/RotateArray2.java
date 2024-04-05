package ArrayInJava;
import java.util.Scanner;

public class RotateArray2 {
    public static void PrintArray(int[]array){
        for(int i=0;i<array.length;i++){
            System.out.print(array[i]+" ");
        }
        System.out.println();
    }
    public static int[] RotateArray(int [] array,int a){
        //a is number of  times the rotation we want
        int n=array.length;
        a=a%n;
        int ans[]=new int[n];
        int l=0; //indexing of ans array
        for(int i=n-a;i<n;i++){ //this loop is from n-1 to length of array
            ans[l++]=array[i];
        }
        for(int i=0;i<n-a;i++){ //this loop is from 0 t0 n-1 index
            ans[l++]=array[i];
        }
        return ans;

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
        System.out.println("Enter the number of rotation");
        int num=sc.nextInt();
        System.out.println("Our rotated array is");
        int []ans=RotateArray(array,num);
        PrintArray(ans);
    }
}
