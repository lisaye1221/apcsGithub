/*******************************************************************
 * practice with arrays
 
 * Params are declared FINAL, mostly for my education.
 *******************************************************************/

public class ArrayPlus {
    int[] refToArray;
    
    public ArrayPlus( final int capacity) {
        refToArray = new int[ capacity];  // all entries 0
    }
    
    public ArrayPlus( final int capacity, final int maxRandom) {
        this( capacity);
        for( int index = 0; index < refToArray.length; index++) 
            refToArray[ index] = (int)(Math.random() * maxRandom);
    }
    
    public String toString() {
        String result = "";
        
        for( int index = 0; index < refToArray.length; index++) 
            result += index + ": "
                   +  refToArray[ index] + System.lineSeparator();
        return result;
    }
    
    public int indexOf( final int findMe) {
        for( int index = 0; index < refToArray.length; index++) 
            if( refToArray[ index] == findMe) return index;
        return -1;
    }
    
    public void freqFill( final ArrayPlus freqs) {
        for( int rando : this.refToArray)
            freqs.refToArray[ rando ]++;
    }        

    // // simple FOR
    // public void freqFill( final ArrayPlus freqs) {
        // for( int index = 0; index < refToArray.length; index++) 
            // freqs.refToArray[ this.refToArray[ index]]++;
    // }        
}
