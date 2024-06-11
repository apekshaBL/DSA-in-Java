package SortingAlgorithm;
import java.util.Scanner;
public class QuickSortDecreasing {
    static void PrintArray(int[]array){
        for(int i=0;i<array.length;i++){
            System.out.print(array[i]+" ");
        }
    }
    static void Swap(int[]array,int l,int r){
        int temp=array[l];
        array[l]=array[r];
        array[r]=temp;
    }
    static int partition(int[]array,int l,int r){
        int pivot =array[l];
        int count=0;
        for(int i=l+1;i<=r;i++){
            if(array[i]>=pivot){
                count++;
            }
        }
        int pivotIdx=l+count;
        Swap(array,l,pivotIdx);
        int i=l,j=r;
        while(i<pivotIdx && j> pivotIdx){
            while(array[i]>=pivot)i++;
            while(array[j]<pivot)j--;
            if(i<pivotIdx && j>pivotIdx){
                Swap(array,i,j);
                i++;
                j--;
            }
        }
        return pivotIdx;
    }
    static void SortQuick(int array[],int l,int r){
        if(l>=r){
            return;
        }
        int pi=partition(array,l,r);
        SortQuick(array,l,pi-1);
        SortQuick(array,pi+1,r);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n=sc.nextInt();
        int[]array=new int[n];
        System.out.println("Enter the elements of array");
        for(int i=0;i<n;i++){
            array[i]=sc.nextInt();
        }
        System.out.println("Unsorted original array is");
        PrintArray(array);
        System.out.println();
        System.out.println("Sorted array in Decreasing order is");
        SortQuick(array,0,n-1);
        PrintArray(array);

    }
}
