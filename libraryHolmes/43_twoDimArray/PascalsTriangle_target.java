 public class PascalsTriangle {

    /** @return a 2-D array containing the first @rows rows of
     *  Pascal's triangle, computing each number from... 
     *  o  1's on the ends of the rows
     *  o  otherwise, the sum of the numbers "above" it
     *  See http://mathforum.org/dr.math/faq/faq.pascal.triangle.html
     */
    private static int[][] pascalsTriangle( int rows) {
        int[][] t = new int[ rows+1][];
        for( int row = 0; row <= rows; row++) {
            t[ row] = new int[ row+1];
            
            // fill the columns at the beginning and end of the row
            t[ row][0] = t[ row][ row] = 1;
            
            // fill the middle columns
            for( int col = 1; col < row; col++)
                t[ row][ col] = t[ row-1][col-1] + t[ row-1][col];
        }
        return t;
    }

    
    public static void main(String [] args) {
        System.out.println( TwoDimArray.toString_2d_forEach( pascalsTriangle(0)));
        /* expecting
            1
         */

        System.out.println( TwoDimArray.toString_2d_forEach( pascalsTriangle(1)));
        /* expecting
            1
            1 1
         */

        System.out.println( TwoDimArray.toString_2d_forEach( pascalsTriangle(2)));
        /* expecting
            1
            1 1
            1 2 1
         */

        System.out.println( TwoDimArray.toString_2d_forEach( pascalsTriangle(3)));
        /* expecting
            1
            1 1
            1 2 1
            1 3 3 1
         */

        System.out.println( TwoDimArray.toString_2d_forEach( pascalsTriangle(4)));
        /* expecting
            1
            1 1
            1 2 1
            1 3 3 1
            1 4 6 4 1
         */

        System.out.println( TwoDimArray.toString_2d_forEach( pascalsTriangle(5)));
        /* expecting
            1
            1 1
            1 2 1
            1 3 3 1
            1 4 6 4 1
            1 5 10 10 5 1
         */
    }
}//end class TwoDimArray
