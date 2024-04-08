package TwoDimentionalArray;
import java.util.Scanner;
public class SpiralOrderOfN {
    public static void PrintMatrix(int[][]matrix,int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<matrix[i].length;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static int[][] SpiralOrder(int n){
        int[][]matrix=new int[n][n];
        int topRow=0;
        int rightCol=n-1;
        int bottomRow=n-1;
        int leftCol=0;
        int CurrentElem=1;
        while(CurrentElem<=n*n){
            //topRow=>leftCol to rightCol
            for(int i=leftCol;i<=rightCol && CurrentElem<=n*n;i++){
             matrix[topRow][i]=CurrentElem++;
            }
            topRow++;
            //rightCol=>topRow to bottomRow
            for(int j=topRow;j<=bottomRow &&CurrentElem<=n*n;j++){
                matrix[j][rightCol]=CurrentElem++;
            }
            rightCol--;
            //bottomRow=>rightCol to leftCol
            for(int i=rightCol;i>=leftCol && CurrentElem<=n*n;i--){
                matrix[bottomRow][i]=CurrentElem++;

            }
            bottomRow--;

            //leftCol=bottomRow to topRow
            for(int j=bottomRow;j>=topRow && CurrentElem<=n*n;j--){
                matrix[j][leftCol]=CurrentElem++;
            }
            leftCol++;
        }
        return matrix;
    }

    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int n=sc.nextInt();
        System.out.println("Spiral Matrix is");
        int ans[][]=SpiralOrder(n);
        PrintMatrix(ans,n);


    }
}
