/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cadenitas;

/**
 *
 * @author Daniel
 */
public class PriceSorter {
    
    public Chain<Vuelo> Todos_los_vuelos;
    public int array[];
    private int length;
  
    public void sort(Chain<Vuelo> Vuelos) {
        
       
        Todos_los_vuelos=Vuelos;
        
        
        int [] inputArr = new int [Todos_los_vuelos.size];
        
        for(int i=0;i<Todos_los_vuelos.size;i++){
            inputArr[i]=Todos_los_vuelos.get(i).getPrecio();
        }
        if (inputArr == null || inputArr.length == 0) {
            return;
        }
        this.array = inputArr;
        length = inputArr.length;
        quickSort(0, Vuelos.size() - 1, Todos_los_vuelos);
    }
 
    private void quickSort(int lowerIndex, int higherIndex, Chain<Vuelo> Aviones) {
         
        int i = lowerIndex;
        int j = higherIndex;
        // calculate pivot number, I am taking pivot as middle index number
        int pivot = array[lowerIndex+(higherIndex-lowerIndex)/2];
        // Divide into two arrays
        while (i <= j) {
            /**
             * In each iteration, we will identify a number from left side which 
             * is greater then the pivot value, and also we will identify a number 
             * from right side which is less then the pivot value. Once the search 
             * is done, then we exchange both numbers.
             */
            while (array[i] < pivot) {
                i++;
            }
            while (array[j] > pivot) {
                j--;
            }
            if (i <= j) {
                exchangeNumbers(i, j);
                //move index to next position on both sides
                i++;
                j--;
            }
        }
        // call quickSort() method recursively
        if (lowerIndex < j)
            quickSort(lowerIndex, j, Aviones);
        if (i < higherIndex)
            quickSort(i, higherIndex, Aviones);
    }
 
    private void exchangeNumbers(int i, int j) {
        Vuelo temp1 = Todos_los_vuelos.get(i);
        Vuelo temp2 = Todos_los_vuelos.get(j);
        Todos_los_vuelos.add(j+1, temp1);
        Todos_los_vuelos.remove(j); 
        Todos_los_vuelos.add(i+1, temp2);
        Todos_los_vuelos.remove(i);
      
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
        
        
    }
    
    
    /* 
    public static void main(String a[]){
         
        PriceSorter sorter = new PriceSorter();
        int[] input = {24,2,45,20,56,75,2,56,99,53,12};
        sorter.sort(input);
        for(int i:input){
            System.out.print(i);
            System.out.print(" ");
        }
    }*/

    public int[] getArray() {
        return array;
    }

    public Chain<Vuelo> getTodos_los_vuelos() {
        return Todos_los_vuelos;
    }
    
    
}
