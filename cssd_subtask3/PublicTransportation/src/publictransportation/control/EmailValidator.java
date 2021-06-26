/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package publictransportation.control;

/**
 *
 * @author Kavindu Gayashan
 */

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailValidator {
    
    //This Code was extracted from https://www.geeksforgeeks.org/check-email-address-valid-not-java/
    
    /**
     * This function will accept an email address and validate it 
     * @param email String
     * @return Boolean Validation result
     */
    public static boolean isValid(String email)
    {
        String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\."+
                            "[a-zA-Z0-9_+&*-]+)*@" +
                            "(?:[a-zA-Z0-9-]+\\.)+[a-z" +
                            "A-Z]{2,7}$";
                             
        Pattern pat = Pattern.compile(emailRegex);
        if (email == null)
            return false;
        return pat.matcher(email).matches();
    }
    
    
    
}
