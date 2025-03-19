//07

package JAVA.Java_Basic ;

import java.util.Scanner ;

public class Problem_07 
{
    @SuppressWarnings ( "resource" )
    public static void main ( String[] args ) 
    {
        Scanner input = new Scanner ( System.in ) ;
        int x ;

        System.out.print ( "\n\n * Enter a number : " ) ;
        x = input.nextInt () ;

        for ( int i = 1 ; i <= 10 ; i ++ )
            System.out.printf ( "\n\n • %d × %d = %d " , x , i , x * i ) ;    
            
        System.out.println ( "\n\n\n" ) ;
    }
}
