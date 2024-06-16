package LinkedList;

public class IntersectionOfLinkedlist {
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
        int size(Node Head){
            Node temp=Head;
            int count=0;
            while(temp!=null){
                count=count+1;
                temp=temp.next;
            }
            return count;

        }
        int intersection(Node Head1,Node Head2){
            Node temp1=Head1;
            Node temp2=Head2;
            int n=size(Head1);
            int m=size(Head2);
            if(n>m){
                for(int i=0;i<n-m;i++){
                    temp1=temp1.next;
                }
                while(temp1!=temp2){
                    temp1=temp1.next;
                    temp2=temp2.next;
                }
            }
            else{
                for(int i=0;i<m-n;i++){
                    temp2=temp2.next;
                }
                while(temp2!=temp1){
                    temp2=temp2.next;
                    temp1=temp1.next;
                }
            }
            return temp1.data;
        }

        void display(){
            Node temp=Head;
            while(temp!=null){
                System.out.print(temp.data+" ");
                temp=temp.next;
            }
            System.out.println("");
        }


    }
    public static void main(String[] args) {
        Node a=new Node(100);
        Node b=new Node(13);
        Node c=new Node(4);
        Node d=new Node(5);
        Node e=new Node(12);
        Node f=new Node(10);
        Node g=new Node(90);
        Node h=new Node(9);
        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;
        f.next=g;
        g.next=h;
        h.next=c;
        linked_list list=new linked_list();
        System.out.println("1st linked list is");
        list.Head=a;
        list.display();
        list.Head=f;
        System.out.println("2nd linked list is");
        list.display();
        System.out.println("Intersection of two linked list is");
        System.out.println(list.intersection(a,g));

    }
}
