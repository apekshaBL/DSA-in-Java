package TwoDimentionalArray;
import java.util.Scanner;
public class RotateBy90 {
       public static void PrintMatrix(int[][] matrix) {
           for (int i = 0; i < matrix.length; i++) {
               for (int j = 0; j < matrix[i].length; j++) {
                   System.out.print(matrix[i][j] + " ");
               }
               System.out.println();
           }
       }
       public static void reversed(int[][]matrix,int r,int c){
           for(int i=0;i<r;i++){
               for(int j=c-1;j>=0;j--){
                   System.out.print(matrix[i][j]+" ");
               }
               System.out.println();
           }
       }
       public static int[][] Rotate(int[][]matrix,int r,int c){
           int[][]ans=new int[c][r];
           for(int i=0;i<c;i++){
               for(int j=0;j<r;j++){
                   ans[i][j]=matrix[j][i];
               }
           }

           return ans;
       }
        public static void main (String[]args){
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the number of rows of matrix");
            int r = sc.nextInt();
            System.out.println("Enter the number of columns of matrix");
            int c = sc.nextInt();
            int[][] matrix = new int[r][c];
            System.out.println("Enter the elements of matrix");
            for (int i = 0; i < r; i++) {
                for (int j = 0; j <c; j++) {
                    matrix[i][j] = sc.nextInt();
                }
            }
            System.out.println("Our matrix is");
            PrintMatrix(matrix);
            System.out.println("Rotated matrix by 90 degree is");
            int [][]ans=Rotate(matrix,r,c);
            reversed(ans,r,c);



        }
    }

