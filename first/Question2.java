
/**
 * Question2 assignment 3
 * @author Dakota Strickner (computerxpds)
 * @version 1
 */

import java.util.*;

public class Question2
{
    static Scanner console = new Scanner(System.in);
    
    public static void main(String[] args)
    {
        int firstnumber;
        int secondnumber;
        int thirdnumber;
        int fourthnumber;
        int fithnumber;
        
        System.out.println("Enter scores.");
        firstnumber = console.nextInt();
        secondnumber = console.nextInt();
        thirdnumber = console.nextInt();
        fourthnumber = console.nextInt();
        fithnumber = console.nextInt();
        
        System.out.println("Average is: " + ( ( firstnumber + secondnumber + thirdnumber + fourthnumber + fithnumber ) / 5 ));
    }
}
        