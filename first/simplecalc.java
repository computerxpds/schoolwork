
/**
 * A simple java calculator.
 * @author Dakota Strickner (computerxpds)
 * @version 1
 * @build 1
 * This very arcain and simple calculator will be able to do 2 variable operations. 
 */
//import
import java.util.*;
//define class
public class simplecalc
{

    static Scanner console = new Scanner(System.in);
    //main string
    public static void main(String[] args)
    {
        //variables
        int firstnumber;
        int secondnumber;
        //int multiply;
        //int divide;
        //int subtract;
        //int add;
        
        //prints the line
        System.out.println("Input your variables below:");
        //inputs from console
        firstnumber = console.nextInt();
        secondnumber = console.nextInt();
        //output and math operation
        System.out.println("Result: " + (firstnumber + secondnumber));
    }
}
        