/** represent a linked list as a chain of nodes
 */
public class LinkedList {

    private NodeForLinkedList head;
    
   /** Constructor: the default constructor creates a null linked list
     */

   /** Chain @n to the FRONT of the list.
     */
    public void addFirst( NodeForLinkedList n) {
        n.setReferenceToNextNode( head);
        head = n;
    }

   /** Chain @n to the END of the list
     * precondition: @n.referenceToNextNode == null
     */
    public void addLast( NodeForLinkedList n) {
        // empty lists require special handling
        if( head == null) 
            // set the head, rather than a node's referenceToNextNode
            head = n;
        else {  // list already has at least 1 node
            
            // find end of existing list
            NodeForLinkedList cur = head;
            while(    cur.getReferenceToNextNode() != null)
                cur = cur.getReferenceToNextNode();
            
            // add @n to end
            cur.setReferenceToNextNode( n);
        }
    }

    public String toString() {
        String result = "( "; // enclosed in parens, like Racket
        
        NodeForLinkedList n = head;
        while(  n != null) {
            result +=  n;
            n = n.getReferenceToNextNode();
        }
        return result + " )";
    }
}
