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
public class DaysVacationRangeException extends NumericRangeException{
    private static String message = "Only values between 0 and 120 inclusive allowed";

    public DaysVacationRangeException() {
        super(message);
    }

    public DaysVacationRangeException(String message) {
        super(DaysVacationRangeException.message);
    }

    public DaysVacationRangeException(String message, Throwable cause) {
        super(DaysVacationRangeException.message, cause);
    }

    public DaysVacationRangeException(Throwable cause) {
        super(cause);
    }

    public DaysVacationRangeException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(DaysVacationRangeException.message, cause, enableSuppression, writableStackTrace);
    }
    
    public static void main(String[] args) {
        DaysVacationRangeException e = new DaysVacationRangeException();
        String msg = e.message;
        System.out.println(msg);
    }
}
