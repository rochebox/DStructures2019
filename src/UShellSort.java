import java.util.Arrays;

import javax.swing.JOptionPane;

public class UShellSort {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        
       String s =JOptionPane.showInputDialog("How many elements?");
       int num = Integer.parseInt(s);
        
       int[] theList = makeList(num);
        
       System.out.println( Arrays.toString(theList) );
       
       ShellSortIt(theList);
       System.out.println( Arrays.toString(theList) );
       System.out.println("done");
    }
    
    public static void ShellSortIt(int[] l) {
        
        for(int gap = l.length/2; gap > 0; gap/= 2) {
            //System.out.println("In top of loop gap is " + gap);
            for(int i = gap; i < l.length;  i++) {
                //System.out.println("In top of second loop i is " + i);   
                int newElement = l[i];  //save the index
                int j = i; //iterator for sorted portion
                
                while(j >= gap && l[j - gap] > newElement) {
                    l[j] = l[j - gap];  //we do the shift
                    j -= gap;
                }
                
                l[j] = newElement;
            }   
        }    
    }
    
   
   
    
    public static int[] makeList(int n) {
        
        int[] l = new int[n];
        
        for( int i = 0; i < l.length; i++) {
            l[i] = (int)(Math.random() * 1000000);
        }
        
        return l;
    }

}
