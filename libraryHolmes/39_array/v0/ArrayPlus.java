/******************************************************************************
 * practice with arrays
 ******************************************************************************/

public class ArrayPlus {
    int[] refToArray;
    
    public ArrayPlus( int capacity) {
        refToArray = new int[ capacity];  // all entries 0
    }
    
    public ArrayPlus( int capacity, int maxRandom) {
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
    
    public int indexOf( int findMe) {
        for( int index = 0; index < refToArray.length; index++) 
            if( refToArray[ index] == findMe) return index;
        return -1;
    }
    
    public void freqFill( ArrayPlus freqs) {
        for( int index = 0; index < refToArray.length; index++) 
            freqs.refToArray[ this.refToArray[ index]]++;
    }        
}
