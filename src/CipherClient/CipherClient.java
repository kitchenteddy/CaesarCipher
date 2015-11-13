package CipherClient;


/**
 *
 * @author teddykitchen
 */
public class CipherClient {
     
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        CipherUserInterface ui = new CipherUserInterface();
        
        boolean go = true;
        
        while (go) {
            ui.runCipherProgram();
        }

    }
    
}
