/******************************************************************************
 * Display each of the words from the command line with its letters reversed.
 ******************************************************************************/

public class ReverseLetters {

    public static void main(String[] commandLine) {
        for( String word : commandLine)
            System.out.println( reverseString_recursive( word));
    }
    
    public static String reverseString_recursive ( String original) {
        if( original.length() == 0) return "";
        else return reverseString_recursive( original.substring(1))
                  + original.substring( 0, 1);
    }
}
