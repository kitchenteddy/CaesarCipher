package CipherClient;

/**
 *
 * This class contains any constant values that need to be used by the program
 * when adding to the program, programmers should add static methods to this
 * class 
 * 
 * @author teddykitchen
 */
public final class Constants {
    
    
    

    /**
     * DO NOT USE.  IMPLEMENTED HERE TO PREVENT EXTERNAL USE.
     * ONLY CALL CLASS METHODS FROM THIS CLASS
     * 
     * 
     * this method is private so that a defualt constructor cannot be used 
     * this constructor should not be used. This class is meant to only have static methods
     * and should never be instantiated.
     */
    private Constants() {
        //DO NOT USE
    }
    
    /**
     * 
     * @return the ascii representation of "z"
     */
    public static int maxLowerCase() {
        return 122;
    }
   
    /**
     * 
     * @return the ascii representation of "a"
     */
    public static int minLowerCase() {
        return 97;
    }
    
    
    /**
     * 
     * @return the ascii representation of "Z"
     */
    public static int maxUpperCase() {
        return 90;
    }
   
    
    /**
     * 
     * @return the ascii representation of "A"
     */
    public static int minUpperCase() {
        return 65;
    }
    
    /**
     * length of the encoded alphabet
     * @return 
     */
    public static int alphabetLength() {
        return 26;
    }

}



