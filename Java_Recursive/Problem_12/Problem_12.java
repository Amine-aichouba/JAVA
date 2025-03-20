

package JAVA.Java_Recursive.Problem_12 ;

public class Problem_12 
{
    public static int productNumArr ( int[] arr , int index )
    {
        if ( index >= arr.length ) return 1 ;
        return arr [index] * productNumArr ( arr , index + 1 ) ;
    }    

    public static void main ( String[] args ) 
    {
        int[] arr = { 1 , 4 , 5 } ;    

        System.out.print ( "\n\n * The product of all numbers in an array : " ) ;
        System.out.print ( productNumArr ( arr , 0 ) ) ;
        System.out.println ( "\n\n\n" ) ;
    }
}

