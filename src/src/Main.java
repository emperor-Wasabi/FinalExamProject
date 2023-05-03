import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

///////////////////////////////////////////////////////
// This is a final exam project for the class CSC-125/
// This was done by Eston Yandell                   /
// Its purpose is to demonstrate a comprehensive   /
// knowledge of the Java programming language     /
// by creating a program to decode a simple      /
// message.                                     /
////////////////////////////////////////////////
public class Main {

    public static void main(String[] args) {
        //Initializing Variables

        //Initial String
        String encodedMessage = "AbHedi;sld3Rdi6sdshg3sn&33d21a";

        // Finds the total length of the initial string
        int lengthOfEncodedMessage = encodedMessage.length();

        // This will let us append the answer into a string later
        List<Integer> appendedMessage = new ArrayList<>();

        // This will contain the final result
        StringBuilder decodedMessage = new StringBuilder();

        // Test to make sure the characters are at their proper position(s)
        System.out.printf("%s%n", "Character Position: ");
        System.out.printf("%s%n%n", encodedMessage.indexOf("b"));

        // Header
        System.out.printf("%s%n%s%n", "CIA REPORT ON INTERCEPTED DATA:", "DATA INTERCEPTED: ");
        System.out.printf("%5s%8s%n", "Index", "Value");
        for (int count = 0; count < encodedMessage.length(); count++) {
            System.out.printf("%5d%8s%n", count, encodedMessage.charAt(count));
        }

        System.out.println();

        // Initializing prime cap
        int primeCap = 100;

        //Executing method to display prime numbers
        primeNumbersClass.primeNumbers(primeCap);

        // Find prime indices and add them to appendedMessage
        for (int i = 2; i < encodedMessage.length(); i++) {
            boolean isPrime = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                appendedMessage.add(i);
            }
        }

        // Add characters at prime indices to decodedMessage
        System.out.printf("%n%n%s%n", "Decoded Message: ");
        for (int x : appendedMessage) {
            decodedMessage.append(encodedMessage.charAt(x));
        }
        System.out.println(decodedMessage);
    }
}