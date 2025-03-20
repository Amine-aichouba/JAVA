

package JAVA.Java_Recursive.Problem_07 ;

public class Problem_07 
{
    public static int gcd ( int first_num , int second_num )
    {
        if ( second_num == 0 )  return first_num ;
        return gcd ( second_num , first_num % second_num ) ;
    }

    public static void main ( String[] args ) 
    {
        int x = 18 , y = 16 ; 

        System.out.printf ( "\n\n * GCD ( %d , %d ) = %d " , x , y , gcd ( x , y ) ) ;
        System.out.print ( "\n\n\n" ) ;
    }
}
