import java.util.Arrays;

import javax.swing.JOptionPane;

public class UInsertionSortRecursive {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        
        String s =JOptionPane.showInputDialog("How many elements?");
        int num = Integer.parseInt(s);
        
        int[] theList = makeList(num);
        
       System.out.println( Arrays.toString(theList) );
         
       insertionSortItR(theList, 1);
       System.out.println( Arrays.toString(theList) );
    }
    
    public static void insertionSortItR(int[] l, int firstUnsorted) {
        
        if(firstUnsorted >= l.length) {
            return;
        } else {
            int newElement = l[firstUnsorted];  //save the index
            int where = insertNumRecursive(l, firstUnsorted, newElement); 
            l[where] = newElement;  //move the element to the new place  
            insertionSortItR(l, ++firstUnsorted);
        }
    }
    
    
    public static int insertNumRecursive(int[] l, int loopI, int newElement) {
            
            if( loopI<= 0 || l[loopI-1] <= newElement) {
                return loopI; // end the recursion
            } else {
                l[loopI] = l[loopI - 1]; //make the move
                return insertNumRecursive(l, loopI-1, newElement);
            }
        
    }
    
   
   
    
    public static int[] makeList(int n) {
        
        int[] l = new int[n];
        
        for( int i = 0; i < l.length; i++) {
            l[i] = (int)(Math.random() * 100) - 50;
        }
        
        return l;
    }

}
