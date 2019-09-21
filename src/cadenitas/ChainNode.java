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


class ChainNode <T>
 {
 // package visible fields
 T element;
 ChainNode<T> next;
 // package visible constructors
 ChainNode ( )
 {
 this( null, null );
 }
 ChainNode ( T element )
 {
 this( element, null );
 }

 ChainNode ( T element, ChainNode<T> next )
 {
 this.element = element;
 this.next = next;
 }
 }

