/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cadenitas;

import java.util.Scanner;

/**
 *
 * @author Daniel
 */
public class CambiodeDatos {
    
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        
        System.out.println("A continuación ingrese los datos del pasajero: ");
        System.out.println("Nombre: ");
        String nombre=in.nextLine();
        System.out.println("Apellidos: ");
        String Apellidos=in.nextLine();
        System.out.println("Documento: ");
        int documento =in.nextInt();
        
        Pasajero person1 = new Pasajero();
        
        person1.setDocumento(documento);
        person1.setNombres(nombre);
        person1.setApellidos(Apellidos);
        
        System.out.println("Desea cambiar el documento? Presione 1 para si, 0 para no ");
        int cambiar = in.nextInt();
       
        if (cambiar==1){
            System.out.println("Digite el documento");
        documento =in.nextInt();
        person1.setDocumento(documento);
            
        }
        System.out.println(person1.Documento);
        
    }
    
}
