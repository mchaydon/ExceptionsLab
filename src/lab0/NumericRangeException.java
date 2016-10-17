/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab0;

/**
 *
 * @author Mike
 */
public class NumericRangeException extends Exception{
    private static String message = "Arguments are out of acceptable range";

    public NumericRangeException() {
        super(message);
    }

    public NumericRangeException(String message) {
        super(NumericRangeException.message);
    }

    public NumericRangeException(String message, Throwable cause) {
        super(NumericRangeException.message, cause);
    }

    public NumericRangeException(Throwable cause) {
        super(cause);
    }

    public NumericRangeException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(NumericRangeException.message, cause, enableSuppression, writableStackTrace);
    }
    
    public static void main(String[] args) {
        NumericRangeException e = new NumericRangeException();
        String msg = e.message;
        System.out.println(msg);
    }
}
