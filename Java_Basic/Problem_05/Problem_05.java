

package JAVA.Java_Basic.Problem_05 ;

import java.util.Scanner ;

public class Problem_05 
{
    @SuppressWarnings ( "resource" )
    public static void main ( String[] args ) 
    {
        Scanner input = new Scanner ( System.in ) ;
        int a , b ;

        System.out.printf ( "\n\n * Enter first number : " ) ;
        a = input.nextInt () ;

        System.out.printf ( "\n * Enter second number : " ) ;
        b = input.nextInt () ;

        System.out.printf ( "\n\n  %d × %d = %d  \n\n" , a , b , a*b ) ;    
    }
}
