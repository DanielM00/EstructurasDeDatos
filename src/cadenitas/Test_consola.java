/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cadenitas;


import java.util.GregorianCalendar;

import java.util.*;
/**
 *
 * @author Alejandro Ortiz
 */
public class Test_consola {

    
    
    
/*
 _               _                   _                         _                                      
| |             | |                 | |                       | |                                     
| |     ___  ___| |_ ___  _ __    __| | ___  __   ___   _  ___| | ___  ___                            
| |    / _ \/ __| __/ _ \| '__|  / _` |/ _ \ \ \ / / | | |/ _ \ |/ _ \/ __|                           
| |___|  __/ (__| || (_) | |    | (_| |  __/  \ V /| |_| |  __/ | (_) \__ \_                          
\_____/\___|\___|\__\___/|_|     \__,_|\___|   \_/  \__,_|\___|_|\___/|___(_)                         
                                                                                                      
                                                                                                      
 _                                  _             _                                     _             
| |                                | |           (_)                                   | |            
| |     ___  ___  __   ___   _  ___| | ___  ___   _ _ __   __ _ _ __ ___  ___  __ _  __| | ___  ___   
| |    / _ \/ __| \ \ / / | | |/ _ \ |/ _ \/ __| | | '_ \ / _` | '__/ _ \/ __|/ _` |/ _` |/ _ \/ __|  
| |___| (_) \__ \  \ V /| |_| |  __/ | (_) \__ \ | | | | | (_| | | |  __/\__ \ (_| | (_| | (_) \__ \  
\_____/\___/|___/   \_/  \__,_|\___|_|\___/|___/ |_|_| |_|\__, |_|  \___||___/\__,_|\__,_|\___/|___/  
                                                           __/ |                                      
                                                          |___/                                       
                                  _                        _                       _ _     _          
                                 | |                      | |                     | (_)   | |         
 ___  ___   _ __   ___  _ __   __| |_ __ __ _ _ __     ___| |  _   _ _ __   __ _  | |_ ___| |_ __ _   
/ __|/ _ \ | '_ \ / _ \| '_ \ / _` | '__/ _` | '_ \   / _ \ | | | | | '_ \ / _` | | | / __| __/ _` |  
\__ \  __/ | |_) | (_) | | | | (_| | | | (_| | | | | |  __/ | | |_| | | | | (_| | | | \__ \ || (_| |_ 
|___/\___| | .__/ \___/|_| |_|\__,_|_|  \__,_|_| |_|  \___|_|  \__,_|_| |_|\__,_| |_|_|___/\__\__,_(_)
           | |                                                                                        
           |_|                                                                                        
                                                                                                      
    */
    
    
    
    //Ultima Actualizacion 28 de Septiembre de 2019
    //Proyecto Estructuras de datos UNAL 2019-II
    
    /*
    
    Aqui se ha creado un programa para leer un numero indefinido de vuelos ,agregarlos a una lista e imprimirlos.
    Cada vuelo de be repetar el formato del testcase,el entero 1 o 0 representa si es el ultimo en leerse o si se debe continuar leyendo.
    
    Cada vuelo va separado por un salto de linea de por medio,al final --fin-- reemplaza al salto de linea(debe incluirse --fin-- al copiar y usar el testcase)
    
    
    
    
..........................................................................................................................................
Test case
    (En caso de error se recomienda pegarlo en bloc de notas y despues si pegar en la consola.Asegurese de que no se pega ninguna 
     linea vacia,sino que la primera linea es la primera ciudad)
    
    
    
Bogota         
Cartagena de Indias             
2019 9 29 20 0
2019 10 14 12 30     
A_UN_003
ON TIME
500000
1

NYC        
London          
2019 9 29 20 0
2019 10 14 12 30     
A_UN_005
Delayed
200000
1

Par    
London          
2019 9 29 20 0
2019 10 14 12 30     
A_UN_09
on time
100000
0
--fin--
    
    ....................................................................................................................
    */
    
    
    
    
    
    
    
    
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        
        
        // TODO code application logic here
        

        
        
        //___________________________________________________________________________________________________________
        
        
        
        Chain<Vuelo> Todos_los_vuelos = new Chain<>( );
        

        
       int contador = 0;
        
        Scanner in = new Scanner(System.in);
        
       int seguir_leyendo = 1;
       
       
       while(seguir_leyendo>0){
       
       
       //System.out.println("Ingrese un vuelo");
            
      // System.out.println("ciudad:");
        String Partida =in.nextLine();
        
        //System.out.println("ciudad llegada :");
        String Destino =in.nextLine();
        
        //System.out.println("salida fecha :");
        int year_s = in.nextInt();
        int month_s = in.nextInt();
        int day_s = in.nextInt();
        
        int hour_s = in.nextInt();
        int minutes_s = in.nextInt();
        
        GregorianCalendar Fecha_de_salida = Vuelo.crear_horario(year_s,month_s,day_s,hour_s,minutes_s);
        
        
        
        
        //System.out.println("llegada fecha :");
        int year_ll = in.nextInt();
        int month_ll = in.nextInt();
        int day_ll = in.nextInt();
        
        int hour_ll = in.nextInt();
        int minutes_ll = in.nextInt();
        
        GregorianCalendar Fecha_de_llegada = Vuelo.crear_horario(year_ll,month_ll,day_ll,hour_ll,minutes_ll);
        
        String nada =in.nextLine();
        
        //System.out.println("codigo :");
        String code =in.nextLine();
       // System.out.println("estado :");
        String Estado =in.nextLine();
        int Precio = in.nextInt();
        
        seguir_leyendo = in.nextInt();
        
        nada =in.nextLine();
        nada =in.nextLine();
        
//        System.out.println("leido codigo :" +Codigo);
  //      System.out.println("leido estado :" +Estado);
        
        Vuelo Vuelo_lector = new Vuelo(Partida,Destino,Fecha_de_salida,Fecha_de_llegada ,code ,Estado,Precio);
        
        
        //_________________________________________________
        
        Todos_los_vuelos.add( contador,Vuelo_lector );
        
        //__________________________________________________
        
        
        //System.out.println("contador vuelos: "+ contador);
        //System.out.println(Vuelo_lector.toString());
        
        contador++;
        
        System.out.println("\n\n\n\n");
        
        /*
        Test
        Bogota
                
        Cartagena de Indias
        
                
        2019 9 29 20 0
        2019 10 14 12 30
        
        A_UN_003
        ON TIME
        */
        }
       
       
       System.out.println("||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||");
       System.out.println("||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||");
       System.out.println("||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||");
       
       int elementos = Todos_los_vuelos.size();
       for(int i =0;i<elementos;i++){
            System.out.println( "Elemento " + i +" \n" +  Todos_los_vuelos.get( i ) );
            System.out.println( "\n\n\n\n" );
       }

        
        
        
        
        
     /*
        
    GregorianCalendar test_tiempo_salida = Vuelo.crear_horario(2019,9,29,20,0);
    GregorianCalendar test_tiempo_llegada = Vuelo.crear_horario(2019,10,12,10,30);
    
    Vuelo test_vuelo = new Vuelo("Bogota","Cartagena de Indias",test_tiempo_salida,test_tiempo_llegada ,"A_UN_001" ,"ON TIME");
    
    
    System.out.println(test_vuelo.toString());
    
    
    //_________________________________________________________________________________________________________
    
    
    
    GregorianCalendar test_Fecha_de_nacimiento = Vuelo.crear_horario(1990,9,29,0,0);
    
    
    Pasajero test_pasajero = new Pasajero("Juan", "Perez", test_Fecha_de_nacimiento,123456,"juanperez@mail.com","H16", "Colombia", 100012345);
    
    
    System.out.println("\n\n\n\n");
    System.out.println(test_pasajero.toString());
*/
/*
     Probando ordenador por precios
     */

  PriceSorter sorter = new PriceSorter();
        sorter.sort(Todos_los_vuelos);
        for(int i:sorter.getArray()){
            System.out.print(i);
            System.out.print(" ");
        }
        
         
        }
}