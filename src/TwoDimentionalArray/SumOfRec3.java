package TwoDimentionalArray;
import java.util.Scanner;
public class SumOfRec3 {
    public static void PrintMatrix(int[][]matrix){
        for(int i=0;i< matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static  void FindPrefixSum(int[][]matrix){
        int r= matrix.length;
        int c= matrix[0].length;
        for(int i=0;i<r;i++){
            for(int j=1;j<c;j++){
                matrix[i][j]+=matrix[i][j-1];
            }
        }
        for(int j=0;j<c;j++){
            for(int i=1;i<r;i++){
                matrix[i][j]+=matrix[i-1][j];

            }
        }
    }
    public static int Sum(int[][]matrix,int l1,int r1,int l2,int r2){
        int ans=0;
        int sum=0;
        int up=0;
        int left=0;
        int leftUp=0;
        FindPrefixSum(matrix);
        sum=matrix[l2][r2];
        if(r1>=1) {
            left = matrix[l2][r1 - 1];
        }
        if(l1>=1){
            up=matrix[l1-1][r2];
        }
        if(l1>=1 && r1>=1){
            leftUp=matrix[l1-1][r1-1];
        }

        ans=sum-up-left+leftUp;

        return ans;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of rows");
        int r=sc.nextInt();
        System.out.println("Enter the number of columns");
        int c=sc.nextInt();
        int [][]matrix=new int[r][c];
        System.out.println("Enter the number of elements");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                matrix[i][j]=sc.nextInt();
            }
        }
        System.out.println("Our matrix is");
        PrintMatrix(matrix);
        System.out.println("enter l1,r1,l2,r2");
        int l1=sc.nextInt();
        int r1=sc.nextInt();
        int l2=sc.nextInt();
        int r2=sc.nextInt();
        System.out.println("Sum of elements of matrix is");
        System.out.println(Sum(matrix,l1,r1,l2,r2));


    }
}
