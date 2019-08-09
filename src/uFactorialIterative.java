import javax.swing.JOptionPane;

public class uFactorialIterative {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        
        String s =JOptionPane.showInputDialog("Enter a factorial number...");
        int num = Integer.parseInt(s);
        
        System.out.println("Iterative " + interativeFactorial(num));
        System.out.println("Recursive " + factRecursive(num));

    }
    
    public static long interativeFactorial(int num) {
        
        if(num == 0) {
            return 1;
        } 
        
        long factorial = 1;
        for(int i = 1; i <= num; i++) {
            factorial *= i;
        }
        
        return factorial;    
    }
    
    // 1! = 0! * 1
    // 2! = 1! * 2
    // 3! = 2! * 3
    
    public static long factRecursive(int num) {
        if( num == 0) {
            return 1;
        }
        return factRecursive(num-1) * num;
        
    }

}
