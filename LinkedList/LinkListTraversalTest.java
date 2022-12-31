package LinkedList;

public class LinkListTraversalTest {
    
    public static void main(String args[]){
        Node head=new Node(10);
        head.next=new Node(20);
        head.next.next=new Node(30);
        head.next.next.next=new Node(40);

        LinkListTraversal linkListTraversal=new LinkListTraversal();

        linkListTraversal.printNode(head);

        //gfddhu
        //head.sayHello();

    }

}
