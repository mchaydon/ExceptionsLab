package lab0;

import java.util.regex.Pattern;

/**
 * In this challenge you need to address the probability that at some
 * point the arguments to method parameters may not be valid. 
 * <p>
 * For example, String arguments may be null or empty; other objects may be 
 * null; or primitive numbers may be out of acceptable range.
 * <p>
 * You need to validate ALL method parameters to make sure any and all 
 * arguments are valid. The only exception is when any argument is acceptable 
 * based on requirements. Fix the code below using if logic to validate
 * method arguments and throw IllegalArgumentException or a custom
 * exception if the validation fails.
 * 
 * @author  Jim Lombardo, jlombardo@wctc.edu
 * @version 1.00
 */
public class Employee {
    public static final int MAX_VACATION_DAYS = 28;
    private String firstName;
    private String lastName;
    private String ssn;
    private int daysVacation;
    private Pattern p = Pattern.compile("[^a-zA-Z0-9'-]");

    public Employee() {
        // initialize a bunch of default values
        firstName = "Unknown";
        lastName = "Unknown";
        ssn = "Unknown";
        daysVacation = 0;
    }

    public Employee(String firstName, String lastName, String ssn, int daysVacation) throws IllegalArgumentException {
        setFirstName(firstName);
        setLastName(lastName);
        setSsn(ssn);
        this.daysVacation = daysVacation;
    }
    
    public int getDaysVacation() {
        return daysVacation;
    }
    
    //Validation Rules: 
    //Days vacation must be between 0 and 120 inclusive
    public void setDaysVacation(int daysVacation) throws DaysVacationRangeException {
        if (daysVacation < 0 || daysVacation > 120){
            throw new DaysVacationRangeException();
        }
        this.daysVacation = daysVacation;
    }

    public String getFirstName() {
        return firstName;
    }

    //Validation Rules:
    // *no nulls
    // *no empty strings
    // *no names larger than 50 characters
    // *no name should start with or be excusively spaces
    // *names must only contain alphabetic or numeric characters, plus apostrophe and hyphens
    public final void setFirstName(String firstName) throws IllegalArgumentException{
       if (firstName == null){
           throw new IllegalArgumentException("First name can not be null");
       } 
       if (firstName.isEmpty()){ 
           throw new IllegalArgumentException("First name can not be empty");
       }
       if (firstName.startsWith(" ")){ 
           throw new IllegalArgumentException("First name can not be start with or be excusively spaces");
       }
       if (firstName.length() > 50){ 
           throw new IllegalArgumentException("First name must be between 0 and 50 characters");
       }
       if(p.matcher(firstName).find()){
           throw new IllegalArgumentException("First name must only contain alphabetic or numeric characters, plus apostrophe and hyphens");
       }
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    //Validation Rules:
    // no nulls
    // no empty strings
    // no names larger than 50 characters
    // no name should start with or be excusively spaces
    // names must only contain alphabetic or numeric characters, plus apostrophe and hyphens
    public void setLastName(String lastName) throws IllegalArgumentException{
        if (lastName == null){
           throw new IllegalArgumentException("Last name can not be null");
       } 
       if (lastName.isEmpty()){ 
           throw new IllegalArgumentException("Last name can not be empty");
       }
       if (lastName.startsWith(" ")){ 
           throw new IllegalArgumentException("Last name can not be start with or be excusively spaces");
       }
       if (lastName.length() > 50){ 
           throw new IllegalArgumentException("Last name must be between 0 and 50 characters");
       }
       if(p.matcher(lastName).find()){
           throw new IllegalArgumentException("Last name must only contain alphabetic or numeric characters, plus apostrophe and hyphens");
       }
        this.lastName = lastName;
    }
    
    
    public final String getSsn() {
        return ssn;
    }

    //Validation Rule:
    // *no nulls
    // *no empty strings
    // *no letters
    // *no strings over 9 numbers
    public void setSsn(String ssn) throws IllegalArgumentException{
        String[] parts = ssn.split("-");
        if (ssn.length() < 9 || ssn.length() > 11){
            throw new IllegalArgumentException();
        } 
        if (parts.length != 3 || parts.length != 1) {
            throw new IllegalArgumentException();
        }
        char[] chars = ssn.toCharArray();
        for (char c : chars){
            if(!Character.isDigit(c)) {
                throw new IllegalArgumentException();
            }
        }
//        if (ssn == null){
//            throw new IllegalArgumentException("ssn can not be null");
//        } else if (ssn.isEmpty()){
//            throw new IllegalArgumentException("ssn can not be empty");
//        } else if (!ssn.matches("[0-9]+")){
//            throw new IllegalArgumentException("ssn can not contain letters");
//        } else if (ssn.length() > 9){
//            throw new IllegalArgumentException("ssn can not be longer than 9 numbers");
//        }
        this.ssn = ssn;
    }
    
    
    
}
