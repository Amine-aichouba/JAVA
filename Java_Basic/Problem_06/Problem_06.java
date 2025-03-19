

package JAVA.Java_Basic.Problem_06 ;

import java.util.Scanner ;

public class Problem_06 
{
    @SuppressWarnings ( "resource" ) 
    public static void main ( String[] args ) 
    {
        Scanner input = new Scanner ( System.in ) ; 
        int x , y ;

        System.out.printf ( "\n\n * Enter first number : " ) ;
        x = input.nextInt () ;

        System.out.printf ( "\n * Enter second number : " ) ;
        y = input.nextInt () ;

        System.out.printf ( "\n\n • %d + %d = %d " , x , y , x + y ) ;
        System.out.printf ( "\n\n • %d - %d = %d " , x , y , x - y ) ;
        System.out.printf ( "\n\n • %d × %d = %d " , x , y , x * y ) ;
        System.out.printf ( "\n\n • %d / %d = %d " , x , y , x / y ) ;
        System.out.printf ( "\n\n • %d %% %d = %d" , x , y , x % y ) ;
        System.out.print ( "\n\n\n" ) ;
    }
    
}
