//
// This programs prints Alphabets using Star(* ) First it takes an Input
// From the User Like
//
// @example:
// Enter the alphabet You need Pattern of : AaAa
// Printing A:
// * * * * * 
// *    * 
// * * * * * 
// *    * 
// *    * 
//
// Done !!!
// Want to print more (y/n):n
// System Exiting !!!
// @ Classes used: java.io.* 
//                 java.util.Scanner

import java.io.* ;
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
        System.out.println("\nPrinting Character "+ pattern.charAt(string_loop)+" : ");
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
                  System.out.print("* ");
                }
                else
                  System.out.print("  ");
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
                  System.out.print("* ");
                }
                else
                  System.out.print("  ");
              }
            }
        break;

        case 'C':
            for(i=0;i<5;i++)
            {
              System.out.println();
              for(j=0;j<5;j++)
              {
                if(i==0 || i==4 || j==0)
                {
                  System.out.print("* ");
                }
                else
                  System.out.print("  ");
              }
            }
        break;

        case 'D':
            for(i=0;i<5;i++)
            {
              System.out.println();
              for(j=0;j<5;j++)
              {
                if(i==0 || i==4 || j==4 || j==1)
                {
                  System.out.print("* ");
                }
                else
                  System.out.print("  ");
              }
            }
        break;

        case 'E':
            for(i=0;i<5;i++)
            {
              System.out.println();
              for(j=0;j<5;j++)
              {
                if(i==0 || i==4 || j==0 || i==(height/2))
                {
                  System.out.print("* ");
                }
                else
                  System.out.print("  ");
              }
            }
        break;

        case 'F':
            for(i=0;i<5;i++)
            {
              System.out.println();
              for(j=0;j<5;j++)
              {
                if(i==0 || j==0 || i==(height/2))
                {
                  System.out.print("* ");
                }
                else
                  System.out.print("  ");
              }
            }
        break;

        case 'G':
            for(i=0;i<5;i++)
            {
              System.out.println();
              for(j=0;j<5;j++)
              {
                if(i==0 || j==0 || i==(height/2) || i==4 || (j==4 && i>height/2))
                {
                  System.out.print("* ");
                }
                else
                  System.out.print("  ");
              }
            }
        break;

        case 'H':
            for(i=0;i<5;i++)
            {
              System.out.println();
              for(j=0;j<5;j++)
              {
                if(j==4 || j==0 || i==(height/2))
                {
                  System.out.print("* ");
                }
                else
                  System.out.print("  ");
              }
            }
        break;

        case 'I':
            for(i=0;i<5;i++)
            {
              System.out.println();
              for(j=0;j<5;j++)
              {
                if(i==0 || i==4 || j==(height/2))
                {
                  System.out.print("* ");
                }
                else
                  System.out.print("  ");
              }
            }
        break;

        case 'J':
            for(i=0;i<5;i++)
            {
              System.out.println();
              for(j=0;j<5;j++)
              {
                if(i==0 || (i==4 && j<height/2) || j==(height/2) )
                {
                  System.out.print("* ");
                }
                else
                  System.out.print("  ");
              }
            }
        break;

        case 'K':
            for(i=0;i<5;i++)
            {
              System.out.println();
              for(j=0;j<5;j++)
              {
                if(j==height/2 || (i==(height-1-j) && i<=height/2) || (i==j && j>=height/2) )
                {
                  System.out.print("* ");
                }
                else
                  System.out.print("  ");
              }
            }
        break;

        case 'L':
            for(i=0;i<5;i++)
            {
              System.out.println();
              for(j=0;j<5;j++)
              {
                if(j==0 || i==4)
                {
                  System.out.print("* ");
                }
                else
                  System.out.print("  ");
              }
            }
        break;

        case 'M':
            for(i=0;i<5;i++)
            {
              System.out.println();
              for(j=0;j<5;j++)
              {
                if(j==0 || j==4 || i== 0 || j == height/2)
                {
                  System.out.print("* ");
                }
                else
                  System.out.print("  ");
              }
            }
        break;

        case 'N':
            for(i=0;i<5;i++)
            {
              System.out.println();
              for(j=0;j<5;j++)
              {
                if(j==0 || j==4 || (i==j))
                {
                  System.out.print("* ");
                }
                else
                  System.out.print("  ");
              }
            }
        break;

        case 'O':
            for(i=0;i<5;i++)
            {
              System.out.println();
              for(j=0;j<5;j++)
              {
                if(j==0 || j==4 || i==0 || i==4)
                {
                  System.out.print("* ");
                }
                else
                  System.out.print("  ");
              }
            }
        break;

        case 'P':
            for(i=0;i<5;i++)
            {
              System.out.println();
              for(j=0;j<5;j++)
              {
                if(j==0 || i==height/2 || i==0 || (j==4 && i<height/2))
                {
                  System.out.print("* ");
                }
                else
                  System.out.print("  ");
              }
            }
        break;

        case 'Q':
            for(i=0;i<5;i++)
            {
              System.out.println();
              for(j=0;j<5;j++)
              {
                if(i==0 || j==0 || i==4 || j==4 || (i==j && i>height/2))
                {
                  System.out.print("* ");
                }
                else
                  System.out.print("  ");
              }
            }
            System.out.print(" * ");
        break;

        case 'R':
            for(i=0;i<5;i++)
            {
              System.out.println();
              for(j=0;j<5;j++)
              {
                if(i==0 || j==0 || (j==4 && i<height/2) || (i==j && i>=height/2))
                {
                  System.out.print("* ");
                }
                else
                  System.out.print("  ");
              }
            }
        break;

        case 'S':
            for(i=0;i<5;i++)
            {
              System.out.println();
              for(j=0;j<5;j++)
              {
                if(i==0 || i==4 || (j==0 && i<height/2) || i==height/2 || (j==4 && i> height/2))
                {
                  System.out.print("* ");
                }
                else
                  System.out.print("  ");
              }
            }
        break;

        case 'T':
            for(i=0;i<5;i++)
            {
              System.out.println();
              for(j=0;j<5;j++)
              {
                if(i==0 || j==height/2)
                {
                  System.out.print("* ");
                }
                else
                  System.out.print("  ");
              }
            }
        break;

        case 'U':
            for(i=0;i<5;i++)
            {
              System.out.println();
              for(j=0;j<5;j++)
              {
                if(j==0 || j==4 || i==4)
                {
                  System.out.print("* ");
                }
                else
                  System.out.print("  ");
              }
            }
        break;

        case 'V':
            for(i=0;i<5;i++)
            {
              System.out.println();
              for(j=0;j<5;j++)
              {
                if((j==1 && i!=4) || (j==3 && i!=4) || (i==4 && j==height/2))
                {
                  System.out.print("* ");
                }
                else
                  System.out.print("  ");
              }
            }
        break;

        case 'W':
            for(i=0;i<5;i++)
            {
              System.out.println();
              for(j=0;j<5;j++)
              {
                if(j==0 || j==4 || j==height/2 || i==4)
                {
                  System.out.print("* ");
                }
                else
                  System.out.print("  ");
              }
            }
        break;


        case 'X':
            for(i=0;i<5;i++)
            {
              System.out.println();
              for(j=0;j<5;j++)
              {
                if(i==j || (i==((height-1)-j)))
                {
                  System.out.print("* ");
                }
                else
                  System.out.print("  ");
              }
            }
        break;

        case 'Y':
            for(i=0;i<5;i++)
            {
              System.out.println();
              for(j=0;j<5;j++)
              {
                if( (i==j && i<=height/2) || (i==((height-1)-j) && i<=height/2) || (j==height/2 && i>=height/2))
                {
                  System.out.print("* ");
                }
                else
                  System.out.print("  ");
              }
            }
        break;

        case 'Z':
            for(i=0;i<5;i++)
            {
              System.out.println();
              for(j=0;j<5;j++)
              {
                if(i==0 || i==4 || (i==(height-1)-j))
                {
                  System.out.print("* ");
                }
                else
                  System.out.print("  ");
              }
            }
        break;

        default: System.out.println("Something Went Wrong");
        }
      }
      System.out.println("Want to Do it Again (y/n) :");
      choice = s.next().charAt(0);
    }while(choice=='y' || choice=='Y');
    // System.out.print("System Exiting !!!");
  }
}