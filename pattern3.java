/*
Printing alphabet A
*/

import java.io.*;
import java.util.Scanner;

class pattern3
{
  public static void main(String[] args)
  {
    int i,j,spaces=0,k;
    System.out.println("Printing Pattern Initiation. :)");

    int h=5;

    for (i=1;i<=h;i++ )
    {
      System.out.println("");
      for ( j=1;j<=h-i;j++ )
      {
         System.out.print(" ");
      }
      for ( k=1;k<=i*2-1;k++ )
      {
         System.out.print("*");
      }
    }
  }
}