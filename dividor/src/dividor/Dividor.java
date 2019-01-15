
package dividor;

import java.util.Scanner;
public class Dividor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner in = new Scanner(System.in);
        
        System.out.println("enter a number");
        
        int x = in.nextInt();
        
        
        
        for (int i =1; i<=x ; i++){
       
            if (x % i == 0 )
                System.out.println(i);
        
        
        }
        
        
    }
    
}
