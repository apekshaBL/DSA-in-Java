package ArrayInJava;
import java.util.Scanner;
public class SquareOfElemOfArray {
    public static void PrintArray(int[]array){
        for(int i=0;i<array.length;i++){
            System.out.print(array[i]+" ");
        }
        System.out.println();
    }
   public static int[] SquareOfArray(int[]array){
        int n=array.length;
        int []ans=new int[n];
        int left=0;
        int right=n-1;
        int k=0;
        while(left<=right){
            if(Math.abs(array[left])>Math.abs(array[right])){
                ans[k++]=array[left]*array[left];
                left++;
            }else{
                ans[k++]=array[right]*array[right];
                right--;

            }
        }
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
        int [] ans=SquareOfArray(array);
        System.out.println("Sorted array is");
        PrintArray(ans);
    }
}
