import java.util.Arrays;

import javax.swing.JOptionPane;

public class U_JDK_Sort {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        
       String s =JOptionPane.showInputDialog("How many elements?");
       int num = Integer.parseInt(s);
       
       int[] theList = makeList(num);
        
       //int[] theList = { 4725, 4586, 1330, 8792, 1594, 5729 };
        
       System.out.println( Arrays.toString(theList) );
       
       
       
       jdk_sorting(theList);
       System.out.println( Arrays.toString(theList) );
       System.out.println("done");
    }
    
    public static void jdk_sorting(int[] l) {
        
       //Arrays.sort(l);
        Arrays.parallelSort(l);
        
    }  
        
     
    
    

   
   
    
    public static int[] makeList(int n) {
        
        int[] l = new int[n];
        
        for( int i = 0; i < l.length; i++) {
            l[i] = (int)(Math.random() * 1000000) + 1;  //random from 1 to 1M
        }
        
        return l;
    }

}
