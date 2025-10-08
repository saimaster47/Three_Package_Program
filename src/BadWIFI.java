import java.util.Scanner;


/**
 * @paramInt steps holds input for option 2
 *            -options/steps held in do-while loop
 * @paramInt repeat
 *            -repeats option 1 or 2 and satisfies do-while loop
 * @paramScanner option reads in option input from user
 *                -1 = yes
 *                -2 = no
 *
 * @paramDo-while statement
 *          -loops as long as condition is false (option = 2)
 *          -loop ends when true value met (option 1)
 * @paramOption.close
 *          -closes scanner input
 *          -ends program if no other option is available
 *
 */

public class BadWIFI{
    public static void main(String[] args) {
        int steps = 0; //to hold input
        int repeat = 0;

        //Welcome message
        System.out.println("Welcome to the WIFI troubleshooting screen");
        System.out.println("We'll walk you through troubleshooting your WIFI connection!");

        //Scanner to take in input
        Scanner option = new Scanner(System.in);

        //do-while statement set to repeat as long as option 1 is not selected
        // options 1: troubleshooting fixed
        //option 2: next step
        do{
            switch(steps){
                case 1:
                    System.out.println("First Reboot the computer and try to connect.");
                    break;

                case 2:
                    System.out.println("Lets reboot the router and try to connect.");
                    break;

                case 3:
                    System.out.println("Make sure the cables between the router & modem are plugged in firmly.");
                    break;

                case 4:
                    System.out.println("Move the router to a new location and try to connect");
                    break;

                case 5:
                    System.out.println("No more available options, a new router is recommended");
                    break;

                default:
                    break;

            }

            //if statement to handle option input and response to  previous solution
            if(steps <= 5) {
                System.out.println("Did that fix the problem?");
                System.out.print("1: Yes, 2: No ");

                int input = option.nextInt();

                //if option 2 is selected do-while steps to next step with steps++ counter
                if (input == 2) {
                    steps++;
                }
                repeat = input;
                //if statement to close scanner selection and rudimentary way to end program
                if (steps >= 5) {
                    option.close();
                }
            }
        }
        while(repeat == 2);

        //success!
        if(repeat == 1){
            option.close();
            System.out.println("Terrific glad to help.");
        }
    }
}