/*
 * Programmer:Liam Robinson
 * Date: Sep,23
 * Purpose:
 */

public class AboutMe {
    public static void main (String [] args) {
        // Declaring the variables
        // TODO: Write the code the declares the variables
    	String myName = "Liam";
    	int myAge = 17;
    	double myHeightInMetres = 187.96; 

        // Print the values
        System.out.println("Hi, my name is " + myName);
        System.out.println("I am " + myAge + " years old.");
        System.out.println("My height is " + myHeightInMetres + " m.");

        // Change the variables
        // TODO: Write the code that changes the variables
         myAge= 22;
         myHeightInMetres = 195.58;

        // Print the new values
        System.out.println("Some time passes...");
        System.out.println("Hi, my name is" + myName);
        System.out.println("I am " + myAge + " years old.'");
        System.out.println("My height is " + myHeightInMetres + " m.");
        // TODO: Write the last two print statements
    }
}
