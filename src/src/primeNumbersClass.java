public class primeNumbersClass {
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
}
