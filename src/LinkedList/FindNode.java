package LinkedList;

public class FindNode {
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
        int findNode(){
            Node slow=Head;
            Node fast=Head;
            Node temp=Head;
            while(fast!=null){
                fast=fast.next.next;
                slow=slow.next;
                fast=fast.next;
                if(slow==fast)
                    temp=temp.next;
                    slow=slow.next;
                    if(slow==temp)return slow.data;
            }

            return 0;
        }
    }
    public static void main(String[] args) {
        Node a=new Node(1);
        Node b=new Node(2);
        Node c=new Node(3);
        Node d=new Node(4);
        Node e=new Node(5);
        Node f=new Node(6);
        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;
        e.next=f;
        f.next=c;
        linked_list list=new linked_list();
        list.Head=a;
        System.out.println("The Node in which cycle begins is");
        System.out.println(list.findNode());



    }
}
