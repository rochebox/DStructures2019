import java.util.Arrays;

import javax.swing.JOptionPane;

public class UInsertionSortRecEttrich {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        
        String s =JOptionPane.showInputDialog("How many elements?");
        int num = Integer.parseInt(s);
        
        int[] theList = makeList(num);
        
       System.out.println( Arrays.toString(theList) );
         
       insertionSortEtt(theList, theList.length);
       System.out.println( Arrays.toString(theList) );
    }
    

    
    

    
    public static void insertionSortEtt(int[] l, int numItems) {
        //breaking condition
        if(numItems < 2) {
            return;
        }
        // keep inserting
        System.out.println("Calling insertionSortEtt with numItems-1 being: " + (numItems-1));
        insertionSortEtt(l, numItems -1);
        
        //then just do what did down here
        int newElement = l[numItems-1];
        int i;
        for(i = numItems-1; i > 0 && l[i-1] > newElement; i--) {
            l[i] =  l[i-1];
        }
        
        l[i] = newElement;
        
//        System.out.println("Result of call when numItems = " + numItems);
//        System.out.println(Arrays.toString(l));
//        System.out.println("_______________________________________");
        
    }
   
   
    
    public static int[] makeList(int n) {
        
        int[] l = new int[n];
        
        for( int i = 0; i < l.length; i++) {
            l[i] = (int)(Math.random() * 100) - 50;
        }
        
        return l;
    }

}
