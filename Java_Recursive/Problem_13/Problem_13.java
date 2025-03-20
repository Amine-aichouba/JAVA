

package JAVA.Java_Recursive.Problem_13 ;

public class Problem_13 
{
    public static int digitSum ( int number )
    {
        if ( number == 0 )  return 0 ;
        return ( number % 10 ) + digitSum ( number / 10 ) ;
    }

    public static void main ( String[] args )  
    {
        int number = 12345 ;
        int s = digitSum ( number ) ;
        
        System.out.print ( "\n\n * The sum of the digits of ( " + number + " ) is : " + s ) ;
        System.out.println ( "\n\n\n" ) ;
    }
}
