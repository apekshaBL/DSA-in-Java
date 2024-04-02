package ArrayInJava;
import java.util.Scanner;
public class FirstRepeatingValue {
    public static void PrintArray(int[]array){
        for(int i=0;i<array.length;i++){
            System.out.print(array[i]+" ");
        }
        System.out.println();
    }
    public static int REPEAT(int []array){
        for(int i=0;i<array.length;i++){
            for(int j=i+1;j<array.length-1;j++){
                if(array[i]==array[j] ||array[i]==array[j+1]){
                    return array[i];
                }
            }

        }
        return -1;
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n=sc.nextInt();
        int [] array=new int[n];
        System.out.println("Enter the elements of array");
        for(int i=0;i<array.length;i++){
            array[i]=sc.nextInt();
        }
        System.out.println("Our array is");
        PrintArray(array);
        System.out.println("The first repeated element of array is");
        System.out.println(REPEAT(array));


    }
}
