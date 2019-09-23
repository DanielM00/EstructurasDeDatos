/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cadenitas;

/**
 *
 * @author jortizsi
 */
import java.util.*;
import java.util.LinkedList;

import java.util.Iterator;




/*
 _______  ______    _______  _______  _______  ___   _______  __    _    ______   _______    ___      ___   _______  _______  _______  _______                                                   
|       ||    _ |  |       ||   _   ||       ||   | |       ||  |  | |  |      | |       |  |   |    |   | |       ||       ||   _   ||       |                                                  
|       ||   | ||  |    ___||  |_|  ||       ||   | |   _   ||   |_| |  |  _    ||    ___|  |   |    |   | |  _____||_     _||  |_|  ||  _____|                                                  
|       ||   |_||_ |   |___ |       ||       ||   | |  | |  ||       |  | | |   ||   |___   |   |    |   | | |_____   |   |  |       || |_____                                                   
|      _||    __  ||    ___||       ||      _||   | |  |_|  ||  _    |  | |_|   ||    ___|  |   |___ |   | |_____  |  |   |  |       ||_____  |                                                  
|     |_ |   |  | ||   |___ |   _   ||     |_ |   | |       || | |   |  |       ||   |___   |       ||   |  _____| |  |   |  |   _   | _____| |                                                  
|_______||___|  |_||_______||__| |__||_______||___| |_______||_|  |__|  |______| |_______|  |_______||___| |_______|  |___|  |__| |__||_______|     




                 _______  _______  __   __  ___     _______  _______    __   __  _______  _______  ______    _______  __    _    ___      _______  _______                                       
                |   _   ||       ||  | |  ||   |   |       ||       |  |  | |  ||       ||   _   ||    _ |  |       ||  |  | |  |   |    |   _   ||       |                                      
   ____   ____  |  |_|  ||   _   ||  | |  ||   |   |  _____||    ___|  |  | |  ||  _____||  |_|  ||   | ||  |   _   ||   |_| |  |   |    |  |_|  ||  _____|                                      
  |____| |____| |       ||  | |  ||  |_|  ||   |   | |_____ |   |___   |  |_|  || |_____ |       ||   |_||_ |  | |  ||       |  |   |    |       || |_____                                       
                |       ||  |_|  ||       ||   |   |_____  ||    ___|  |       ||_____  ||       ||    __  ||  |_|  ||  _    |  |   |___ |       ||_____  |                                      
                |   _   ||      | |       ||   |    _____| ||   |___   |       | _____| ||   _   ||   |  | ||       || | |   |  |       ||   _   | _____| |                                      
                |__| |__||____||_||_______||___|   |_______||_______|  |_______||_______||__| |__||___|  |_||_______||_|  |__|  |_______||__| |__||_______|                                      
 _______  _______  _______  ______    __   __  _______  _______  __   __  ______    _______  _______    __   __  _______  _______  _______  ______    _______  ______   _______  _______         
|       ||       ||       ||    _ |  |  | |  ||       ||       ||  | |  ||    _ |  |   _   ||       |  |  |_|  ||       ||       ||       ||    _ |  |   _   ||      | |   _   ||       |        
|    ___||  _____||_     _||   | ||  |  | |  ||       ||_     _||  | |  ||   | ||  |  |_|  ||  _____|  |       ||   _   ||  _____||_     _||   | ||  |  |_|  ||  _    ||  |_|  ||  _____|        
|   |___ | |_____   |   |  |   |_||_ |  |_|  ||       |  |   |  |  |_|  ||   |_||_ |       || |_____   |       ||  | |  || |_____   |   |  |   |_||_ |       || | |   ||       || |_____         
|    ___||_____  |  |   |  |    __  ||       ||      _|  |   |  |       ||    __  ||       ||_____  |  |       ||  |_|  ||_____  |  |   |  |    __  ||       || |_|   ||       ||_____  |        
|   |___  _____| |  |   |  |   |  | ||       ||     |_   |   |  |       ||   |  | ||   _   | _____| |  | ||_|| ||       | _____| |  |   |  |   |  | ||   _   ||       ||   _   | _____| |        
|_______||_______|  |___|  |___|  |_||_______||_______|  |___|  |_______||___|  |_||__| |__||_______|  |_|   |_||_______||_______|  |___|  |___|  |_||__| |__||______| |__| |__||_______|  




   _______  __    _    _______  ___      _______  _______  _______    __   __    ______   ___   _______  _______  _______  __    _  ___   _______  ___      _______  _______    _______  __    _ 
  |       ||  |  | |  |       ||   |    |   _   ||       ||       |  |  | |  |  |      | |   | |       ||       ||       ||  |  | ||   | |  _    ||   |    |       ||       |  |       ||  |  | |
  |    ___||   |_| |  |       ||   |    |  |_|  ||  _____||    ___|  |  |_|  |  |  _    ||   | |  _____||    _  ||   _   ||   |_| ||   | | |_|   ||   |    |    ___||  _____|  |    ___||   |_| |
  |   |___ |       |  |       ||   |    |       || |_____ |   |___   |       |  | | |   ||   | | |_____ |   |_| ||  | |  ||       ||   | |       ||   |    |   |___ | |_____   |   |___ |       |
  |    ___||  _    |  |      _||   |___ |       ||_____  ||    ___|  |_     _|  | |_|   ||   | |_____  ||    ___||  |_|  ||  _    ||   | |  _   | |   |___ |    ___||_____  |  |    ___||  _    |
  |   |___ | | |   |  |     |_ |       ||   _   | _____| ||   |___     |   |    |       ||   |  _____| ||   |    |       || | |   ||   | | |_|   ||       ||   |___  _____| |  |   |___ | | |   |
  |_______||_|  |__|  |_______||_______||__| |__||_______||_______|    |___|    |______| |___| |_______||___|    |_______||_|  |__||___| |_______||_______||_______||_______|  |_______||_|  |__|
   __   __  _______  _______  ______   ___      _______            ______   _______  ______   _______    _______  __   __  _______    _______  _______  __    _                                  
  |  |_|  ||       ||       ||      | |   |    |       |          |      | |   _   ||      | |       |  |       ||  | |  ||       |  |       ||       ||  |  | |                                 
  |       ||   _   ||   _   ||  _    ||   |    |    ___|          |  _    ||  |_|  ||  _    ||   _   |  |   _   ||  | |  ||    ___|  |  _____||   _   ||   |_| |                                 
  |       ||  | |  ||  | |  || | |   ||   |    |   |___           | | |   ||       || | |   ||  | |  |  |  | |  ||  |_|  ||   |___   | |_____ |  | |  ||       |                                 
  |       ||  |_|  ||  |_|  || |_|   ||   |___ |    ___|   ___    | |_|   ||       || |_|   ||  |_|  |  |  |_|  ||       ||    ___|  |_____  ||  |_|  ||  _    |                                 
  | ||_|| ||       ||       ||       ||       ||   |___   |_  |   |       ||   _   ||       ||       |  |      | |       ||   |___    _____| ||       || | |   |                                 
  |_|   |_||_______||_______||______| |_______||_______|    |_|   |______| |__| |__||______| |_______|  |____||_||_______||_______|  |_______||_______||_|  |__|          




 _______  _______  __    _  _______  ______    ___   _______  _______  _______    _______  _______  __    _    ______   _______    _______  _______  _______  ___   ___                          
|       ||       ||  |  | ||       ||    _ |  |   | |       ||   _   ||       |  |       ||       ||  |  | |  |      | |       |  |       ||   _   ||       ||   | |   |                         
|    ___||    ___||   |_| ||    ___||   | ||  |   | |       ||  |_|  ||  _____|  |  _____||   _   ||   |_| |  |  _    ||    ___|  |    ___||  |_|  ||       ||   | |   |                         
|   | __ |   |___ |       ||   |___ |   |_||_ |   | |       ||       || |_____   | |_____ |  | |  ||       |  | | |   ||   |___   |   |___ |       ||       ||   | |   |                         
|   ||  ||    ___||  _    ||    ___||    __  ||   | |      _||       ||_____  |  |_____  ||  |_|  ||  _    |  | |_|   ||    ___|  |    ___||       ||      _||   | |   |___                      
|   |_| ||   |___ | | |   ||   |___ |   |  | ||   | |     |_ |   _   | _____| |   _____| ||       || | |   |  |       ||   |___   |   |    |   _   ||     |_ |   | |       |                     
|_______||_______||_|  |__||_______||___|  |_||___| |_______||__| |__||_______|  |_______||_______||_|  |__|  |______| |_______|  |___|    |__| |__||_______||___| |_______|                     
   _______  ______   _______  _______  _______  _______  _______  ___   _______  __    _                                                                                                         
  |   _   ||      | |   _   ||       ||       ||   _   ||       ||   | |       ||  |  | |                                                                                                        
  |  |_|  ||  _    ||  |_|  ||    _  ||_     _||  |_|  ||       ||   | |   _   ||   |_| |       ____   ____                                                                                      
  |       || | |   ||       ||   |_| |  |   |  |       ||       ||   | |  | |  ||       |      |____| |____|                                                                                     
  |       || |_|   ||       ||    ___|  |   |  |       ||      _||   | |  |_|  ||  _    | ___                                                                                                    
  |   _   ||       ||   _   ||   |      |   |  |   _   ||     |_ |   | |       || | |   ||   |                                                                                                   
  |__| |__||______| |__| |__||___|      |___|  |__| |__||_______||___| |_______||_|  |__||___|                                                                                                   
                                                                                                        



*/

























public class Chain <T> implements LinearList<T>, Iterable<T>
{
// fields
protected ChainNode<T> firstNode;
protected int size;




/** create a list that is empty */
 public Chain ( )
 {
 firstNode = null;
 size = 0;
 }

/** @return true iff list is empty */
public boolean isEmpty ( )
 {
 return size == 0;
 }


/** @return current number of elements in list */
public int size ( )
 {
 return size;
 }


/** @throws IndexOutOfBoundsException when
35 * index is not between 0 and size - 1 */
void checkIndex ( int index )
 {
 if( index < 0 || index >= size )
 throw new IndexOutOfBoundsException
 ( "index = " + index + " size = " + size );
 }



/** @return element with specified index
44 * @throws IndexOutOfBoundsException when
45 * index is not between 0 and size - 1 */
public T get ( int index )
 {
 checkIndex( index );
 // move to desired node
 ChainNode<T> currentNode = firstNode;
 for( int i = 0; i < index; i++ )
 currentNode = currentNode.next;
 return currentNode.element;
 }




/** @return index of first occurrence of theElement,
59 * return -1 if theElement not in list */
 public int indexOf ( T theElement )
 {
 // search the chain for theElement
 ChainNode<T> currentNode = firstNode;
 int index = 0; // index of currentNode
 while( currentNode != null &&
 !currentNode.element.equals( theElement ) )
 {
 // move to next node
 currentNode = currentNode.next;
 index++;
 }
 // make sure we found matching element
 if( currentNode == null )
 return -1;
 else
 return index;
 }




/** Remove the element with specified index.
80 * All elements with higher index have their
81 * index reduced by 1.
82 * @throws IndexOutOfBoundsException when
83 * index is not between 0 and size - 1
84 * @return removed element */
 public T remove ( int index )
 {
 checkIndex( index );
 T removedElement;
 if( index == 0 ) // remove first node
 {
 removedElement = firstNode.element;
 firstNode = firstNode.next;
 }
 else
 { // use q to get to predecessor of desired node
 ChainNode<T> q = firstNode;
 for( int i = 0; i < index - 1; i++ )
    q = q.next;
 removedElement = q.next.element;
 q.next = q.next.next; // remove desired node
 }
 size--;
 return removedElement;
 }

    
 
 
 
 /** Insert an element with specified index.
109 * All elements with equal or higher index
110 * have their index increased by 1.
111 * @throws IndexOutOfBoundsException when
112 * index is not between 0 and size */
public void add ( int index, T theElement )
 {
 if( index < 0 || index > size )
 // invalid list position
 throw new IndexOutOfBoundsException
 ( "index = " + index + " size = " + size );
 if( index == 0 )
 // insert at front
 firstNode = new ChainNode<T>( theElement, firstNode );
 else
 { // find predecessor of new element
 ChainNode<T> p = firstNode;
 for( int i = 0; i < index - 1; i++ )
    p = p.next;
 // insert after p
 p.next = new ChainNode<T>( theElement, p.next );
 }
 size++;
 }




/** convert to a string */
 @Override
 public String toString ( )
 {
 StringBuilder s = new StringBuilder( "[" );
 // put elements into the buffer
 for( T x : this )
 s.append( Objects.toString( x ) + ", " );
 if( size > 0 )
 s.setLength( s.length( ) - 2 ); // remove last ", "
 s.append( "]" );
 // create equivalent String
 return new String( s );
 }
 
 /** create and return an iterator */
public Iterator<T> iterator ( )
 {
 return new ChainIterator( );
 }


//_________________________________________________

/** chain iterator */
private class ChainIterator implements Iterator<T>
 {
 // data member
 private ChainNode<T> nextNode;
 // constructor
 public ChainIterator( )
 {
 nextNode = firstNode;
 }
 // methods
 /** @return true iff list has a next element */
 public boolean hasNext( )
 {
 return nextNode != null;
 }
 // @throws NoSuchElementException
//181 * when there is no next element 
 public T next( )
 {
 if( nextNode != null )
 {
 T elementToReturn = nextNode.element;
 nextNode = nextNode.next;
 return elementToReturn;
 }
 else
 throw new NoSuchElementException( "No next element" );
 }
 /** unsupported method */
 public void remove( )
 {
 throw new UnsupportedOperationException
 ( "remove not supported" );
 }
 }
 
//_____________________________________________






/** test program */
 public static void main ( String[] args )
 {
     
     
     //_________________________________________________________________________________________________________________-
     
     
     
/*
     
 ___      ___   _______  _______  _______    ______   _______    __   __  __   __  _______  ___      _______  _______ 
|   |    |   | |       ||       ||   _   |  |      | |       |  |  | |  ||  | |  ||       ||   |    |       ||       |
|   |    |   | |  _____||_     _||  |_|  |  |  _    ||    ___|  |  |_|  ||  | |  ||    ___||   |    |   _   ||  _____|
|   |    |   | | |_____   |   |  |       |  | | |   ||   |___   |       ||  |_|  ||   |___ |   |    |  | |  || |_____ 
|   |___ |   | |_____  |  |   |  |       |  | |_|   ||    ___|  |       ||       ||    ___||   |___ |  |_|  ||_____  |
|       ||   |  _____| |  |   |  |   _   |  |       ||   |___    |     | |       ||   |___ |       ||       | _____| |
|_______||___| |_______|  |___|  |__| |__|  |______| |_______|    |___|  |_______||_______||_______||_______||_______|
     */
     
     
     //______________________________________________________________________________________________________________-
 // test default constructor
 Chain<Vuelo> x = new Chain<>( );   //Aqui se define el tipo de dato de la lista
 // test size
 
 
    GregorianCalendar test_tiempo_salida = Vuelo.crear_horario(2019,9,29,20,0);
    GregorianCalendar test_tiempo_llegada = Vuelo.crear_horario(2019,10,12,10,30);
 
 
 //System.out.println( "Initial size is " + x.size( ) );
 
 
 // test isEmpty
 //if( x.isEmpty( ) )
 //System.out.println( "The list is empty" );
 
 
// else System.out.println( "The list is not empty" );
 
 // test put
 x.add( 0, new Vuelo("Bogota","Cartagena de Indias",test_tiempo_salida,test_tiempo_llegada ,"A_UN_001" ,"ON TIME") );
 x.add( 1, new Vuelo("Bogota","Medellin",test_tiempo_salida,test_tiempo_llegada ,"A_UN_002" ,"ON TIME") );
 x.add( 2, new Vuelo("Bogota","San Andres",test_tiempo_salida,test_tiempo_llegada ,"A_UN_003" ,"ON TIME") );
 x.add( 3, new Vuelo("Bogota","Santa Marta",test_tiempo_salida,test_tiempo_llegada ,"A_UN_004" ,"ON TIME"));
 
 
 
 
//System.out.println( "List size is " + x.size( ) );
 // test toString
 //System.out.println( "The list is " + x  );
 // test indexOf
 //int index = x.indexOf( new String( "Gatos" ) );
 //if( index < 0 )
 //System.out.println( "gatos not found" );
 //else System.out.println( "The index of gatos is " + index );
 //index = x.indexOf( new String( "Myef" ) );
 //if( index < 0 )
 //System.out.println( "Myef not found" );
 //else System.out.println( "The index of Myef is " + index );
 // test get
 
 System.out.println( "\n\n\n\n" );
 System.out.println( "Element at 0 is " + "\n" +  x.get( 0 ) );
 System.out.println( "\n\n\n\n" );
 System.out.println( "Element at 1 is " + "\n" +  x.get( 1 ) );
  System.out.println( "\n\n\n\n" );
 System.out.println( "Element at 2 is " +"\n" +  x.get( 2 ) );
 System.out.println( "\n\n\n\n" );
 System.out.println( "Element at 3 is " + "\n" +  x.get( 3 ) );
 
 System.out.println( "\n\n\n\n" );
 
 
 
 
 
 
 
 
 
 
 
 
 // test remove
 
 /*
 System.out.println( x.remove( 1 ) + " removed" );
System.out.println( "The list is " + x );
System.out.println( "\n\n\n\n" );
 System.out.println( x.remove( 2 ) + " removed" );
 System.out.println( "The list is " + x );
 
 System.out.println( "\n\n\n\n" );
 
 
 if( x.isEmpty( ) )
 System.out.println( "The list is empty" );
 else System.out.println( "The list is not empty" );
 System.out.println( "List size is " + x.size( ) );
 // output using an iterator
 Iterator y = x.iterator( );
 System.out.print( "The list is " );
 while( y.hasNext( ) )
 System.out.print( y.next( ) + " " );
 System.out.println( );
*/
 
 
 
 
 
 
 
 
  System.out.println( "\n\n\n\n" );
   System.out.println( "\n\n\n\n" );
    System.out.println( "\n\n\n\n" );
     System.out.println( "\n\n\n\n" );
      System.out.println( "\n\n\n\n" );
       System.out.println( "\n\n\n\n" );
 
 
       
       
       
       
       
       
//_________________________________________________________________________________________________________________

/*
 ___      ___   _______  _______  _______    ______   _______    _______  _______  _______  _______      ___  _______  ______    _______  _______ 
|   |    |   | |       ||       ||   _   |  |      | |       |  |       ||   _   ||       ||   _   |    |   ||       ||    _ |  |       ||       |
|   |    |   | |  _____||_     _||  |_|  |  |  _    ||    ___|  |    _  ||  |_|  ||  _____||  |_|  |    |   ||    ___||   | ||  |   _   ||  _____|
|   |    |   | | |_____   |   |  |       |  | | |   ||   |___   |   |_| ||       || |_____ |       |    |   ||   |___ |   |_||_ |  | |  || |_____ 
|   |___ |   | |_____  |  |   |  |       |  | |_|   ||    ___|  |    ___||       ||_____  ||       | ___|   ||    ___||    __  ||  |_|  ||_____  |
|       ||   |  _____| |  |   |  |   _   |  |       ||   |___   |   |    |   _   | _____| ||   _   ||       ||   |___ |   |  | ||       | _____| |
|_______||___| |_______|  |___|  |__| |__|  |______| |_______|  |___|    |__| |__||_______||__| |__||_______||_______||___|  |_||_______||_______|
*/





//________________________________________________________________________________________________________________
 GregorianCalendar test_Fecha_de_nacimiento = Vuelo.crear_horario(1990,9,29,0,0);
 Chain<Pasajero> p = new Chain<>( );   //Aqui se define el tipo de dato de la lista
 
  p.add( 0, new Pasajero("Juan", "Perez", test_Fecha_de_nacimiento,123456,"juanperez@mail.com","H16", "Colombia", 100012345) );
  p.add( 1, new Pasajero("John", "Smith", test_Fecha_de_nacimiento,123456,"jsmith@mail.com","B19", "United Kingdom", 809678) );
  p.add( 2, new Pasajero("Juan", "Rodriguez", test_Fecha_de_nacimiento,123456,"jrodriguez@mail.com","E8", "Colombia", 10005500) );
  
  
 System.out.println( "\n\n\n\n" );
 System.out.println( "Element at 0 is " +"\n" + p.get( 0 ) );
 System.out.println( "\n\n\n\n" );
 System.out.println( "Element at 1 is " + "\n" +  p.get( 1 ) );
 System.out.println( "\n\n\n\n" );
 System.out.println( "Element at 2 is " + "\n" +  p.get( 2 ) );
 System.out.println( "\n\n\n\n" );

 
 
 }




}
