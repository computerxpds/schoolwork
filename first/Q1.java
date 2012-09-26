
/**
 * Question1 Assignment 3 continued
 * @author Dakota Strickner (computerxpds)
 * @version 1
 */

import java.util.*;

public class Q1
{

    static Scanner console = new Scanner(System.in);
    
    public static void main(String[] args)
    {
        int time;
        int x;
        int y;
        int z;
        
        System.out.println("Input elapsed time:");
        
        time = console.nextInt();
        
        x = time/3600;
        y = ((time%3600)/60);
        z = ((time%3600) % 60);
        
        System.out.println(x + ":" + y + ":" + z);
    }
}