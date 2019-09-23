/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cadenitas;


import java.util.GregorianCalendar;


/**
 *
 * @author Alejandro Ortiz
 */
public class Test_consola {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        
        
    GregorianCalendar test_tiempo_salida = Vuelo.crear_horario(2019,9,29,20,0);
    GregorianCalendar test_tiempo_llegada = Vuelo.crear_horario(2019,10,12,10,30);
    
    Vuelo test_vuelo = new Vuelo("Bogota","Cartagena de Indias",test_tiempo_salida,test_tiempo_llegada ,"A_UN_001" ,"ON TIME");
    
    
    System.out.println(test_vuelo.toString());
    
    
    
    GregorianCalendar test_Fecha_de_nacimiento = Vuelo.crear_horario(1990,9,29,0,0);
    
    
    Pasajero test_pasajero = new Pasajero("Juan", "Perez", test_Fecha_de_nacimiento,123456,"juanperez@mail.com","H16", "Colombia", 100012345);
    
    
    System.out.println("\n\n\n\n");
    System.out.println(test_pasajero.toString());
    
}
}