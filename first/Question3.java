
/**
 * Question3 assignment 3
 * @author Dakota Strickner (computerxpds)
 * @version 1
 */

import java.util.*;

public class Question3
{
    static Scanner console = new Scanner(System.in);
    
    public static void main(String[] args)
    {
        int firstnumber;
        int secondnumber;
        
        System.out.println("Enter length and width: ");
        firstnumber = console.nextInt();
        secondnumber = console.nextInt();
        
        System.out.println("Area: " + (firstnumber * secondnumber));
        System.out.println("Width: " + (firstnumber + secondnumber + firstnumber + secondnumber));
    }
}