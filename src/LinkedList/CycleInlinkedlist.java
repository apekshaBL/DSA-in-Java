package LinkedList;

public class CycleInlinkedlist {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
        }
    }
    public static class linked_list {
        Node Head=null;
        Node tail=null;
        boolean cyclicLinked_list(){
            if(Head==null){
                return false;
            }
            else if(Head.next==null){
                return false;
            }
            Node slow=Head;
            Node fast=Head;
            while(fast!=null) {
                fast = fast.next.next;
                slow = slow.next;
                if(fast.next==null)return false;
                if (fast == slow) return true;
            }
           return false;
        }
    }

    public static void main(String[] args) {
        Node a=new Node(3);
        Node b=new Node(2);
        Node c=new Node(0);
        Node d=new Node(-4);
        a.next=b;
        b.next=c;
        c.next=d;
        d.next=b;
        linked_list list=new linked_list();
        list.Head=a;
        boolean ans=list.cyclicLinked_list();
        System.out.println(ans);
        if(ans==true){
            System.out.println("It is cyclic linked list");
        }
        else{
            System.out.println("Not cyclic linked list");
        }




    }
}
