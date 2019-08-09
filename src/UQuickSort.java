import java.util.Arrays;

import javax.swing.JOptionPane;

public class UQuickSort {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        
        String s =JOptionPane.showInputDialog("How many elements?");
        int num = Integer.parseInt(s);
        
        int[] theList = makeList(num);
        
       System.out.println( Arrays.toString(theList) );
       
       quickSortIt(theList, 0, theList.length);
       
       System.out.println( Arrays.toString(theList) );

    }
    
    public static void quickSortIt(int[] l, int start, int end) {
        
        if(end-start < 2) {
            return;
        }
        
        int pivotIndex = partitionIt(l, start, end);
        quickSortIt(l, start, pivotIndex);
        quickSortIt(l, pivotIndex + 1, end);
          
    }
    
    public static int partitionIt(int[] l, int start, int end) {
        //Using first element as the pivot
        int pivot = l[start];
        int i = start;
        int j = end;
        
        while(i < j ) {
            
            while(i < j && l[--j] >= pivot) {}
            if (i < j) {
                l[i]= l[j];
            }
            while(i < j && l[++i] <= pivot) {}
            if (i < j) {
                l[j]= l[i];
            }
        }
        
        l[j] = pivot;
        return j;
    }
    
    
    public static int[] makeList(int n) {
        
        int[] l = new int[n];
        
        for( int i = 0; i < l.length; i++) {
            l[i] = (int)(Math.random() * 100) - 50;
        }
        
        return l;
    }

}
