public class SubstringPractice {

    public static void main(String[] commandLine) {
        String sand = "bar";
        // indexes:    012
        System.out.println( sand.length()        + " ...expecting 3");
        System.out.println( sand.substring(0,2)  + " ...expecting 'ba'");
        System.out.println( sand.substring(0,3)  + " ...expecting 'bar'");
        // System.out.println( sand.substring(0,4)  + " ...expecting error");
        System.out.println( sand.substring(1,2)  + " ...expecting 'a'");
        System.out.println( sand.substring(1,1)  + " ...expecting ''");
        System.out.println( sand.substring(1)    + " ...expecting 'ar'");
        // System.out.println( sand.substring(1,7)  + " ...expecting error");
        System.out.println( "expecting IndexOutOfBoundsException: " );
        // System.out.println( sand.substring(7));
        
        System.out.println( System.lineSeparator() + "reversals: " );
        System.out.println( reverse_whileStyle("")  + " ...expecting ''" );
        System.out.println( reverse_whileStyle("abc")  + " ...expecting 'cba'" );
        
    }
    
    private static String reverse_whileStyle( String input) {
        String result = "";
        for( int currentIndex = input.length() -1; currentIndex >= 0; --currentIndex)
            result += input.substring( currentIndex, currentIndex +1);
        return result;
    }
}
