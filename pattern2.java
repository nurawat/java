/*
1
2 3
3 4 5
4 5 6 7
*/

import java.io.*;
import java.util.Scanner;

class pattern2
{
  public static void main(String[] args)
  {
    int number,i,j,start,constant;
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the number of rows");
    number = sc.nextInt();

    System.out.println("....Pattern Printing Now......\n");
    // Using  ASCII method
    start = 1;
    for(i=0;i<5;i++)
    {
      System.out.println();
      constant = start;
      for(j=0;j<=i;j++)
      {
        System.out.print(constant + " ");
              constant++ ;
      }
      start ++;
    }
  }
}