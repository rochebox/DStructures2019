import java.util.Arrays;

import javax.swing.JOptionPane;

public class UCountingSort {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        
       String s =JOptionPane.showInputDialog("How many elements?");
       int num = Integer.parseInt(s);
        
       int[] theList = makeList(num);
        
        //int[] theList = { 4725, 4586, 1330, 8792, 1594, 5729 };
        
       System.out.println( Arrays.toString(theList) );
       
       CountingSort(theList, 1, 100);
       System.out.println( Arrays.toString(theList) );
       System.out.println("done");
    }
    
    public static void CountingSort(int[] l, int min, int max) {
        
        int[] countArray = new int[(max-min) + 1];
        
        System.out.println("Length of l: " + l.length);
        System.out.println("Length of countArray: " + countArray.length);
        
        
        //easy counting phase ...
        for(int i = 0; i < l.length; i++) {
            countArray[l[i] - min]++;    
        } 
        
        int j = 0;
        for(int i = min; i <= max; i++) {
            
            //loop to write numbers...
            while(countArray[i-min] > 0) {
               l[j++] = i;  // write the number
               countArray[i - min]--;  //since you wrote one of the numbers...decrement 
            }
        }
    }
    
   
   
    
    public static int[] makeList(int n) {
        
        int[] l = new int[n];
        
        for( int i = 0; i < l.length; i++) {
            l[i] = (int)(Math.random() * 100) + 1;  //random from 1 to 100
        }
        
        return l;
    }

}
