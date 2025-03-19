//17

package JAVA.Java_Basic ;

import java.util.Scanner ;

public class Problem_09 
{
    @SuppressWarnings ( "resource" )
    public static void main ( String[] args ) 
    {
        Scanner input = new Scanner ( System.in ) ;
        int first_num , second_num , i = 0 , remainder = 0 ;
        int[] sum = new int [20] ;

        System.out.print ( "\n\n * Enter first binary number : " ) ;
        first_num = input.nextInt () ;

        System.out.print ( "\n * Enter second binary number : " ) ;
        second_num = input.nextInt () ;

        while ( first_num != 0 || second_num != 0 ) 
            {
                sum [i ++] = ( int ) ( ( first_num % 10 + second_num % 10 + remainder ) % 2 ) ;
                remainder =  ( int ) ( ( first_num % 10 + second_num % 10 + remainder ) / 2 ) ;
                first_num = first_num / 10 ;
                second_num = second_num / 10 ;
            }
        
        if ( remainder != 0 )  sum [i ++] = remainder ;
        
        -- i ;

        System.out.print ( "\n\n * Sum of two binary numbers : " ) ;
        while ( i >= 0 ) System.out.print ( sum [i --] ) ;

        System.out.print ( "\n\n\n" ) ;
    }
}
