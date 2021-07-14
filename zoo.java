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
    String s=sc.nextLine();
    int c=0;
    int n=0;
    for(int i=0;i<s.length();i++){
        if(s.substring(i,i+1).equals("z"))
        {
            c++;
        }
        else
        {
            n=i;
            break;
        }
    }
    int k=0;
    for(int j=n;j<s.length();j++)
    {
        if(s.substring(j,j+1).equals("o"))
        {
            k++;
        }
        else{
            k=0;
            break;
        }
    }
    if(k==(c*2) && (k+c)==s.length())
    {
        System.out.println("Yes");

    }
    else
    {
        System.out.println("No");
    }

    }
}
