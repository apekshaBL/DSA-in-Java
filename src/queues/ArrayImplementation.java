package queues;

public class ArrayImplementation {
    public static class queue {
        int x=100;
        int[]array=new int[x];
        int front=-1;
        int rare=-1;
        int size=0;
        void add(int x){
           if(size==x){
                System.out.println("Queue is full");
                return;
            }
            if(rare==-1){
                front=0;
                rare=0;
                array[rare]=x;
            }
            else {
                rare=(rare+1)%x;
                array[rare]=x;
            }
            size ++;
        }
        int size(){
            return size;
        }



        int remove(){
            if(size==0){
                System.out.println("Queue is empty!");
                return -1;
            }
            front++;
            size--;
            return array[front-1];
        }

        boolean isEmpty(){
            if(size()==0){
                return true;
            }
            else{
                return false;
            }
        }

        int peek(){
            if(size()==0){
                System.out.println("Empty queue!");
                return -1;
            }
            else;
            return array[front];
        }

        void display(){
            if(size==0){
                System.out.println("Queue is empty!");
                return;
            }
            for(int i=front;i!=rare;i++){
                System.out.print(array[i]+" ");
            }
            System.out.print(array[rare]+" ");
            System.out.println();
        }
    }
    public static void main(String[] args) {
        queue q=new queue();
        q.add(89);
        q.add(12);
        q.add(67);
        q.add(8);
        System.out.println("Our queue is:-");
        q.display();
        System.out.println(q.remove());
        System.out.println(q.size());
        System.out.println(q.isEmpty());
        System.out.println(q.peek());





    }
}
