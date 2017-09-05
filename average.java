// This programs calculates Sum of the numer provided by user and calculate Average for that
import java.io.*;
import java.util.Scanner;

class average
{
  public static int getSum(int number)
  {
    // This function calculates the Sum of the Digits

    int sum=0,mod_holder=0;
    while(number != 0)
    {
      mod_holder = number % 10;
      sum += mod_holder;
      number /= 10;
    }
    return sum;
  }

  public static int getDigits(int number)
  {
    // This function calculates the Sum of the Digits

    int no_of_digits=0;
    while(number != 0)
    {
      number /= 10;
      no_of_digits ++;
    }
    return no_of_digits;
  }

  public static void main(String[] args)
  {
    int input;
    //Creating Scanner Object
    Scanner s = new Scanner(System.in);
    System.out.print("Enter You Number :");
    input = s.nextInt();

    float avg = (float) getSum(input) /getDigits(input);
    System.out.println("Average of the Sum of Digits for " + input + " is " + avg);

  // OR
    System.out.println("Average of the Sum of Digits for " + input + " is " + (float) getSum(input) /getDigits(input));
  }
}