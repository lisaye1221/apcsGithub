 public class TwoDimArray {

/** @return a string representation of a 2D integer array @a, with
     *  each row on its own line,
     *  computed using a "simple FOR" loop  (not a for-each)
     */
    public static String toString_2d_simpleFor( int[][] a ) { 
        String result = "";
        for( int rowNum = 0; rowNum < a.length; rowNum++) {
            result += System.lineSeparator();
            for( int colNum = 0; colNum < a[ rowNum].length; colNum++) 
        result += a[ rowNum][ colNum] + " ";
        }
    return result;
    }

    /** @return a string representation of a 2D integer array @a, with
     *  each row on its own line,
     *  computed using a for-each loop
     *  Declared public because it is used in PascalsTriangle.java
     */
    public static String toString_2d_forEach( int[][] a ) { 
        String result = "";
        for( int[] row : a) {
            result += System.lineSeparator();
            for( int cell : row)
                result += cell + " ";
        }
    return result;
    }


    /** postcondition: fill the array @a with consecutive values
     *  from @startingAt, in row-major order
     */
    private static void fill( int[][] a, int startingAt) {
        for( int rowNum = 0; rowNum < a.length; rowNum++)
            for( int colNum = 0; colNum < a[ rowNum].length; colNum++)
                a[ rowNum][ colNum] = startingAt++;
    }

    
    public static void main(String [] args) {
        int [][] m0 = new int[3][5];
        System.out.println( System.lineSeparator() + toString_2d_simpleFor( m0));
        fill( m0, 100);
        // System.out.println( System.lineSeparator() + toString_2d_simpleFor( m0));
        // /* expecting...
               // 100 101 102 103 104
               // 105 106 107 108 109
               // 110 111 112 113 114
         // */       
        System.out.println( System.lineSeparator() + toString_2d_forEach( m0));
    }
}//end class TwoDimArray