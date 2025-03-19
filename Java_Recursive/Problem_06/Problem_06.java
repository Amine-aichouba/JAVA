

package JAVA.Java_Recursive.Problem_06 ;

public class Problem_06 
{
    public static String reverseString ( String str ) 
    {
        if ( str.isEmpty () || str.length () == 1 )  return str ;    
        return str.charAt ( str.length () - 1 ) + reverseString ( str.substring ( 0 , str.length () - 1 ) ) ;
    }
    
    public static void main ( String[] args ) 
    {
        String str = "hello world" ;
        
        System.out.println ( "\n\n * Original string : " + str ) ;
        System.out.println ( "\n * Reversed string : " + reverseString ( str ) ) ;
        System.out.print ( "\n\n\n" ) ;
    }
}
