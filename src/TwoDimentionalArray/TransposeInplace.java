package TwoDimentionalArray;
import java.util.Scanner;
public class TransposeInplace {
    public static void PrintMatrix(int[][]matrix){
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void Transpose(int [][]matrix,int r,int c){
        for(int i=0;i<r;i++){
            for(int j=i;j<c;j++){
                int temp=matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;
            }

        }
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of rows of matrix");
        int r=sc.nextInt();
        System.out.println("Enter the number of columns of matrix");
        int c=sc.nextInt();
        int [][]matrix=new int[r][c];
        System.out.println("Enter the elements of matrix");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                matrix[i][j]=sc.nextInt();
            }
        }
        System.out.println("Our matrix is");
        PrintMatrix(matrix);
        System.out.println("Transpose of matrix is");
        Transpose(matrix,r,c);
        PrintMatrix(matrix);



    }


}
