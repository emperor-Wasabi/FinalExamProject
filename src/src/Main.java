import java.util.Arrays;

///////////////////////////////////////////////////////
// This is a final exam project for the class CSC-125/
// This was done by Eston Yandell                   /
// Its purpose is to demonstrate a comprehensive   /
// knowledge of the Java programming language     /
// by creating a program to decode a simple      /
// message.                                     /
////////////////////////////////////////////////
public class Main {
    public static void primeNumbers (int prime) {

        // Initializing Variables
        int x, y, primeCheck;


        // This next block will create the primes
        // Creating initial header
        System.out.println("All prime numbers between 1 and " + prime + " are: ");

        // This will loop through all numbers between 1 and 'prime'
        for ( x = 1; x <= prime; x++) {

            // if the loop reaches 1 or 0 then omit them.
            if ( x == 1 || x == 0) {
                continue;
            }

            // Variable to check if x is prime
            primeCheck = 1;

            for ( y = 2; y <= x / 2; ++y ) {
                if (x % y == 0) {
                    primeCheck = 0;
                    break;
                }
            }

            // If primeCheck is 1 then x is prime
            if (primeCheck == 1) {
                System.out.print(x + " ");
            }
        }
    } // primeNumbers End

    public static void decoderMethod (String[] method) {
        String[] encodedCharacters = {"A", "b", "H", "e", "d", "i", ";", "s", "l",
                "d", "3", "R", "d", "i", "6", "s", "d", "s", "h", "e", "g", "3", "s", "n",
                "&", "3", "3", "d", "2", "!", "a"};

             for (String character : encodedCharacters) {

             }
    }

    public static void main(String[] args) {
        //Initializing String
        String[] encodedCharacters = {"A", "b", "H", "e", "d", "i", ";", "s", "l",
                "d", "3", "R", "d", "i", "6", "s", "d", "s", "h", "e", "g", "3", "s", "n",
                "&", "3", "3", "d", "2", "!", "a"};

        System.out.printf("Encoded message, intercepted by the CIA: %n%s%n%n", Arrays.asList(encodedCharacters));

        // Initializing prime cap
        int primeCap = 100;

        //Executing method to display prime numbers
        primeNumbers(primeCap);

    }
}
