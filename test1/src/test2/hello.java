/*
 * Simple test code created by Vasant Bhardwaj.
 * Asks user for two inputs, then uses said inputs to create third variable.
 * Scans all variables for values greter than 10, and returns answers based 
 * on the variable values.
 */
package test2;

import java.util.Scanner;

public class hello {
	public static void main(String[] args) {
		
		//Scans UI to get first input, sets it equal to an integer VB//
		Scanner number = new Scanner( System.in );
		System.out.println("Gimme a number (*w*) \n");
		String numget;
        numget = number.nextLine();
        int mynumber = Integer.parseInt(numget);
        
        //Scans UI to get second input, sets it equal to an integer VB//
        System.out.println("Gimme another one (*w*) \n");
        String num2get;
        num2get = number.nextLine();
        int mynumber2 = Integer.parseInt(num2get);
        number.close();
        
        //Creates third integer equal to sum of first two integers
        int mynumber3 = mynumber + mynumber2;
        
        /*
         * System created to scan all integers, and figure out which integers are greater than 10. 
         * Based on which numbers are greater than 10, different results will be returned. VB
         */
        
        if (mynumber >= 10 && mynumber3 >= 10 && mynumber2 < 10) {
        	System.out.println("Calculating results... please wait ...");
        	System.out.println(mynumber);
        	System.out.println("it's greater than ten (^-^)");
        	System.out.println(mynumber2);
        	System.out.println(mynumber3);
        	System.out.println("it's also greater than ten \\(^o^)/");
        }
        
        else if (mynumber2 >= 10 && mynumber3 >= 10 && mynumber < 10) {
        	System.out.println("Calculating results... please wait ...");
        	System.out.println(mynumber);
        	System.out.println(mynumber2);
        	System.out.println("it's greater than ten (^-^)");
        	System.out.println(mynumber3);
        	System.out.println("it's also greater than ten \\(^o^)/");
        }
        
        else if (mynumber2 < 10 && mynumber3 >= 10 && mynumber < 10) {
        	System.out.println("Calculating results... please wait ...");
        	System.out.println(mynumber);
        	System.out.println(mynumber2);
        	System.out.println(mynumber3);
        	System.out.println("Your numbers make a number greater than ten |(^o^)|");
        }
        
        else if (mynumber >= 10 && mynumber2 >= 10 && mynumber3 >= mynumber+ 10) {
        	System.out.println("Calculating results... please wait ...");
        	System.out.println(mynumber);
        	System.out.println("it's greater than ten (^-^)");
        	System.out.println(mynumber2);
        	System.out.println("it's also greater than ten \\(^o^)/");
        	System.out.println(mynumber3);
        	System.out.println("SO THIS IS GREATER THAN TEN TOOOOOOO!!");
        }
        
        else if(mynumber < 10 && mynumber2 <10 && mynumber3 <10) {
        	System.out.println("Calculating results... please wait ...");
        	System.out.println(mynumber);
        	System.out.println(mynumber2);
        	System.out.println(mynumber3);
        	System.out.println("none of these are greater than ten (*o*)");
        }
        	
    }
}
