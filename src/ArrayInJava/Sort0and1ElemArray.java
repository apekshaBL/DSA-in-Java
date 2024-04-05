package ArrayInJava;
import java.util.Scanner;
public class Sort0and1ElemArray {
    public static void PrintArray(int[]array){
        for(int i=0;i<array.length;i++){
            System.out.print(array[i]+" ");
        }
        System.out.println();
    }
    public static int[] Sorted(int []array){
        int n=array.length;
        int count=0;
        int[] ans=new int[n];
        for(int i=0;i<n;i++){
            if(array[i]==0){
                count=count+1;
            }
        }
        for(int i=0;i<n;i++){
           if(i<count){
               ans[i]=0;
           }
           else{
               ans[i]=1;
           }
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n=sc.nextInt();
        int[]array=new int[n];
        System.out.println("Enter the 0 and 1 elements of array");
        for(int i=0;i<array.length;i++){
            array[i]=sc.nextInt();
        }
        System.out.println("Our array is");
        PrintArray(array);
        System.out.println("Sorted array of 0 and 1 is");
        int []ans=Sorted(array);
        PrintArray(ans);

    }



}
