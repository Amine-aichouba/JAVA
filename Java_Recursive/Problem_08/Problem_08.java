

package JAVA.Java_Recursive.Problem_08 ;

public class Problem_08 
{
    public static int countOccurrences ( int[] array , int item , int index ) 
    {
        if ( index >= array.length )  return 0 ;
        if ( array [index] == item )  return 1 + countOccurrences ( array , item , index + 1 ) ;
        return countOccurrences ( array , item , index + 1 ) ;
    }

    public static void main ( String[] args ) 
    {
        int[] arr = { 1 , 2 , 5 , 4 , 5 , 6 , 7 , 5 , 9 , 5 } ;    
        int item = 5 ;
        int occurrences = countOccurrences ( arr , item , 0 ) ;

        System.out.printf ( "\n\n * The number of occurrences of %d in the array is : %d " , item , occurrences ) ;
        System.out.println ( "\n\n\n" ) ;
    }
}
