package queues;

public class LinkedListImplementation {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data =data;
        }

    }
    public static class queue{
        Node Head=null;
        Node tail=null;
        int size=0;
        public void add(int x){
            Node temp=new Node(x);
            if(size()==0){
               Head=temp;
               tail=temp;
           }
           else{
               tail.next=temp;
               tail=temp;
           }
             size++;
        }
        void display(){
            Node temp=Head;
            while(temp!=null){
                System.out.print(temp.data +" ");
                temp=temp.next;
            }
            System.out.println();
        }

        public int remove(){
            if(size==0){
                System.out.println("queue is empty!");
                return -1;
            }
            else{
                int x=Head.data;
                Head=Head.next;
                size--;
                return x;
            }


        }
        public int peek(){
            if(size==0){
                System.out.println("queue is empty!");
               return -1;
            }
            return Head.data;
        }

        int size(){
            return size;
        }
        public boolean isEmpty(){
            if(size()==0){
                return true;
            }
            else{
                return false;
            }
        }

    }
    public static void main(String[] args) {
        queue a=new queue();
        a.add(78);
        a.add(7);
        a.add(34);
        a.add(23);
        a.add(13);
        System.out.println("Our queue is:-");
        a.display();
        System.out.println("Size of queue is:-");
        System.out.println(a.size());
        a.remove();
        a.display();
        System.out.println( a.peek());
        System.out.println(a.size());
        System.out.println(a.isEmpty());
    }

}
