import java.util.Arrays;

import javax.swing.JOptionPane;

public class ArrayThing {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        
             int[] myArray = new int[7];
             
             myArray[0] = (int) (Math.random() * 100);
             myArray[1] = (int) (Math.random() * 100);
             myArray[2] = (int) (Math.random() * 100);
             myArray[3] = (int) (Math.random() * 100);
             myArray[4] = (int) (Math.random() * 100);
             myArray[5] = (int) (Math.random() * 100);
             myArray[6] = (int) (Math.random() * 100);
             
             System.out.println(Arrays.toString(myArray));
             
             String s =JOptionPane.showInputDialog("Give number to find");
             int num = Integer.parseInt(s);
             
             int locIndex = -1;
             for(int i = 0; i < myArray.length; i++) {
                 if(myArray[i] == num) {
                     locIndex = i;     
                 } 
             }
             
             if(locIndex >= 0) {
                 System.out.println("Found " + num + " at index " + locIndex);
             } else {
                 System.out.println( num + " is not on list.");
             }
        
    }
    
    

}
