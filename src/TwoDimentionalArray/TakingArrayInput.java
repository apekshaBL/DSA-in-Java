package TwoDimentionalArray;
import java.util.Scanner;
public class TakingArrayInput {
    public static void PrintArray(int[][]array,int r,int c){
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                System.out.print(array[i][j]+" ");
            }
            System.out.println();
        }

    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of rows of array");
        int r=sc.nextInt();
        System.out.println("Enter the number of columns of array");
        int c=sc.nextInt();
        int array[][]=new int[r][c];
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                array[i][j]=sc.nextInt();
            }
        }
        System.out.println("Our array is");
        PrintArray(array,r,c);


    }
}
