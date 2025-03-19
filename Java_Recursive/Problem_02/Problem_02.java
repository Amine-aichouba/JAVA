

package JAVA.Java_Recursive.Problem_02 ;

public class Problem_02 
{
    public static int calculateSum ( int n )
    {
        if ( n == 0 ) return 0 ;
        return n + calculateSum ( n - 1 ) ;
    }

    public static void main ( String[] args ) 
    {
        int num = 10 ;
        
        System.out.printf ( "\n\n * Sum ( %d ) = %d " , num , calculateSum ( num ) ) ;    
        num = 15 ;
        System.out.printf ( "\n\n * Sum ( %d ) = %d " , num , calculateSum ( num ) ) ; 
        System.out.print ( "\n\n\n" ) ;    
    }
}
