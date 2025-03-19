

package JAVA.Java_Recursive.Problem_04 ;

public class Problem_04 
{
        public static boolean isPalindrome ( String str ) 
        {
            if ( str.length () <= 1 )  return true ;
            if ( str.charAt (0) != str.charAt ( str.length () - 1 ) ) return false ;
            
            return isPalindrome ( str.substring ( 1 , str.length () - 1 ) ) ;
        }
    
        public static void main ( String[] args )  
        {
            String str = "kokok" ;
            if ( isPalindrome ( str ) ) 
                System.out.printf ( "\n\n \"%s\" is a palindrome." , str ) ;
            else 
                System.out.printf ( "\n\n \"%s\" is not a palindrome." , str ) ;
            System.out.print ( "\n\n\n" ) ;   
        }
}
