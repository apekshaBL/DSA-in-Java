package SortingAlgorithm;
import java.util.Scanner;
public class QuickSortIncreasingly {
    static void PrintArray(int[]array){
        for(int i=0;i<array.length;i++){
            System.out.print(array[i]+" ");
        }
    }
    static void Swap(int[]array,int x,int y){
        int temp=array[x];
        array[x]=array[y];
        array[y]=temp;
    }
    static int partition(int []array,int l,int r){
        int pivot=array[l];
        int count=0;
        for(int i=l+1;i<=r;i++){
            if(array[i]<=pivot){
                count++;
            }
        }
        int pivotIdx=l+count;
        Swap(array,l,pivotIdx);
        int i=l,j=r;
        //less element will come to left side and larger to right side
        while(i<pivotIdx && j> pivotIdx){
            while(array[i]<=pivot)i++;
            while(array[j]>pivot)j--;
            if(i<pivotIdx && j>pivotIdx){
                Swap(array,i,j);
                i++;
                j--;

            }
        }

     return pivotIdx;
    }
    static void Quick_Sort(int[]array,int l,int r){
        if(l>=r){
            return;
        }
        int pi=partition(array,l,r);
        Quick_Sort(array,l,pi-1);
        Quick_Sort(array,pi+1,r);

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n=sc.nextInt();
        int []array=new int[n];
        System.out.println("Enter the elements of array");
        for(int i=0;i<n;i++){
            array[i]=sc.nextInt();
        }
        System.out.println("Original unsorted array is");
        PrintArray(array);
        System.out.println();
        System.out.println("Sorted array in Increasing Order is");
        Quick_Sort(array,0,n-1);
        PrintArray(array);

    }
}
