/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3;

/**
 *
 * @author Mike
 */
public class FullNameLengthException extends Exception{
    private static String message = "Full name must contain atleast two parts";

    public FullNameLengthException() {
        super(message);
    }

    public FullNameLengthException(String message) {
        super(FullNameLengthException.message);
    }

    public FullNameLengthException(String message, Throwable cause) {
        super(FullNameLengthException.message, cause);
    }

    public FullNameLengthException(Throwable cause) {
        super(cause);
    }

    public FullNameLengthException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(FullNameLengthException.message, cause, enableSuppression, writableStackTrace);
    }
    
}
