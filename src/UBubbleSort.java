import java.util.Arrays;

import javax.swing.JOptionPane;

public class UBubbleSort {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        
        String s =JOptionPane.showInputDialog("How many elements?");
        int num = Integer.parseInt(s);
        
        int[] theList = makeList(num);
        
       System.out.println( Arrays.toString(theList) );
       
       //bubbleSortIt(theList);
       bubbleSortUdemy(theList);
       System.out.println( Arrays.toString(theList) );
    }
    
    public static void bubbleSortUdemy(int[] l) {
        
        for( int lastSortedIndex = l.length -1; lastSortedIndex > 0; lastSortedIndex-- ) {
            for(int i = 0; i < lastSortedIndex; i++) {
                if(l[i] > l[i+1]) {
                    swap(i, i+1, l);
                }
            }
        }
        
    }
    
    public static void bubbleSortIt(int[] l) {
        
        boolean done = false;
        int len2Sort = l.length;
        
        do {
            boolean wasSwap = false;
            for(int i = 0; i < len2Sort-1; i++) {
                if(l[i] > l[i+1]) {
                    swap(i, i+1, l);
                    wasSwap = true;
                }
            }
            if(!wasSwap) done = true;
        } while (!done );
        
        
    }
    
    public static void swap( int i1, int i2, int[]l) {
            
            if(i1 == i2) {
                return;
            } else {
                int temp = l[i1];
                l[i1] = l[i2];
                l[i2] = temp;
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
