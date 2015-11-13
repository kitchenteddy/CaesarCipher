package CipherClient;

/**
 * This interface provides an API for classes which encrypt and decrypt strings
 *
 * @author teddykitchen
 */
public interface Cipher {
    
    /**
     * Takes a String that has been encoded by this type of cipher
     * and returns that string in its readable form.
     * 
     * @param toDecode
     * @return input string in readable form
     */
    public String decodeString(String toDecode);
    
    
    
    
    /**
     * Takes a String and returns that string encoded by the cipher.
     * 
     * @param toEncode
     * @return input string encrypted by this Cipher
     */
    public String encodeString(String toEncode);
    
}
