package Stacks;
public class ArrayImplementation {
    public static class Stacks{
         int [] array=new int[3];
         int idx=0;
        void push(int x){
            if(isFull()){
                System.out.println("Stack is full");
                return;
            }
            array[idx]=x;
            idx++;
        }

        int pop(){
            if(isEmpty()){
                System.out.println("Stack is empty");
                return -1;
            }

             if(idx==0){
                 System.out.println("Stack is empty");
                 return -1;
             }
             int top=array[idx-1];
             array[idx-1]=0;
             idx--;
             return top;
        }
        int peek(){
            if(idx==0){
                return -1;
            }
            return array[idx-1];
        }

        void display(){
            for(int i=0;i<=idx-1;i++){
                System.out.print(array[i]+" ");
            }
            System.out.println();
        }

        boolean isEmpty(){
            if(idx==0){
                return true;
            }
            return false;
        }

        boolean isFull(){
            if(idx==array.length){
                return true;
            }
            return false;
        }

        int size(){
            int count=0;
            for(int i=0;i<=idx-1;i++){
                count=count+1;
            }
            return idx;
        }
        int capacity(){
            return array.length;
        }


    }
    public static void main(String[] args) {
        Stacks st=new Stacks();
        st.push(89);
        st.push(78);
        st.push(25);
        st.display();
        System.out.println(st.size());
        st.pop();
        st.display();
        System.out.println(st.capacity());





    }
}
