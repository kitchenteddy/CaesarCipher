package CipherClient;




import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author teddykitchen
 */
public class CipherUserInterface {
    
    
    /**
     * Begins the user interface of this program.  Should be called by the main method of the application
     * to begin this UI dialog
     */
    public void runCipherProgram() {
        
        System.out.println("Welcome to Teddy Kitchen's Caesar Cipher demo program. \n");
        
        
        
        
        //Get shift value from the user
        int myShift = this.acquireShift();
        
        //Initialize Cipher as CaesarCipher with appropriate shift
        Cipher caesarCipher = new CaesarCipher(myShift);
        
        //Get message to encrypt from the user
        String toEncode = this.acquireMessage();
        
        
        //get results
        String encodedResult = caesarCipher.encodeString(toEncode);
        
        String decodedResult = caesarCipher.decodeString(toEncode);
        
        //Display Results
        
        System.out.print("\n\n********RESULTS********");
        System.out.print("\n\ninput = ");
        System.out.println(toEncode);
        System.out.print("\ninput encoded = ");
        System.out.println(encodedResult);
        System.out.print("\ninput decoded = ");
        System.out.println(decodedResult);
        System.out.print("\nshift = ");
        System.out.println(myShift);
        System.out.print("\n\n");
        System.out.println("********END OF RESULTS********\n\n");
        
    }
    
    
    
    /**
     * prompts the user to enter a number into the console until a valid entry is acquired
     * @return the int value entered by the user
     */
    public int acquireShift() {
        System.out.println("Please enter an integer shift for the CaesarCipher.");
        Scanner scanner = new Scanner(System.in);
        int shift = 0;
        boolean shiftAcquired = false;
        while (!shiftAcquired) {
            try {   
                shift = scanner.nextInt();
                
                shiftAcquired = true;
            }
            catch (InputMismatchException e) {
                System.out.println("Please enter a valid shift.");
                scanner = new Scanner(System.in);
            }
        }
        return shift;
    }
    
    
    /**
     * prompts the user to enter a message to be encrypted into the console
     * @return the string entered by the user
     */
    public String acquireMessage() {
        System.out.println("Enter text to encrypt.");
        Scanner scanner = new Scanner(System.in);
        String message = scanner.next();
        return message;
        
    }
            
}
