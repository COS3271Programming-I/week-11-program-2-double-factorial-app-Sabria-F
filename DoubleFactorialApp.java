import java.util.InputMismatchException;
import java.util.Scanner;

public class DoubleFactorialApp {
    //Initiate scanner for taking user input.
    static Scanner userinput = new Scanner(System.in);

    //Define the main method.
    public static void main(String[] args) {
        
        //Initiate an integer to hold the user's choice.
        int userNum;

        //Formatting.
        System.out.println("\n");

        //Prompt the user to enter an integer.
        //Also, call the error trapping method.
        userNum = intTry("Enter an integer to take the double factorial of --> ");

        //Formatting.
        System.out.println("\n");

        //Display the result.
        System.out.println("The double factorial of " + userNum + " is: " + calculateDoubleFactorial(userNum));

        //Formatting.
        System.out.println("\n");

        //Tell the user the program is ending.
        System.out.println("The program is ending...");

        //Formatting.
        System.out.println("\n");

        //Close the scanner.
        userinput.close();

    }

    //This is the function that calcultes the double factorial.
    static int calculateDoubleFactorial(int opperand){

        //Set the result to have a default of 1.
        int result = 1;

        //Test if the opperand is less than or equal to 0.
        //This is to keep the program from going on endlessly.
        if(opperand <= 0){
            //return the result.
            //This is what actually stops the code.
            return result;
        }

        //Call and return the function but set the opperand to be two lower than before.
        //Also, multiply by the opperand, this will calculate the double factorial.
        return calculateDoubleFactorial(opperand - 2) * opperand;

        
    }

    //This method prevents the user from entering anything besides integers.
    static int intTry(String message){
        
        //Define an integer to hold the user's response.
        int response;

        //This while loop will continue running until a value is returned to the method.
        while (true) {

            //Test the code inside for errors while running.
            try{
                //Display the message that was required as an argument.
                System.out.print(message);
                //Set the response to the int the user entered.
                //This will throw an exception if the user input wasn't an int.
                response = userinput.nextInt();
                userinput.nextLine();
                //Return the response.
                //This is what prevents the loop from going on forever.
                return response;
            }
            //If an error was found, this part of the code will prompt the user to enter the data again.
            catch (InputMismatchException e){
                userinput.nextLine();
            } 
        }
    }
}
