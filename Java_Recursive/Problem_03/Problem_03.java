

package JAVA.Java_Recursive.Problem_03 ;

public class Problem_03 
{
    public static int fibo ( int n ) 
    {
        if ( n == 0 )  return 0 ;
        if ( n == 1 )  return 1 ;
        return fibo ( n - 1 ) + fibo ( n - 2 ) ;
    }

    public static void main ( String[] args ) 
    {
        int num = 0 ;
        
        System.out.printf ( "\n\n * Fibo ( %d ) = %d " , num , fibo ( num ) ) ;    
        num = 3 ;
        System.out.printf ( "\n\n * Fibo ( %d ) = %d " , num , fibo ( num ) ) ; 
        num = 9 ;
        System.out.printf ( "\n\n * Fibo ( %d ) = %d " , num , fibo ( num ) ) ; 
        System.out.print ( "\n\n\n" ) ;    
    }
}
