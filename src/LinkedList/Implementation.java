package LinkedList;

public class Implementation {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
        }
    }
    public static class linked_list{
        Node Head=null;
        Node tail=null;
        void insertAtEnd(int value){
            Node temp=new Node(value);
            if(Head==null){
                Head=temp;

            }
            else{
                tail.next=temp;

            }
            tail=temp;
        }
        void insertAtStart(int value){
            Node temp=new Node(value);
            if(Head==null){
                Head=temp;
                tail=temp;
            }
            else{
                temp.next=Head;
                Head=temp;
            }
        }
        int size(){
            Node temp=Head;
            int count=0;
            while(temp!=null){
               count=count+1;
               temp=temp.next;
            }
            return count;
        }

        void display(){
            Node temp=Head;
            while(temp!=null){
                System.out.print(temp.data+" ");
                temp=temp.next;
            }
            System.out.println();
        }

    }
    public static void main(String[] args) {

        linked_list list=new linked_list();
        System.out.println("Linked list is");
        list.insertAtEnd(89);
        list.insertAtEnd(67);
        list.display();
        System.out.println( list.size());
        list.insertAtEnd(44);
        list.display();
        list.insertAtStart(600);
        list.display();



    }
}
