package SortingAlgorithm;
import java.util.Scanner;
public class RadixSort {
    static void PrintArray(int[]array){
        for(int i=0;i<array.length;i++){
            System.out.print(array[i]+" ");
        }
    }
    static int findMax(int[]array){
        int max=Integer.MIN_VALUE;
        for(int i=0;i<array.length;i++){
            if(array[i]>max) {
                max = array[i];
            }

        }
        return max;
    }
    static void countSort(int[]array,int place){
        int n=array.length;
        int[]output=new int[n];
        int []count=new int[10];
        //frequency array
        for(int i=0;i<array.length;i++){
            count[(array[i]/place)%10]++;
        }
        //make prefix sum
        for(int i=1;i<count.length;i++){
            count[i]+=count[i-1];
        }
        //find the index of each element in original array and put it in output array
        for(int i=n-1;i>=0;i--){
            int idx=count[(array[i]/place)%10]-1;
            output[idx]=array[i];
            count[(array[i]/place)%10]--;
        }
        //copy all elements of output to array
        for(int i=0;i<n;i++){
            array[i]=output[i];
        }
    }

    static void radixSort(int[]array){
        int max=findMax(array);
        for(int place=1;max/place>0;place*=10){
            countSort(array,place);
        }

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
        System.out.println("Original array is");
        PrintArray(array);
        System.out.println();
        System.out.println("Sorted array by radix sort algorithm is");
        radixSort(array);
        PrintArray(array);

    }
}
