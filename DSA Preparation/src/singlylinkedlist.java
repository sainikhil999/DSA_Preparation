public class singlylinkedlist {

    Node head;
    Node tail;
    int size;
     public Node createLinkedList(int nodeValue) {
         Node node = new Node();
         node.value = nodeValue;
         node.next = null;
         head = node;
         tail = node;
         size = 1;
         return head;
     }

}
