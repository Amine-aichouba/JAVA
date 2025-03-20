

package JAVA.Java_Recursive.Problem_09 ;

public class Problem_09 
{
    public static int oddNumberSum ( int[] arr , int index )
    {
        if ( index >= arr.length )  return 0 ;
        if ( arr [index] % 2 == 1 ) return arr [index] + oddNumberSum ( arr , index + 1 ) ;
        return oddNumberSum ( arr , index + 1 ) ; 
    }

    public static void main ( String[] args )  
    {
        int[] arr = { 1 , 3 , 5 , 6 , 9 , 10 , 20 , 2 , 4 } ;     

        System.out.print ( "\n\n * The sum of all the odd numbers in the array is : " ) ;
        System.out.print ( oddNumberSum ( arr , 0 ) ) ;
        System.out.println ( "\n\n\n" ) ;
    }
}
