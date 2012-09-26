
/**
 * Demo1 class demo
 * 
 * @author Dakota Strickner (computerxpds)
 * @version 1
 */

import java.util.*;

public class Demo1
{
    static Scanner console = new Scanner(System.in);
    
    public static void main(String[] args)
    {
        int firstnumber;
        int secondnumber;
        
        System.out.println("Enter a number!");
        firstnumber = console.nextInt();
        secondnumber= console.nextInt();
        
        System.out.println("The user entered the number " + firstnumber);
        System.out.println("The user entered the number " + secondnumber);
    }
}