//
// This programs prints Alphabets using Star(*) First it takes an Input
// From the User Like
//
// @example:
// Enter the alphabet You need Pattern of : A
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

class pattern3
{
  public static void main(String[] args)
  {
    int i,j,height=5;
    System.out.println("Pring Pattern A");

    for(i=0;i<5;i++)
    {
      System.out.println();
      for(j=0;j<5;j++)
      {
        if(j==0 || j==(height-1) || i==0 || (i==height/2))
        {
          System.out.print("*");
        }
        else
        {
          System.out.print(" ");
        }
      }
    }
  }
}