import java.util.ArrayList;
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
    static int isPrime (int n){
        //corner
        if (n <= 1) {
            return n;
        }

        //checks if prime
        for ( int i = 2; i < n; i++ ) {
            if (n % i == 0) {
                break;
            }
        }
        return n;
    }
    public static void main(String[] args) {
        //Initializing String
//        String[] encodedMessage =
//                {
//                "A", "b","H", "e", "d", "i", ";", "s", "l", "d", "3", "R", "d", "i", "6", "s", "d", "s", "h", "e", "g",
//                "3", "s", "n", "&", "3", "3", "d", "2", "1", "a"
//        };
        ArrayList<String> encodedMessage = new ArrayList<String>(50);
        encodedMessage.add(0,"A");
        encodedMessage.add(1, "b");
        encodedMessage.add(2, "H");
        encodedMessage.add(3, "e");
        encodedMessage.add(5, "d");
        encodedMessage.add(6, "i");
        encodedMessage.add(7, ";");
        encodedMessage.add(8, "s");
        encodedMessage.add(9, "l");
        encodedMessage.add(10, "d");
        encodedMessage.add(11, "3");
        encodedMessage.add(12, "R");
        encodedMessage.add(13, "d");
        encodedMessage.add(14, "i");
        encodedMessage.add(15, "6");
        encodedMessage.add(16, "s");
        encodedMessage.add(17, "d");
        encodedMessage.add(18, "s");
        encodedMessage.add(19, "h");
        encodedMessage.add(20, "e");
        encodedMessage.add(21, "g");
        encodedMessage.add(22, "3");
        encodedMessage.add(23, "s");
        encodedMessage.add(24,"n");
        encodedMessage.add(25, "&");
        encodedMessage.add(26, "3");
        encodedMessage.add(27, "3");
        encodedMessage.add(28, "d");
        encodedMessage.add(29, "2");
        encodedMessage.add(30, "1");
        encodedMessage.add(31, "a");


        for (int count = 0; count < encodedMessage.size(); count++) {
            System.out.printf("%5d%8s%n",encodedMessage.get(count));
        }

        // Initializing prime cap
        int primeCap = 100;

        //Executing method to display prime numbers
        primeNumbersClass.primeNumbers(primeCap);
    }
}
