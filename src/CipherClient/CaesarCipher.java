package CipherClient;

/**
 * class for creating a Caesar Cipher.
 * This class implements the Cipher interface, and once initialized with a shift
 * can encrypt and decrypt strings of text.
 * 
 * @author teddykitchen
 */
public class CaesarCipher implements Cipher {
    
    private int shift;
    private String inputText;
    private String outputText;
    
    
    
    /**
     * Constructor for CaesarCipher
     * @param newShift - the shift that this instance of CaesarCipher will apply to strings 
     */
    public CaesarCipher(int newShift) {
        this.setShift(newShift);
    }
    
    
    /**
     * takes a string encoded with this calculator's shift and returns an un-encoded version
     * @param toDecode
     * @return encoded string
     */
    @Override
    public String decodeString(String toDecode) {
        this.shift = this.shift * -1;
        String output = this.translate(toDecode);
        this.shift = this.shift * -1;
        return output;
    }
    
    
    /**
     * takes a string returns that string encoded with the Caesar cipher
     * @param toEncode
     * @return encoded string
     */
    @Override
    public String encodeString(String toEncode) {
        
        return this.translate(toEncode);
       
    }
            
    
    
   /**
    * takes a string and applies the shift to it
    * @param toTranslate
    * @return the string translated with the shift applied
    */
    private String translate(String toTranslate) {

        char[] inputLetters = toTranslate.toCharArray();
        String output = new String();
        
        //go through character arry and handle each letter 
        for (int i = 0; i < inputLetters.length; ++i) {
            int inputNumber = inputLetters[i];
            int outputNumber;
         
            if(this.intLiesBetween(inputNumber, Constants.minLowerCase(), Constants.maxLowerCase())) {
                outputNumber = this.normalizeLower(inputNumber + this.shift);
            }
            //Case: uppercase letter
            else if (this.intLiesBetween(inputNumber, Constants.minUpperCase(), Constants.maxUpperCase())) {
                outputNumber = this.normalizeUpper(inputNumber + this.shift);
            }
            //Case: not a letter, do not change
            else {
                outputNumber = inputNumber;
            }
            
            //cast the result to a Char and add it to the output array
            char outputChar = (char) outputNumber;
            output += outputChar;
                    
        }
        
        return output;
    }
    
    
    /**
     * if the shifted number is outside of the range of uppercase numbers, normalize it to within the correct range
     * @param toNormalize
     * @return number within uppercase range
     */
    private int normalizeUpper(int toNormalize) {
        int toReturn;
        //Case: input is greater than ascii "Z"
        if (toNormalize > Constants.maxUpperCase()) {
            toReturn = toNormalize - Constants.alphabetLength();
        }
        //Case: input is less than ascii "A"
        else if (toNormalize < Constants.minUpperCase()) {
            toReturn = toNormalize + Constants.alphabetLength();
        }
        //Case: input is a valid ascii uppercase letter
        else {
            toReturn = toNormalize;
        }
        return toReturn;
    }
    
    
    /**
     * if the shifted number is outside of the range of lowercase numbers, normalize it to within the correct range
     * @param toNormalize
     * @return number within lowercase range
     */
    private int normalizeLower(int toNormalize) {
        int toReturn;
        
        //Case: input is greater than ascii "z"
        if (toNormalize > Constants.maxLowerCase()) {
            toReturn = toNormalize - Constants.alphabetLength();
        }
        //Case: input is less than ascii "a"
        else if (toNormalize < Constants.minLowerCase()) {
            toReturn = toNormalize + Constants.alphabetLength();
        }
        //Case: input is a valid ascii lowercase letter
        else {
            toReturn = toNormalize;
        }
        return toReturn;
    }
    
    /**
     * helper method to determine if an input int lies between the start and end arguments
     * @param input
     * @param start
     * @param end
     * @return true iff input is between start and end
     */
    private boolean intLiesBetween(int input, int start, int end) {
        return (input >= start && input <= end);
    }
    
    
    
    
    /**
     * 
     * Recursively sets the integer shift for this calculator
     * This method will loop around the alphabet infinitely, so entering a value
     * That is one greater than the alphabet length will result in a shift of 1
     * 
     * @param newShift
     */
    private void setShift(int newShift) {
        if (newShift > Constants.alphabetLength()) {
            this.setShift(newShift - Constants.alphabetLength());
        }
        else if (newShift < (-1*Constants.alphabetLength())) {
            this.setShift(newShift+Constants.alphabetLength());
        }
        else {
            this.shift = newShift;
        }
    }

    
    

    
}




