

package JAVA.Java_Recursive.Problem_11 ;

public class Problem_11 
{
    public static int maximum ( int[] arr , int index , int max )
    {
        if ( index >= arr.length ) return max ;
        if ( max < arr [index] )  return maximum ( arr , index + 1 , arr [index] ) ;
        return maximum ( arr , index + 1 , max ) ;
    }    

    public static void main ( String[] args ) 
    {
        int[] arr = { 1 , 4 , 5 , 6 , 7 , 8 , 9 , 10 , 11 , 12 , 13 } ;    
        // -0x7fffffff == INT_MIN == -2147483647  
        System.out.printf ( "\n\n * Maximum : %d " , maximum ( arr , 0 , -0x7fffffff ) ) ;  
        System.out.println ( "\n\n\n" ) ;
    }
}
