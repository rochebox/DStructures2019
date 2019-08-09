import java.util.Arrays;

import javax.swing.JOptionPane;

public class UMergeSortRecursive {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        
        String s =JOptionPane.showInputDialog("How many elements?");
        int num = Integer.parseInt(s);
        
        int[] theList = makeList(num);
        
       System.out.println( Arrays.toString(theList) );
       
       mergeSortIt(theList, 0, theList.length);
       
       System.out.println( Arrays.toString(theList) );
       
    }
    
    
    
    public static void mergeSortIt(int[] l, int start, int end) {
        //System.out.println("In mergeSortIt with start: " + start + " and end: "
        //        + end);
        if( end - start < 2) {
            return;  //breaks the recursion
        }
            
        // here you partition
        int mid = (start + end) /2;
        mergeSortIt(l, start, mid);
        mergeSortIt(l, mid, end);// weirdly they do mid here
        
        merge(l, start, mid, end);
        
       
    }
    
    public static void merge(int[] l, int start, int mid, int end) {
        
        if( l[mid-1] <= l[mid]) {
            //System.out.println("Comparing mid-1: " + (mid-1) + " to mid: " + mid);
            //System.out.println("and found that mid-1 value is less than mid value");
            //System.out.println("l[mid-1]: " + l[mid-1] + "l[mid]: " + l[mid]);
                                     //this is an optimization
            return;                 //using the concept of fully sorted lists
        }
        
         //this sucks...
        int i = start;
        int j = mid;
        int tempIndex = 0;
        
        
        int temp[] = new int[end-start];
        
        while( i < mid && j < end ) {
            temp[tempIndex++] = l[i] <= l[j] ? l[i++]: l[j++]; 
        }
        //handle remaining elements
        //when we have elements on right (at the end of the array),
        //we don't have anything to do
        //this is an optimization
        
        System.arraycopy(l, i, l, start + tempIndex, mid - i);
        
        System.arraycopy( temp,  0,  l,  start,  tempIndex); 
        
    }
    
 
    
   
   
    
    public static int[] makeList(int n) {
        
        int[] l = new int[n];
        
        for( int i = 0; i < l.length; i++) {
            l[i] = (int)(Math.random() * 100) - 50;
        }
        
        return l;
    }

}
