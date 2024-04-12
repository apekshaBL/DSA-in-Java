package TwoDimentionalArray;
import java.util.Scanner;
public class SumOfRectangle2 {
    public static void PrintMatrix(int[][]matrix,int r,int c){
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void findPrefixSum(int[][]matrix){
        int r=matrix.length;
        int c=matrix[0].length;
        //traverse horizontally
        for(int i=0;i<r;i++){
            for(int j=1;j<c;j++){
                matrix[i][j]+=matrix[i][j-1];
            }
        }
    }
    public static int SumOfRecTangle(int[][]matrix,int l1,int r1,int l2,int r2){

        int sum=0;
        findPrefixSum(matrix);
        for(int i=l1;i<=l2;i++){
            if(r1>=1)
                sum+=matrix[i][r2]-matrix[i][r1-1];
            else
                sum+=matrix[i][r2];

        }

        return sum;
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of rows of matrix");
        int r=sc.nextInt();
        System.out.println("Enter the number of columns of matrix");
        int c=sc.nextInt();
        int[][]matrix=new int[r][c];
        System.out.println( "Enter the elements of matrix");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                matrix[i][j]=sc.nextInt();
            }
        }
        System.out.println("Our matrix is");
        PrintMatrix(matrix,r,c);
        System.out.println("Enter the number of l1,r1,l2,r2");
        int l1=sc.nextInt();
        int r1=sc.nextInt();
        int l2=sc.nextInt();
        int r2=sc.nextInt();
        System.out.println("Sum of elements of the range of rows amd columns are");
        System.out.println(SumOfRecTangle(matrix,l1,r1,l2,r2));





    }

}
