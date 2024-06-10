package SortingAlgorithm;
import java.util.Scanner;
public class sortindecreasing {
    static void Decreasing(int[]array){
        int n=array.length;
        for(int i=0;i<n-1;i++){
            int max_idx=i;
            for(int j=i+1;j<n;j++){
                if(array[max_idx]<array[j]){
                    max_idx=j;
                }
            }
            int temp=array[i];
            array[i]=array[max_idx];
            array[max_idx]=temp;
        }

    }
    static void PrintArray(int[]array){
        for(int i=0;i<array.length;i++){
            System.out.print(array[i]+" ");
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of array");
        int n=sc.nextInt();
        int[]array=new int[n];
        System.out.println("Enter elements of array");
        for(int i=0;i<n;i++){
            array[i]=sc.nextInt();
        }
        System.out.println("Sorted array in Decreasing order");
        Decreasing(array);
        PrintArray(array);
    }
}
