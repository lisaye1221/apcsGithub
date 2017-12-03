public class LinkedList {

    private NodeForLinkedList head;

    /* Construct a list.
     * When we address linked lists for real, we will build ways
     * to make arbitrary lists. But keep it simple for now, by
     * constructing one specific list.
     */ 
    public LinkedList() {
        
        // creates nodes for the list, in no particular order
        NodeForLinkedList dorsey    = new NodeForLinkedList( "half-n-half"); 
        NodeForLinkedList basie     = new NodeForLinkedList( "1 measly kiwi");
        NodeForLinkedList ellington = new NodeForLinkedList( "Count Chocula");
        NodeForLinkedList goodman   = new NodeForLinkedList( "heart meds");
        
        // connects the just-constructed nodes, with most improtant foods first
        ellington.setReferenceToNextNode( dorsey);
        dorsey.setReferenceToNextNode( basie);
        basie.setReferenceToNextNode( goodman);
        // goodman.referenceToNextNode remains null
        
        head = ellington;
    }

 
    // while-style 
    public String toString() {
        String result = "while-style: ( "; // enclosed in parens, like Racket
        
        NodeForLinkedList n = head;
        while(  n != null) {
            result = result + n;
            n = n.getReferenceToNextNode();
        }
        return result + " )";
    }
    
    public  int size(){
        int result = 0;
        NodeForLinkedList n = head;
        while(  n != null) {
            result = result + 1;
            n = n.getReferenceToNextNode();
        }
        return result;
    }


    // /****   recursive pairs of public methods + helper methods  ****/
    // public  String toString() {
        // return "via recursion: ( " + nodeChainToString( head) + " )";
    // }
    // private String nodeChainToString( NodeForLinkedList n) {
        // if( n == null) return "";
        // else return n + nodeChainToString( n.getReferenceToNextNode());
    // }
    
    
    // public  int size(){ return size( head);}
    // private int size( NodeForLinkedList n) {
        // if( n == null) return 0;
        // else return 1 + size( n.getReferenceToNextNode());
    // }
    // /****   end of "recursive pair"   ****/
    
}
