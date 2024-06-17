package LinkedList;

public class Merge2LinkedList {
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

        Node Merge(Node Head1,Node Head2){
            Node temp1=Head1;
            Node temp2=Head2;
            Node extra=new Node(100);
            Node temp=extra;
            while(temp1!=null && temp2!=null) {
                if (temp1.data < temp2.data) {
                    temp.next = temp1;
                    temp1 = temp1.next;
                } else {
                    temp.next = temp2;
                    temp2 = temp2.next;
                }
                temp = temp.next;
            }

                if(temp1!=null){
                    temp.next=temp1;
                }
                else{
                    temp.next=temp2;
                }
                return extra.next;
            }

        void display(Node Head){
            Node temp=Head;
            while(temp!=null){
                System.out.print(temp.data+" ");
                temp=temp.next;
            }
            System.out.println();
        }
    }



    public static void main(String[] args) {
        Node a=new Node(1);
        Node b=new Node(3);
        Node c=new Node(5);
        Node d=new Node(8);
        Node e=new Node(9);
        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;
        Node l=new Node(2);
        Node m=new Node(4);
        Node n=new Node(6);
        Node o=new Node(7);
        l.next=m;
        m.next=n;
        n.next=o;
        linked_list list=new linked_list();
        System.out.println("Our 1st Sorted linked list is");
        list.display(a);
        System.out.println("Our 2nd Sorted linked list is");
        list.display(l);
        System.out.println("Our Merged sorted linked list is");
        Node ans=list.Merge(a,l);
        list.display(ans);


    }
}
