import java.util.Arrays;

import javax.swing.JOptionPane;

public class URadixSortStrings {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        
       //String s =JOptionPane.showInputDialog("How many elements?");
       //int num = Integer.parseInt(s);
       // set up to make numbers between 1000 and 9999
       //String[] theList = {"bcdef", "dbaqc", "abcde", "omadd", "bbbbb" };
       //String[] theList = {"makes", "cakes", "bakes", "fakes", "jakes", "fools", "tools", "jools" }; 
       String[] theList = {"nod", "fod", "bad", "fad", "god", "gad", "had", "hag", 
               "mad", "nad", "mod" , "zod", "abe", "xie", "zod", "zip"              
       
       };   
        
       System.out.println( Arrays.toString(theList) );
       
       //radix is the number of possible digit values
       //binary radix is 2
       //decimal radix is 10
       //alphabet radix is 26
       // call is: radixSort(int[] l, int radix, int width) 
       radixSort(theList, 26, theList[0].length());
       System.out.println( Arrays.toString(theList) );
       System.out.println("done");
    }
    
    public static void radixSort(String[] l, int radix, int width) {
        
        //starts with the right most position to left
        //from least significant to most
        for( int i = width-1; i >= 0; i-- ) {
            System.out.println("Before radixSingleSort on position " + i);
            System.out.println( Arrays.toString(l) );
            radixSingleSort(l, i, radix);
            System.out.println("After radixSingleSort on position " + i);
            System.out.println( Arrays.toString(l) );
            System.out.println("-----------------------------------------");
        }
        
    } 
    
    
    //Overloaded!!
    public static void radixSingleSort(String[] l, int position, int radix) {
        
        int numItems = l.length;   
        int[] countArray = new int[radix];
        
        for( String value: l ) {
            countArray[getDigit(position, value, radix)]++;
        }
        
        //System.out.println("Unadjusted count array for position " + position);
        
        //now do the step to make it stable
        //adjust count array to make it those at place x or less
        for( int j = 1; j < radix; j++) {
            countArray[j] += countArray[j - 1];
        }
        
        //now copy the values into the temp array
        String[] temp = new String[numItems];
        
        //working from right to left
        //this preserves the order of duplicate values --
        //This makes the counting sort stable
        for( int tempIndex= numItems - 1; tempIndex >=0; tempIndex--) {
            temp[--countArray[getDigit(position, l[tempIndex], radix)]] = 
                    l[tempIndex];
        }
        
        //now copy back
        for(int tempIndex = 0; tempIndex < numItems; tempIndex ++) {
            l[tempIndex]= temp[tempIndex];
        }
        
    }
        
     
    
    
    
    public static void radixSingleSort(int[] l, int position, int radix) {
            
        int numItems = l.length;   
        int[] countArray = new int[radix];
        
        for( int value: l ) {
            countArray[getDigit(position, value, radix)]++;
        }
        
        System.out.println("Unadjusted count array for position " + position);
        
        //now do the step to make it stable
        //adjust count array to make it those at place x or less
        for( int j = 1; j < radix; j++) {
            countArray[j] += countArray[j - 1];
        }
        
        //now copy the values into the temp array
        int[] temp = new int[numItems];
        
        //working from right to left
        //this preserves the order of duplicate values --
        //This makes the counting sort stable
        for( int tempIndex= numItems - 1; tempIndex >=0; tempIndex--) {
            temp[--countArray[getDigit(position, l[tempIndex], radix)]] = 
                    l[tempIndex];
        }
        
        //now copy back
        for(int tempIndex = 0; tempIndex < numItems; tempIndex ++) {
            l[tempIndex]= temp[tempIndex];
        }
        
    }
    
    //Overloaded
    public static int getDigit(int position, String word, int radix) {
            String alpha = "abcdefghijklmnopqrstuvwxyz";
            char c =  word.charAt(position);
            System.out.println("in getDigit position: " + position + " char is: " + c);
            int returnNum = alpha.indexOf(c);
            System.out.println("returnNum is " + returnNum);
            return returnNum;
        
        
        //return value / (int) Math.pow(radix, position)  % radix;
        
    }
    
    
    public static int getDigit(int position, int value, int radix) {
        return value / (int) Math.pow(radix, position)  % radix;
        
    }
    
   
   
    
    public static int[] makeList(int n) {
        
        int[] l = new int[n];
        
        for( int i = 0; i < l.length; i++) {
            l[i] = (int)(Math.random() * 9000) + 1000;  //random from 1000 to 9999
        }
        
        return l;
    }

}
