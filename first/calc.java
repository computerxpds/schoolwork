
/**
 * Test
 * @version1
 */

import java.util.*;

public class calc
{

public static int add(int x, int y){ return x+y; }
public static double add(double x, double y){ return x+y; }

public static int subtract(int x, int y){ return x-y; } 
public static double subtract(double x, double y){ return x-y; }

public static int multiply(int x, int y){ return x*y; } 
public static double multiply(double x, double y){ return x*y; }

public static double divide(int x, int y){ 
try{ return x/y; } 
catch(ArithmeticException arithmeticException){ 
System.out.println("Cannot divide by zero");
System.exit(-1); 
} 
finally{ return x/y; } 
} 
public static double divide(double x, double y){ 
try{ return x/y; } 
catch(ArithmeticException arithmeticException){ 
System.out.println("Cannot divide by zero");
System.exit(-1); 
} 
finally{ return x/y; } 
}

public static void main(String args[]){ 
int x = 9; 
int y = 6;

System.out.printf("x=%d, y=%d\n", x, y); 
System.out.printf("x+y= %d\n", Calculator.add(x,y) ); 
System.out.printf("x-y= %d\n", Calculator.subtract(x,y) ); 
System.out.printf("x*y= %d\n", Calculator.multiply(x,y) ); 
System.out.printf("x/y= %.1f\n", Calculator.divide(x,y) ); 
System.out.print("x/0= "); 
System.out.print( Calculator.divide(x,0) ); 
} 
}
//Simple Output:
//x=9, y=6 
//x+y= 15 
//x-y= 3 
//x*y= 54 
//x/y= 1.0 
//x/0= Cannot divide by zero 