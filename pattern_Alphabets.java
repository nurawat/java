//
// This programs prints Alphabets using Star(*) First it takes an Input
// From the User Like
//
// @example:
// Enter the alphabet You need Pattern of : AaAa
// Printing A:
// *****
// *   *
// *****
// *   *
// *   *
//
// Done !!!
// Want to print more (y/n):n
// System Exiting !!!
// @ Classes used: java.io.*
//                 java.util.Scanner

import java.io.*;
import java.util.Scanner;

class pattern_Alphabets
{
  public static void main(String[] args)
  {
    Scanner s = new Scanner(System.in);
    int i,j,height=5,string_loop;
    char choice='n';
    String pattern;
    do
    {
      System.out.print("Enter the alphabet You need Pattern of :");
      pattern = s.next();

      System.out.println("Printing Pattern "+ pattern);

      for(string_loop=0;string_loop<pattern.length();string_loop++)
      {
        switch(pattern.toUpperCase().charAt(string_loop))
        {
          case 'A':
            for(i=0;i<5;i++)
            {
              System.out.println();
              for(j=0;j<5;j++)
              {
                if(i==0 || j==4 || j==0 || i==(height/2))
                {
                  System.out.print("*");
                }
                else
                  System.out.print(" ");
              }
            }
        break;
        case 'B':
          for(i=0;i<5;i++)
            {
              System.out.println();
              for(j=0;j<5;j++)
              {
                if(i==0 || i==4 || j==4 || j==0 || i==(height/2))
                {
                  System.out.print("*");
                }
                else
                  System.out.print(" ");
              }
            }
        break;
          default: System.out.println("Something Went Wrong");
        }
      }
      // System.out.print("Want to Do it Again");
      // choice = s.next().charAt(0);
    }while(choice=='y' || choice=='Y');
    System.out.print("System Exiting !!!");
  }
}