package TwoDimentionalArray;
import java.util.Scanner;
public class SumOfMatrix {
    public static void PrintMatrix(int[][]array,int r,int c){
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                System.out.print(array[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static int[][] Sum(int[][]matrix1,int[][] matrix2,int r,int c){
        int [][]SumMatrix=new int[r][c];
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                SumMatrix[i][j]=matrix1[i][j]+matrix2[i][j];
            }
        }
        return SumMatrix;
    }
    public static void main(String[]args){

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of rows of matrix");
        int r=sc.nextInt();
        System.out.println("Enter the number of columns of matrix");
        int c=sc.nextInt();
        int[][]matrix1=new int[r][c];
        System.out.println("Enter the elements of matrix");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                matrix1[i][j]=sc.nextInt();
            }
        }
       int[][]matrix2=new int[r][c];
        System.out.println("Enter the elements of matrix two");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                matrix2[i][j]=sc.nextInt();
            }
        }
        System.out.println("Our two matrix are");
        PrintMatrix(matrix1,r,c);
        System.out.println();
        PrintMatrix(matrix2,r,c);
        System.out.println("The sum of Above two matrix is");
        int [][]ans=Sum(matrix1,matrix2,r,c);
        PrintMatrix(ans,r,c);



    }
}
