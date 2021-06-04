package example;

/*
Create a program that prompts for an input string and displays output that shows the
input string and the number of characters the string contains.


Example Output
What is the input string? Homer
Homer has 5 characters.

Constraints
Be sure the output contains the original string.
Use a single output statement to construct the output.
Use a built-in function of the programming language to determine the length of the string.
 */

import java.util.Scanner;

public class Number {


    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("What is the input string?");

        String Name = in.nextLine();

        print(howLong(Name), Name);
    }

    public static int howLong (String name) {
        return name.length();
    }

    public static void print (int howlong, String in) {
        System.out.println(in + " has " + howlong + " characters.");
    }

}

