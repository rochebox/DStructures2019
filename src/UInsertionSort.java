import java.util.Arrays;

import javax.swing.JOptionPane;

public class UInsertionSort {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        
        String s =JOptionPane.showInputDialog("How many elements?");
        int num = Integer.parseInt(s);
        
        int[] theList = makeList(num);
        
       System.out.println( Arrays.toString(theList) );
       

       
       insertionSortIt(theList);
       System.out.println( Arrays.toString(theList) );
    }
    
    public static void insertionSortIt(int[] l) {
            
        for( int firstUnsortedI = 1; firstUnsortedI < l.length; firstUnsortedI++ ) {
             int newElement = l[firstUnsortedI];  //save the index
             int loopI; //iterator for sorted portion
             
//             for (loopI = firstUnsortedI; loopI > 0 && l[loopI-1] > newElement; loopI-- ) {
//                 l[loopI] = l[loopI - 1];  //we do the shift         
//             } 
             
             for (loopI = firstUnsortedI; loopI > 0 ; loopI-- ) {
                 
                 if(l[loopI-1] <= newElement) {
                     break;
                 } else {
                     l[loopI] = l[loopI - 1];  //we do the shift 
                 }
             }            
             
             l[loopI] = newElement;  //move the element to the new place       
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
