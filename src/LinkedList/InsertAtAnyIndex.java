package LinkedList;

public class InsertAtAnyIndex {
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
        void insertAt(int idx,int value){
            Node a=new Node(value);
            if(idx==0){
                a.next=Head;
                Head=a;
                return;
            }
            Node temp=Head;
            for(int i=0;i<idx-1;i++){
                if(temp!=null){
                    temp=temp.next;
                }
                else{
                    throw new IndexOutOfBoundsException("Index out of bound exception");
                }
            }
            a.next=temp.next;
            temp.next=a;
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
    public static void Display(Node Head){
        Node temp=Head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Node a=new Node(1);
        Node b=new Node(2);
        Node c=new Node(3);
        Node d=new Node(4);
        Node e=new Node(5);
        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;
        Node temp=a;
        Display(temp);
        linked_list list=new linked_list();
        list.Head=a;
        list.insertAt(0,2);
        list.display();
       



    }
}
