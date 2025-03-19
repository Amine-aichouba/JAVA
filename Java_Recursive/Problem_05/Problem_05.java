

package JAVA.Java_Recursive.Problem_05 ;

public class Problem_05 
{
    public static int power ( int base , int exponent )
    {
        if ( exponent == 0 ) return 1 ;
        return base * power ( base , exponent - 1 ) ;
    }
    public static void main ( String[] args ) 
    {
        int base = 5 ;
        int exponent = 2 ;
        int result = power ( base , exponent ) ;

        System.out.printf ( "\n\n Power ( %d , %d ) = %d " , base , exponent , result ) ;
        System.out.print ( "\n\n\n" ) ;
    }
}
