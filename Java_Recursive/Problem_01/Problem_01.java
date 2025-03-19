

package JAVA.Java_Recursive.Problem_01 ;

public class Problem_01 
{
    public static int factorial ( int n )
    {
        if ( n == 0 )  return 1 ;
        return n * factorial ( n - 1 ) ;
    }

    public static void main ( String[] args ) 
    {
        int num = 3 ;
        
        System.out.printf ( "\n\n * Factorial ( %d ) = %d " , num , factorial ( num ) ) ;    
        num = 5 ;
        System.out.printf ( "\n\n * Factorial ( %d ) = %d " , num , factorial ( num ) ) ; 
        System.out.print ( "\n\n\n" ) ;
    }
}
