package BinarySearchAlgorithm;
import java.util.Scanner;
public class Duplicate {
    static boolean Find(int[]array,int target){
        int n=array.length;
        int str=0;
        int end=n-1;
        while(str<=end){
            int mid=str+(end-str)/2;
            if(array[mid]==target){
                return true;
            }
            else if(array[str]==array[mid] && array[end]==array[mid]){
                str++;
                end--;
            }
            else if(array[mid]<=array[end]){
                if(target>array[mid] && target <=array[end]){
                    str=mid+1;
                }
                else{
                    end=mid-1;
                }
            }
            else{
                if (target >= array[str] && target < array[mid]) {
                    end=mid-1;

                }
                else{
                    str=mid+1;
                }
            }
        }
        return false;


    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[]array={1,1,1,1,1,1,2,2,3,1};
        System.out.println("Enter the targeted element");
        int target=sc.nextInt();
        System.out.println(Find(array,target));

    }
}
