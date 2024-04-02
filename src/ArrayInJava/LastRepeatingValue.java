package ArrayInJava;
import java.util.Scanner;
public class LastRepeatingValue {
    public static void PrintArray(int[]array){
        for(int i=0;i<array.length;i++){
            System.out.print(array[i]+" ");
        }
        System.out.println();
    }
    public static int LastRepeated(int[]array){
        int n=array.length;
        for(int i=n-1;i>0;i--){
            for(int j=i-1;j>0;j--){
                if (array[i] == array[j]  || array[i]==array[j-1]) {
                    return array[i];
                }
            }
        }
        return -1;

    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n=sc.nextInt();
        int[]array=new int[n];
        System.out.println("Enter the elements of the array");
        for(int i=0;i<array.length;i++){
            array[i]=sc.nextInt();
        }
        System.out.println("Our array is");
        PrintArray(array);
        System.out.println("Last repeated value in array is");
        System.out.println( LastRepeated(array));
    }
}
