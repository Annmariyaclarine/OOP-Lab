package s2java;

import java.util.*;
public class ArrayListExp {
    public static void main ( String args[ ] ) {
        ArrayList<String>list=new ArrayList<String>( ); // Creating array list
            list.add(" Tom" ) ; // Adding o b j e c t in a r r a y l i s t  
            list.add("Dick" ) ;
            list.add("Harry") ;
            list.add(" John" ) ;
            list.add(" Henry" ) ;
            // Printing the array list object
            System.out.println(list) ;
            System.out.println(" Returning element :"+list.get( 2 )) ; // it will return the 2nd element
            list.set( 2 ," Potter " ) ;// changing the element
            // Traversing list
            System.out.println ( " List after insertion of : newly inserted " ) ;
            for ( String word : list )
                  System.out.println( word ) ;
            // Sorting the list
             Collections.sort(list) ;
            // Traversing list using for loop
            System.out.println(" \nSorted list : " ) ;
            for(String word :list )
            System.out.println( word ) ;
     }
}