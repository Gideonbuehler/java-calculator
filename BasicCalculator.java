import javax.swing.*;
import java.awt.*;


public class BasicCalculator extends JFrame
{

    private JTextField inputField;

    public BasicCalculator() {

        // Set size and layout for the border of calculator
        setSize(300, 400);
        setLayout(new BorderLayout());

        // Sets an input field above the buttons 
        inputField = new JTextField();
        add(inputField, BorderLayout.NORTH);

        // Initiates grid layout for JPanel
        JPanel buttonPanel = new JPanel(new GridLayout(5, 4)); // Sets the grid to 5 rows and 4 columns
        String[] buttonLabels = {
                "del", "sqr", "sqrt", "clear",
                "7", "8", "9", "/",
                "4", "5", "6", "*",
                "1", "2", "3", "-",
                "0", ".", "=", "+"
        };

        // For loop to create a button for each item in buttonLabels
        for (String label : buttonLabels) {
            JButton button = new JButton(label);
            buttonPanel.add(button);
        }

        add(buttonPanel, BorderLayout.CENTER);
    }
        
    public static void main(String[] args) {
            BasicCalculator calculator = new BasicCalculator();
            calculator.setVisible(true);
    }

    // Allows the addition function
    public double add ()
    {
    }
    // ALlows the square root function
    public double squareRoot() 
    {
    }
    //Allows the subtraction function
    public double subtract() 
    {
    }
    //Allows the multiplication function
    public double multiply () 
    {
    }
    //Allows the division function
    public double divide() 
    {  
    }
    //Allows the square function
    public double square() 
    {
    }
    //Allows the equals function
    public double result() 
    {
    }
    //Allows the calculator screen to be cleared
    public double clear()
    {
    }
    //Allows a deletion from the screen
    public double delete() 
    {
    }

}
