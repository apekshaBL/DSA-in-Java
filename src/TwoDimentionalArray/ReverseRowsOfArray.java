package TwoDimentionalArray;
import java.sql.SQLOutput;
import java.util.Scanner;
public class ReverseRowsOfArray {
    public static void PrintArray(int [][]array,int r,int c){
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                System.out.print(array[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static int[][] ReversedArray(int[][]array,int r,int c){
        int [][]ans=new int[r][c];
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                ans[i][j]=array[i][c-1-j];
            }
        }
        return ans;
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of Rows of array ");
        int r=sc.nextInt();
        System.out.println("Enter the number of columns of array");
        int c=sc.nextInt();
        int[][]array=new int[r][c];
        System.out.println("Enter the elements of array");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                array[i][j]=sc.nextInt();
            }
        }
        System.out.println("Our 2D array is");
        PrintArray(array,r,c);
        System.out.println("Reversed array is");
        int[][]ans=ReversedArray(array,r,c);
        PrintArray(ans,r,c);

    }
}
