package lab2;

import javax.swing.JOptionPane;

/**
 * This class is responsible for all input and output in the program.
 * 
 * @author  Jim Lombardo, jlombardo@wctc.edu
 * @version 1.00
 */
public class InputOutputGui {
    private NameService nameService;

    public InputOutputGui() {
        nameService = new NameService();
    }

    public final void startConversation() {
        String lastName = "Unknown";
        
        while (lastName == "Unknown" || lastName == null){
            String fullName = JOptionPane.showInputDialog("Enter full name (use Format: first last):");
            try {
                lastName =  nameService.extractLastName(fullName);
                String msg = "Your last name is: " + lastName;
                JOptionPane.showMessageDialog(null, msg);
            } catch (IllegalArgumentException e){
                JOptionPane.showMessageDialog(null, e.getMessage());
            } 
        }
        
    }
     
}
