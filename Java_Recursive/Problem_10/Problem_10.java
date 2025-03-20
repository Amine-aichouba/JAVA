

package JAVA.Java_Recursive.Problem_10 ;

public class Problem_10 
{
    public static int stringLength ( String str )
    {
        if ( str.isEmpty () )  return 0 ;
        return 1 + stringLength ( str.substring ( 1 ) ) ;
    }

    public static void main ( String[] args ) 
    {
        String str = "java problem 10" ;
        int length = stringLength ( str ) ;

        System.out.printf ( "\n\n * The length of the string ( %s ) is : %d " , str , length ) ;
        System.out.println ( "\n\n\n" ) ;
    }
}
