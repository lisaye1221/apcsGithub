/******************************************************************************
 * test ArrayPlus
 ******************************************************************************/

public class UserOfArrayPlus {
    private static final int SAMPLES     = 16;
    private static final int RANGE_LIMIT = 4;
    
    public  static void main(String[] commandLine) {

        // // problem 1 -------------------------
        // System.out.println( System.lineSeparator()
                          // + "problem 1: incremental step 0");
        // ArrayPlus randomness = new ArrayPlus( SAMPLES);
        // System.out.println( randomness);

        // problem 2, after commenting out above  ------------------
        System.out.println( System.lineSeparator()
                          + "problem 2: random fill");
        ArrayPlus randomness = new ArrayPlus( SAMPLES, RANGE_LIMIT);
        System.out.println( randomness);
        
        // problem 3 ----------------------------------------------
        System.out.println( System.lineSeparator()
                          + "problem 3: indexOf");
        for( int seek = 0
           ; seek <= RANGE_LIMIT  // last iteration expects -1
           ; seek++)
            System.out.println( seek + ": " + randomness.indexOf( seek));
        
        // problem 4 ----------------------------------------------
        /* Construct an ArrayPlus that will be used 
         * to garner frequency data.
         */         
        ArrayPlus freqsForHistogram = new ArrayPlus( RANGE_LIMIT);
          // improvement: put non-zero data in array, to check processing
        
        /* Pass freqsForHistogram to a method in the
         * ArrayPlus class that can populated it.
         */
        randomness.freqFill( freqsForHistogram);

        // See the histogram data:
        System.out.println( System.lineSeparator()
                          + "problem 4: frequencies");
        System.out.println( freqsForHistogram
                          + "check: total == SAMPLES ?");
    }
}
