

package JAVA.Java_Basic.Problem_10 ;

import java.util.Scanner ;
 
public class Problem_10 
{
    @SuppressWarnings ( "resource" )
    public static void main ( String[] args )  
    {
        Scanner input = new Scanner ( System.in ) ;
        
        int decimal , binary = 0 , place = 1 ;

        System.out.print ( "\n\n * Enter a Decimal Number : " ) ;
        decimal = input.nextInt () ;

        while ( decimal != 0 )
            {
                binary += ( decimal % 2 ) * place ;
                decimal /= 2 ;
                place *= 10 ; 
            }

        System.out.printf ( "\n * Binary number is : %d " , binary ) ;
        System.out.print ( "\n\n\n" ) ;
    }
}
