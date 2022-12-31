package LinkedList;

public class LinkListTraversal {

    public  void printNode(Node head){
        //add
        Node current =head;
        while(current!=null){
            System.out.print(current.data+" ");
            current=current.next;
        }
    }

}
