package TwoDimentionalArray;
import java.sql.SQLOutput;
import java.util.Scanner;
public class MultiTwoMatrix {
    public static void PrintMatrix(int[][]matrix,int r,int c){
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
}
public static void multiMatrix(int[][]matrix1,int r1,int c1,int[][]matrix2,int r2,int c2){
    int [][]ans=new int[r1][c2];
                if(c1!=r2){
                    System.out.println("wrong input");
                    return;
                }

        for(int i=0;i<r1;i++){
            for(int j=0;j<c2;j++){
                   for(int k=0;k<c1;k++) {
                       ans[i][j] += (matrix1[i][k] * matrix2[k][j]);
                   }
                   }
                }
    System.out.println("multiplication of two matrix is");
       PrintMatrix(ans,r1,c2);
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of rows of 1st matrix");
        int r1=sc.nextInt();
        System.out.println("Enter the number of columns of 1st matrix");
        int c1=sc.nextInt();
        int [][] matrix1=new int[r1][c1];
        System.out.println("Enter the elements of matrix1");
        for(int i=0;i<r1;i++){
            for(int j=0;j<c1;j++){
                matrix1[i][j]=sc.nextInt();
            }
        }
        System.out.println("Enter the number of rows of 2nd matrix");
        int r2=sc.nextInt();
        System.out.println("Enter the number of columns of 2nd matrix");
        int c2=sc.nextInt();
        int[][]matrix2=new int[r2][c2];
        System.out.println("Enter the elements of matrix 2");
        for(int i=0;i<r2;i++){
            for(int j=0;j<c2;j++){
                matrix2[i][j]=sc.nextInt();
            }
        }
        System.out.println("Matrix 1 is ");
        PrintMatrix(matrix1,r1,c1);
        System.out.println("Matrix 2 is");
        PrintMatrix(matrix2,r2,c2);
        multiMatrix(matrix1,r1,c1,matrix2,r2,c2);






    }

}
