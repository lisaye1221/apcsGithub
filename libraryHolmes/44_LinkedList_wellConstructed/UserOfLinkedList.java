/** Test the LinkedList class
 */

public class UserOfLinkedList {

    public static void main(String[] commandLine) {

        // a 2-element list of strings, using addFirst
        LinkedList fruits = new LinkedList();
        fruits.addFirst( new NodeForLinkedList( "grapes"));
        fruits.addFirst( new NodeForLinkedList( "mangos"));
        System.out.println( System.lineSeparator()
                          + fruits  + System.lineSeparator()
                          + System.lineSeparator());

        // a 4-element list
        // Element 2 contains the list of fruits.
        LinkedList shopping = new LinkedList();

        // test addLast
        shopping.addLast( new NodeForLinkedList( "half-n-half"));
        shopping.addLast( new NodeForLinkedList( fruits));
        shopping.addLast( new NodeForLinkedList( "heart meds"));
        
        // mix-n-match: addFirst after addLasts
        shopping.addFirst( new NodeForLinkedList( "Count Chocula"));
        
        System.out.println( System.lineSeparator()
                          + shopping  + System.lineSeparator()
                          + System.lineSeparator());
    }
}
