/* IMPORTANT: Multiple classes and nested static classes are supported */

/*
 * uncomment this if you want to read input.
//imports for BufferedReader
import java.io.BufferedReader;
import java.io.InputStreamReader;

//import for Scanner and other utility classes
import java.util.*;
*/

// Warning: Printing unwanted or ill-formatted data to output will cause the test cases to fail
import java.util.Scanner;
class TestClass {
    public static void main(String args[] ) throws Exception {
        /* Sample code to perform I/O:
         * Use either of these methods for input

        //BufferedReader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String name = br.readLine();                // Reading input from STDIN
        System.out.println("Hi, " + name + ".");    // Writing output to STDOUT

        //Scanner
        Scanner s = new Scanner(System.in);
        String name = s.nextLine();                 // Reading input from STDIN
        System.out.println("Hi, " + name + ".");    // Writing output to STDOUT

        */

        // Write your code here
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        if(str.charAt(2)=='A' || str.charAt(2)=='E'|| str.charAt(2)=='I'|| str.charAt(2)=='O'|| str.charAt(2)=='U'|| str.charAt(2)=='Y'){
            System.out.println("invalid");
        }
        else if((str.charAt(0)+str.charAt(1))%2==0 && (str.charAt(3)+str.charAt(4))%2==0 && (str.charAt(4)+str.charAt(5))%2==0 && (str.charAt(7)+str.charAt(8))%2==0)
        {
            System.out.println("valid");
        }
        else
        {
            System.out.println("invalid");
        }
        
    }
}
