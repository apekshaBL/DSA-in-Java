package BinarySearchAlgorithm;
import java.util.Scanner;
public class SearchIn2DArray {
    static void PrintArray(int[][]array,int n,int m){
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print(array[i][j]+" ");
            }
            System.out.println();
        }
    }
    static int Search(int [][]array,int target){
        if(array.length<=1){
           return array[0][0];
        }
        int n=array.length;//row length
        int m=array[0].length;//column no
        int str=0;
        int end=n*m-1;
        while(str<=end) {
            int mid = str + (end - str) / 2;
            int midEle = array[mid / m][mid % m];//row number array[mid/m] and column number[mid%m]
            if (midEle == target) {
                return midEle;
            } else if (target < midEle) {
                end = mid - 1;
            } else
                str = mid + 1;
        }
        return -1;

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of rows array");
        int n=sc.nextInt();
        System.out.println("Enter the number of columns of array");
        int m=sc.nextInt();
        int[][]array=new int[n][m];
        System.out.println("Enter the elements of 2D Array");
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                array[i][j]=sc.nextInt();
            }
        }
        System.out.println("Our Entered 2D array is:-");
        PrintArray(array,n,m);
        System.out.println("Enter the target element to be searched");
        int target=sc.nextInt();
        if (target == Search(array, target)) {
            System.out.println("True");
        }
        else{
            System.out.println(false);
        }


    }
}
