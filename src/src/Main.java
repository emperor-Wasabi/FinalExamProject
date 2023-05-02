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

    static boolean isPrime (int n){
        //corner
        if (n <= 1) {
            return false;
        }
        for ( int i = 2; i < n; i++ ) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        //Initializing String
        String[] encodedMessage = {
                "A", "b","H", "e", "d", "i", ";", "s", "l", "d", "3", "R", "d", "i", "6", "s", "d", "s", "h", "e", "g",
                "3", "s", "n", "&", "3", "3", "d", "2", "1", "a"};

        // Initializing prime cap
        int primeCap = 100;

        //Executing method to display prime numbers
        primeNumbersClass.primeNumbers(primeCap);

    }
}
