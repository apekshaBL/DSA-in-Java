package LinkedList;
import java.util.Scanner;
public class NthNodeFromEnd {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
        }
    }

    public static Node nthNode(Node Head,int idx){
        int size=0;
        Node temp=Head;
        while(temp!=null){
            size++;
            temp=temp.next;
        }
        int m=size-idx+1;
        temp=Head;
        for(int i=1;i<=m-1;i++){
            temp=temp.next;
        }
        return temp;
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
        Scanner sc=new Scanner(System.in);
        Node a=new Node(6);
        Node b=new Node(12);
        Node c=new Node(18);
        Node d=new Node (24);
        Node e=new Node(30);
        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;
        System.out.println("Our linked list is");
        Display(a);
        System.out.println("Enter the end index whose element is to search");
        int n=sc.nextInt();
        Node ans=nthNode(a,n);
        System.out.println(ans.data);
    }
}
