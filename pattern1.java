/* Creates the Following Pattern
E E E E
D D D D
C C C C
B B B B
A A A A
*/
import java.io.*;
import java.util.Scanner;

class pattern1
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the number to start (E = 5 , F=6):");
    int number = sc.nextInt();

    System.out.println("....Pattern Printing Now......\n");
// Using  ASCII method 
    int constant = 64 + number;
    for(int i=0;i<5;i++)
    {
      System.out.println();

      for(int j=0;j<5;j++)
      {
        System.out.print((char) constant + " ");
      }
      constant-- ;
    }
  }
}