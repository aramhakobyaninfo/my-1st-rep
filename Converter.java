/**
 * A simple program which uses the recursive method
 * to convert the numbers of a String into Integers,
 * as well as calculates the Sum and the Average.
 *
 * @author (Aram Hakobyan)
 * @version (Sep 24, 2018)
 */

import java.util.Scanner;

public class Converter
{
    // Declaring the Main method
    public static void main()
    {
        Scanner scan = new Scanner(System.in);// Initialise a scanner
        System.out.print(":: Welcome :: \nThis program ");
        System.out.print("converts String into Integer (only first 8 numbers will be processed)\n");
        System.out.print("\nPlease, provide 1st Input: ");
        String s = scan.nextLine();
        int maxLength = 8;// variable being used in length limitation
        String cutS = s.substring(0);// Declaring substring
        //Defining length limit as requested
        if (s.length() > maxLength)
        {
            cutS = s.substring(0, maxLength);
        }
        System.out.print("\t\t\tAccepted: ");
        System.out.println(recursive(cutS));
        int temp1 = (recursive(cutS));
        System.out.print("\nPlease, provide 2nd Input: ");
        s = scan.nextLine();
        cutS = s.substring(0);// Declaring substring
        //Defining length limit as requested
        if (s.length() > maxLength)
        {
            cutS = s.substring(0, maxLength);
        }
        System.out.print("\t\t\tAccepted: ");
        System.out.println(recursive(cutS));
        int temp2 = (recursive(cutS));
        System.out.print("\nPlease, provide 3rd Input: ");
        s = scan.nextLine();
        cutS = s.substring(0);// Declaring substring
        //Defining length limit as requested
        if (s.length() > maxLength)
        {
            cutS = s.substring(0, maxLength);
        }
        System.out.print("\t\t\tAccepted: ");
        System.out.println(recursive(cutS));
        int temp3 = (recursive(cutS));
        System.out.print("\nPlease, provide 4th Input: ");
        s = scan.nextLine();
        cutS = s.substring(0);
        // Declaring substring
        //Defining length limit as requested
        if (s.length() > maxLength)
        {
            cutS = s.substring(0, maxLength);
        }
        System.out.print("\t\t\tAccepted: ");
        System.out.println(recursive(cutS));
        int temp4 = (recursive(cutS));
        System.out.print("\nPlease, provide 5th Input: ");
        s = scan.nextLine();
        cutS = s.substring(0);
        // Declaring substring
        //Defining length limit as requested
        if (s.length() > maxLength)
        {
            cutS = s.substring(0, maxLength);
        }
        System.out.print("\t\t\tAccepted: ");
        System.out.println(recursive(cutS));
        int temp5 = (recursive(cutS));
        int temps = temp1+temp2+temp3+temp4+temp5;
        System.out.print("\nStrings' Sum: "+temps);
        int tempavg = temps/5;
        System.out.print("\nStrings' Average: "+tempavg+"\n::End::");
        //System.out.println(sum(cutS));
        //System.out.print("\t\t\tAverage: "+(avg(cutS)));
    }

    // Declaring the Recursive method
    public static int recursive(String cutS)
    {
        if (cutS.length() == 0)
        {
            return 0;
        }
        char cc = cutS.charAt(0);
        String r = cutS.substring(1);
        
        int factor = 1;
        for (int i=0; i<cutS.length()-1; i++)
        factor *= 10;
        
        factor = factor*(cc-'0');
        int s = factor+factor*(cc-'0');
        return factor+recursive(r);
    }
    /** Declaring Sum method
    public static int sum(String cutS)
    {
        // initialise instance variables
        int sum = -1;
        try
        {
            int n = Integer.parseInt(cutS);
            sum = 0;
            while(n != 0)
            {
                sum = sum + n % 10;
                n = n / 10;
            }
        }
        catch (NumberFormatException nfe)
        {
            System.out.println(nfe);
            System.out.println("Given string is not a number!");
        }
        return sum;
    }
    //Declaring Average method
    public static double avg(String cutS)
    {
        // initialise instance variables
        double avg = -1;
        int sum = -1;
        try
        {
            double temp;
            int n = Integer.parseInt(cutS);
            sum = 0;
            while(n != 0)
            {
                sum = sum + n % 10;
                n = n / 10;
                temp = sum / (cutS.length()-1);
                avg= sum / temp/2;
            }
        }
        catch (NumberFormatException nfe)
        {
            System.out.println(nfe);
            System.out.println("Given string is not a number!");
        }
        return avg;
    }*/
}

