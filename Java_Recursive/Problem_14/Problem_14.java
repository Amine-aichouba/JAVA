

package JAVA.Java_Recursive.Problem_14 ;

public class Problem_14 
{
    public static boolean isSorted ( int[] arr )
    {
        return isSorted ( arr , 0 ) ;
    }
    public static boolean isSorted ( int[] arr , int index )
    {
        if ( index >= arr.length - 1 )  return true ;
        if ( arr [index] > arr [index + 1] ) return false ;
        return isSorted ( arr , index + 1 ) ;
    }

    public static void main ( String[] args ) 
    {
        int[] arr = { 1 , 2 , 3 , 9 , 5 , 6 , 7 } ;
        if ( isSorted ( arr ) )  
            System.out.print ( "\n\n * The array has been sorted " ) ;
        else 
            System.out.print ( "\n\n * The array is not sorted. " ) ;
        System.out.println ( "\n\n\n" ) ;
    }
}
