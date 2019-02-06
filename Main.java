import java.util.Scanner;
import java.util.Stack;
/**
 * Program that uses a stack object to store the intermediate results of a calculation
 * and to display the final results
 *
 * @author Aram Hakobyan
 * @version Oct 24, 2018
 */
public class Main
{
    // Function takes two parameters value in decimal and the base to be converted
    private static String to_base(int input, int base)
    {
        /* Output string to carry the answer */
        String out;
        out = "";
        int tmp;

        /*
        Convert input number is given base by repeatedly
        dividing it by base and taking remainder
        */
        Stack<String> s =new Stack<>();
        while(input>0)
                {
                    tmp = input%base;
                    input/= base ;
                    out+= (char) (tmp+'0');
                    s.push(out) ;
                    out = "";
                }
        // Reversing the string using the stack
        out = "";
        while(!s.empty())
            out+= s.pop();
            return out;
    }
    // Driver code
    public static void main ( )
    {
        while(true)
        {
            int input;
            int base;

            Scanner scan;
            scan = new Scanner(System.in);

            System.out.println("Enter the Number in decimal notation (base 10)"
            +" and the Base (between 2 and 9) to be converted to. \nEnter 0 0 to Terminate! ");

            if(!scan.hasNextInt())
                {
                    System.out.println("Please enter the Number in Integers\n");
                    continue;
                }

            input = scan.nextInt();
            if(!scan.hasNextInt())
                {
                    System.out.println("Please enter the Number in Integers\n");
                    continue;
                }

            base = scan.nextInt();
            if (input==0 || base==0)
                System.exit(0);
            if (base <2 || base >9)
                {
                    System.out.println("Base should be between 2 and 9\n");
                    continue;
                }

            // Calling the converting function
            String output  =to_base(input, base);
            System.out.println("Number "+ input+ " in base "+ base +" = "+ output);
        }
    }
}
