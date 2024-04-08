package TwoDimentionalArray;
import java.util.Scanner;
public class SpiralMatrix {
    public static void PrintMatrix(int[][]matrix){
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void SpiralMatrix(int[][]matrix,int r,int c){
        int topRow=0;
        int bottomRow=r-1;
        int leftCol=0;
        int rightCol=c-1;
        int totalElements=0;
        while(totalElements<r*c){
            //topRow=>leftCol to rightCol
            for(int i=leftCol;i<=rightCol && totalElements<r*c;i++){
                System.out.print(matrix[topRow][i]+" ");
                totalElements++;
            }
            topRow++;

            // rightCol=>topRow to bottomRow
            for(int j=topRow;j<=bottomRow && totalElements<r*c;j++){
                System.out.print(matrix[j][rightCol]+" ");
                totalElements++;
            }
            rightCol--;

            // bottomRow=>rightCol to leftCol
            for(int i=rightCol;i>=leftCol && totalElements<r*c;i--){
                System.out.print(matrix[bottomRow][i]+" ");
                totalElements++;
            }
            bottomRow--;

            //leftCol=> bottomRow to topRow
            for(int j=bottomRow;j>=topRow && totalElements<r*c;j--){
                System.out.print(matrix[j][leftCol]+" ");
                totalElements++;
            }
            leftCol++;
        }


    }

    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of rows ");
        int r=sc.nextInt();
        System.out.println("Enter the number of columns");
        int c=sc.nextInt();
        int[][]matrix=new int[r][c];
        System.out.println("Enter the elements of matrix");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                matrix[i][j]=sc.nextInt();

            }
        }
        System.out.println("Our matrix is");
        PrintMatrix(matrix);
        System.out.println("Our Spiral matrix is");
        SpiralMatrix(matrix,r,c);

    }
}
