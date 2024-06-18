package LinkedList;

public class ImplementationInDoublyLinkedList {
    public static class Node{
        int data;
        Node next;
        Node prev;
        Node(int data){
            this.data=data;
        }
    }
    public static class DoublyLinkedList{

        void Display(Node Head){
            Node temp=Head;
            while(temp!=null){
                System.out.print(temp.data+" ");
                temp=temp.next;
            }
            System.out.println();
        }

        void reverse(Node tail){
            Node temp=tail;
            while(temp!=null){
                System.out.print(temp.data+" ");
                temp=temp.prev;
            }
            System.out.println();

        }

        void Display2(Node Random){
            Node temp=Random;
            while(temp.prev!=null){
                temp=temp.prev;
            }
            while(temp!=null){
                System.out.print(temp.data+" ");
                temp=temp.next;
            }
            System.out.println();
        }

      Node InsertAtHead(Node Head ){

            Node temp=new Node(100);
          if(Head==null){
              return temp;

          }
            temp.next=Head;
            Head.prev=temp;
            Head=temp;
            return Head;
        }

        void DeleteAt(Node Head,int idx){
            if(Head==null || idx<0){
                return;
            }
            Node temp=Head;
            for(int i=0;i<idx;i++){
                if(temp.next==null)return;
                temp=temp.next;
            }
            if (temp.next != null) {
                temp.next = temp.next.next;
                if (temp.next != null) {
                    temp.next.prev = temp;
                }
            }

        }
        Node DeleteTail(Node tail){
         Node s=tail.prev;
         s.next=null;

            return tail;
        }

        Node DeleteHead(Node Head){
            Head=Head.next;
            Head.prev=null;
            return Head;
        }

       void InsertAtAny(Node Head,int Idx,int x) {
           Node New = new Node(x);
           Node temp = Head;
           for (int i = 1; i <=Idx-1; i++) {
               temp=temp.next;
           }
           Node r = temp.next;
           New.prev = temp;
           temp.next = New;
           New.next = r;
           r.prev = New;
       }

        Node InsertAtTail(Node tail){
            Node temp=new Node(780);
            temp.prev=tail;
            tail.next=temp;
            tail=temp;
            return tail;
        }

    }
    public static void main(String[] args) {
        //a<=>b<=>c<=>d<=>e
        Node a=new Node(1);
        Node b=new Node(2);
        Node c=new Node(3);
        Node d=new Node(4);
        Node e=new Node(5);
        a.prev=null;
        a.next=b;
        b.prev=a;
        b.next=c;
        c.prev=b;
        c.next=d;
        d.prev=c;
        d.next=e;
        e.prev=d;
        e.next=null;
        System.out.println("Our Doubly linked list is");
        DoublyLinkedList list= new DoublyLinkedList();
        list.Display(a);
        System.out.println("Reverse linked list is");
        list.reverse(e);
        System.out.println("Enter any random index and from that print all the Linked list");
        list.Display2(c);
        System.out.println("After inserting at Head");
        list.InsertAtHead(a);
        list.Display2(a);
        System.out.println("After inserting at tail");
        list.InsertAtTail(e);
        list.Display2(e);
        System.out.println("Insert At and Idx");
        list.InsertAtAny(a,2,900);
        list.Display(a);
        System.out.println("Delete the Head");
        a=list.DeleteHead(a);
        list.Display(a);
        System.out.println("Delete tail");
        e=list.DeleteTail(e);
        list.Display(a);
        System.out.println("Delete given index");
        list.DeleteAt(a,2);
        list.Display(a);




    }
}
