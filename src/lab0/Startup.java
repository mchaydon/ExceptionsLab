package lab0;

/**
 *
 * @author Instlogin
 */
public class Startup {

    public static void main(String[] args) {

        Employee emp = new Employee("Jim","Smith","123456789",28);
        
        // Think about this code. It wouldn't work if lastName was null
        String fullNameInCaps = 
                emp.getFirstName().toUpperCase() 
                + " " + emp.getLastName().toUpperCase();
        
    }
}
