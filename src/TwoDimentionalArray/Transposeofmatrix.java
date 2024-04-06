package TwoDimentionalArray;
import java.util.Scanner;
public class Transposeofmatrix {
    public static void PrintMatrix(int[][]matrix){
        for(int i=0;i< matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static int[][] Transpose(int[][]matrix,int r,int c){
        int[][] Transpose=new int[c][r];
        for(int i=0;i<c;i++){
            for(int j=0;j<r;j++){
                Transpose[i][j]=matrix[j][i];
            }
        }
        return Transpose;
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number rows of matrix");
        int r=sc.nextInt();
        System.out.println("Enter the number of columns of matrix");
        int c=sc.nextInt();
        int[][]matrix=new int[r][c];
        int totalElements=r*c;
        System.out.println("Enter the " +totalElements+  " elements of matrix");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                matrix[i][j]=sc.nextInt();
            }
        }
        System.out.println("Our matrix is");
        PrintMatrix(matrix);
        System.out.println("Transpose of above matrix is");
        int [][]ans=Transpose(matrix,r,c);
        PrintMatrix(ans);



    }
}
