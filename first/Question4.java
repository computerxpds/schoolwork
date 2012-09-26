
/**
 * Question3 assignment 3
 * @author Dakota Strickner (computerxpds)
 * @version 1
 */

import java.util.*;

public class Question4
{
    static Scanner console = new Scanner(System.in);
    
    public static void main(String[] args)
    {
        double firstnumber;
        double secondnumber;
        double thirdnumber;
        double fourthnumber;
        double fithnumber;
        
        System.out.println("Enter five decimals");
        firstnumber = console.nextDouble();
        secondnumber = console.nextDouble();
        thirdnumber = console.nextDouble();
        fourthnumber = console.nextDouble();
        fithnumber = console.nextDouble();
        
        System.out.println("First: " + (int)(firstnumber + .5));
        System.out.println("Second: " + (int)(secondnumber + .5));
        System.out.println("Third: " + (int)(thirdnumber + .5));
        System.out.println("Fourth: " + (int)(fourthnumber + .5));
        System.out.println("Fith: " + (int)(fithnumber + .5));
    }
}
        