package ArrayInJava;
import java.util.Scanner;
public class UniqueNonRepeatedValue {
    public static void PrintArray(int []array){
        for(int i=0;i<array.length;i++){
            System.out.print(array[i]+" ");
        }
        System.out.println();
    }
    public static int Unique(int []array){
        int ans=0;
        for(int i=0;i<array.length;i++){
            for(int j=i+1;j<array.length;j++){
                if(array[i]==array[j] ){
                  array[i]=-1;
                  array[j]=-1;
                }
            }
        }
        for(int i=0;i<array.length;i++){
            if(array[i]>0){
                ans=array[i];
            }
        }
        return ans;
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n=sc.nextInt();
        int []array=new int[n];
        System.out.println("Enter the elements of array");
        for(int i=0;i<array.length;i++){
            array[i]=sc.nextInt();
        }
        System.out.println("Our array is");
        PrintArray(array);
        System.out.println("Unique element in the array is");
        System.out.println(Unique(array));
    }
}
