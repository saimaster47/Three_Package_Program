import java.util.Scanner;

/**
 * @paramScannerNames used to read in user input
 *                      -Names.nextLine(); stores and outputs the first index of array
 * @paramIntN stores the amount of names the user wishes to sort
 *                      -initializes array size to be processed
 * @paramString[]Names holds input within array
 *                      -places names in the index of the array
 *                      -for loop processes each name in their respective index
 * @paramString temp compares the first name [i] across the array storing the first name in a
 *                       variable temp until it reaches end of array
 *                       variable [j] is the next name in array and is compared to [i]
 *  finally the output is run through a for loop printing the sorted array in alphabetical order
 *@paramNames.close closes the input stream
 *
 */

public class SortedNames {
    public static class Names {
        public static void main(String[] args) {

            //welcome message
            System.out.println("Welcome to the Sorted Names Program!");
            System.out.println("Enter a few names and our program will sort in Alphabetical order!");

            //scanner object for input
            Scanner Names = new Scanner(System.in);
            // stores number of names entered
            System.out.println("How many names are we sorting for you?");
            int n = Names.nextInt();

            // holds input
            String[] names = new String[n];
            Names.nextLine();
            for(int i = 0; i < n; i++){
                System.out.println("Enter names " + (i + 1) + ":");
                names[i] = Names.nextLine();
            }

            //compares names to be sorted
            String temp;
            for(int i = 0; i < n; i++){
                for(int j = i + 1; j < n; j++){
                    //compares on string with the other
                    if(names[i].compareTo(names[j]) > 0) {
                    temp = names[i];
                    names[i] = names[j];
                    names[j] = temp;
                    }
                }
            }

            //prints output
            System.out.println("The names in alphabetical order are: ");
            for(int i = 0; i < n; i++){
                System.out.println(names[i]);
            }
            //.close method closes scanner
            Names.close();
        }
    }
}