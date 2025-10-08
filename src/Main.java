import java.util.Scanner;

/**
 * source file contains three package programs
 * 1. Main.java
 *          -Number to RomanNumerals conversion
 * 2.SortedNames.java
 *          -Sorts names by alphabetical order
 * 3.BadWIFI.java
 *          -Walks user through steps troubleshooting bad WIFI
 *
 *
 * @paramString[] RomanNumeral - sets array for roman numeral values
 *                 -argument within getUserData method
 * @paramint[] Numbers - sets array for values 90-1
 *              -argument within getUserData method
 * above parameters within public class and accessible throughout package
 *              -system.out class used to print welcome message
 * @paramgetUserData - used to provide main function of program
 *                    -aquires user data from input
 *                    -checks if value is within range
 *                    -creates modifiable array to store roman Numeral
 *                    -prints out put value and corresponding roman numeral
 * @paramScanner value- returns user input
 *                - int num holds input value but does not store in address
 *
 * @paramStringBuilder class - used to store and modify string array and compare value with corresponding roman
 *                      numeral
 */

public class Main
{
    public static class NumbersArray {
        public static void main(String[] args) {
            String[] RomanNumeral = {"XC", "L", "XL", "X", "IX", "V", "IV", "I"};
            // creates an array
            int[] Numbers = {90, 50, 40, 10, 9, 5, 4, 1};

            //welcome message
            System.out.println("Welcome to the Integer to Roman Numeral Converter!");
            System.out.println("Enter an integer between 1 and 90 and the converter will do the rest!");

            getUserData(Numbers, RomanNumeral);
        }

        private static void getUserData(int[] Numbers, String[] RomanNumeral) {
            //Scanner to store user input into 'value'
            Scanner value = new Scanner(System.in);

            int num = value.nextInt();

            //error catch method

            if (num < 1 || num > 90) {
                System.out.println("Your value is out of bounds.");
                return;
            }

            //allows the String array to be modified
            StringBuilder Roman = new StringBuilder();
            //loop through the values and symbols to build the roman numeral
            for (int i = 0; i < Numbers.length; i++) {
                while (num >= Numbers[i]) {
                    Roman.append(RomanNumeral[i]);
                    num -= Numbers[i];

                }
                System.out.println("The value you entered: " + Numbers[i] + " \tin roman numerals is: " + Roman.toString());
                value.close();
            }

        }
    }
}



