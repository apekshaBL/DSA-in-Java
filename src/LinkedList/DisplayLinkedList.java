package LinkedList;

public class DisplayLinkedList {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
        }
    }
    public static void main(String[] args) {
        Node a=new Node(5);
        Node b=new Node(10);
        Node c=new Node(15);
        Node d=new Node(20);
        Node e=new Node(25);
        Node f=new Node(30);
        Node g=new Node(35);
        //a=>b=>c=>d=>e=.f
        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;
        e.next=f;
        f.next=g;
        Node temp=a;
//        for(int i=0;i<6;i++){
//            System.out.print(temp.data + " ");
//            temp=temp.next;
//        }

        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }

    }
}
