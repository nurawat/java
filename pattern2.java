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
    /* We are taking the starting  point of each line i.e 1,2,3,4 and putting it in a varible start and then adding +1 to the variable for particular row */

    int number,i,j,start,constant;
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the number of rows");
    number = sc.nextInt();

    System.out.println("....Pattern Printing Now......\n");
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