

package JAVA.Java_Basic.Problem_11 ;

import java.util.Scanner ;

public class Problem_11 
{
    @SuppressWarnings ( "resource" )
    public static void main ( String[] args ) 
    {
        Scanner input = new Scanner ( System.in ) ;
        
        int decimal , i = 0 ;
        char[] hexadecimal = new char [16] ;

        System.out.print ( "\n\n * Enter a Decimal Number : " ) ;
        decimal = input.nextInt () ;

        while ( decimal != 0 ) 
            {
                int remainder = decimal % 16 ;
                if ( remainder > 9 ) 
                    hexadecimal [i ++] = ( char ) ( remainder - 10 + 'A' ) ; 
                else 
                    hexadecimal [i ++] = ( char ) ( remainder + '0' ) ; 
            
                decimal /= 16 ;
            }

        System.out.printf ( "\n * Hexadecimal number is : " ) ;
        while ( i != 0 )  System.out.print ( hexadecimal [-- i] ) ;
    
        System.out.print ( "\n\n\n" ) ;
    }
}