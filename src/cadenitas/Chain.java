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
 // test default constructor
 Chain<String> x = new Chain<>( );
 // test size
 System.out.println( "Initial size is " + x.size( ) );
 // test isEmpty
 if( x.isEmpty( ) )
 System.out.println( "The list is empty" );
 else System.out.println( "The list is not empty" );
 // test put
 x.add( 0, new String( "Gatos" ) );
 x.add( 1, new String( "UwU" ) );
 x.add( 0, new String( "holi" ) );
 x.add( 3, new String( "Myef" ) );
System.out.println( "List size is " + x.size( ) );
 // test toString
 System.out.println( "The list is " + x );
 // test indexOf
 int index = x.indexOf( new String( "Gatos" ) );
 if( index < 0 )
 System.out.println( "gatos not found" );
 else System.out.println( "The index of gatos is " + index );
 index = x.indexOf( new String( "Myef" ) );
 if( index < 0 )
 System.out.println( "Myef not found" );
 else System.out.println( "The index of Myef is " + index );
 // test get
 System.out.println( "Element at 0 is " + x.get( 0 ) );
 System.out.println( "Element at 3 is " + x.get( 3 ) );
 // test remove
 System.out.println( x.remove( 1 ) + " removed" );
System.out.println( "The list is " + x );
 System.out.println( x.remove( 2 ) + " removed" );
 System.out.println( "The list is " + x );
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
 
 
 System.out.println( "Holi xd");
 }




}