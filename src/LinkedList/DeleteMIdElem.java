package LinkedList;

public class DeleteMIdElem {
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
        void removeMid(){
            Node slow=Head;
            Node fast=Head;
            while(fast.next.next.next!=null && fast.next.next.next.next!=null ){
                fast=fast.next.next;
                slow=slow.next;
            }
            slow.next=slow.next.next;

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
        Node a=new Node(11);
        Node b=new Node(22);
        Node c=new Node(33);
        Node d=new Node(44);
        Node e=new Node(55);
        Node f=new Node(66);
        Node g=new Node(77);
        Node h=new Node(88);
        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;
        e.next=f;
        f.next=g;
        g.next=h;
        linked_list list=new linked_list();
        list.Head=a;
        System.out.println("Our linked list is");
        list.display();
        System.out.println("After removing the mid of our linked list is");
        list.removeMid();
        list.display();


    }
}
