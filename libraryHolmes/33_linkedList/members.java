public class UserOfLinkedList {
    public static void main(String[] commandLine) {...}
}
public class LinkedList {
    private NodeForLinkedList head;
    public LinkedList() {...}
    public String toString() {...}
}
public class NodeForLinkedList {
    private String cargo;
    private NodeForLinkedList referenceToNextNode;
    public NodeForLinkedList( String cargoParam) {...}
    public String toString() { ...}
    public void setReferenceToNextNode( 
       NodeForLinkedList referenceToNextNode) {...}
    public NodeForLinkedList getReferenceToNextNode() {...}
