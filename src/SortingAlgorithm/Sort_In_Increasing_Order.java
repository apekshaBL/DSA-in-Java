package SortingAlgorithm;
import java.util.Arrays;
import java.util.Scanner;
public class Sort_In_Increasing_Order {
    static void PrintArray(int[]array){
        for(int i=0;i< array.length;i++){
            System.out.print(array[i]+" ");
        }
    }
    static void merge(int[]array,int l,int mid,int r){
        int n1=mid-l+1;
        int n2=r-mid;
        int[]left=new int[n1];
        int[]right=new int[n2];
        int i,j,k;
        for(i=0;i<n1;i++){
            left[i]=array[l+i];
        }
        for(j=0;j<n2;j++){
            right[j]=array[mid+1+j];
        }
        i=0;
        j=0;
        k=l;
        while(i<n1 && j<n2){
            if(left[i]<right[j]){
                array[k]=left[i];
                k++;
                i++;

            }
            else{
                array[k]=right[j];
                k++;
                j++;
            }

        }
        while(i<n1){
            array[k++]=left[i++];
        }
        while(j<n2){
            array[k++]=right[j++];
        }

    }
    static void Merge_Sort(int[]array,int l,int r){
        if(l>=r){
            return;
        }
        int mid=(l+r)/2;
        Merge_Sort(array,l,mid);
        Merge_Sort(array,mid+1,r);
        merge(array,l,mid,r);


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
        System.out.println("Our original unsorted array is");
        PrintArray(array);
        System.out.println();
        System.out.println("Sorted array in increasing order is");
        Merge_Sort(array,0,n-1);
        PrintArray(array);

    }
}
