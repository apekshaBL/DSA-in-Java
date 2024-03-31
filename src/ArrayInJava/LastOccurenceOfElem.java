package ArrayInJava;
import java.util.Scanner;
public class LastOccurenceOfElem {
    public static void PrintArray(int []array){
        for(int i=0;i<array.length;i++){
            System.out.print(array[i]+" ");
        }
        System.out.println();
    }
    public static int LastOccurred(int []array,int num){
        int lastOccurred=-1;
        for(int i=0;i<array.length;i++){
            if(array[i]==num){
                lastOccurred=i;
                array[i]++;
            }

        }
        return lastOccurred;
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
        System.out.println("Enter the element whose last occurence you have to search");
        int a=sc.nextInt();
        System.out.println("Last Occurrence of " + a +" is at index " +LastOccurred(array,a));

    }
}
