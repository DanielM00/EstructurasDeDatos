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
/** @return index of first occurrence of theElement,
59 * return -1 if theElement not in list */
public interface LinearList <T>
 {
 boolean isEmpty ( );
 int size ( );
 T get ( int index );
 int indexOf ( T theElement );
 T remove ( int index );
 void add ( int index, T theElement );
 String toString ( );
 }



