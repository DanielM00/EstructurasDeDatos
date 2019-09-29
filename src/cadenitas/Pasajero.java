/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cadenitas;
import java.util.Calendar;
import java.util.GregorianCalendar;
//import cadenitas.Vuelo;

/**
 *
 * @author Alejandro Ortiz
 */
public class Pasajero {
    
    String Nombres;
    String Apellidos;
    
    GregorianCalendar Fecha_de_nacimiento;
    int Telefono;
    String Email;
    
    String Asiento;
    
    String Nacionalidad;
    
    
    int Documento;
    
    
    
    
    
    
    
    
    
    public String imprimir_horario(GregorianCalendar horario){
        int year = horario.get(Calendar.YEAR);
        int mes = horario.get(Calendar.MONTH);
        int dia = horario.get(Calendar.DAY_OF_MONTH);
        int hora = horario.get(Calendar.HOUR_OF_DAY);
        int minuto = horario.get(Calendar.MINUTE);
        
        return  "[ " + year + " / " + mes + " / " + dia + " / " + hora + " : " + minuto + " ]" ;
    }
    
    
    
    
    
    
    
    public void setNombres(String Nombres){
        this.Nombres = Nombres;
    }
    
    
    public void setApellidos(String Apellidos){
        this.Apellidos = Apellidos;
    }
    
    
    public void setFecha_de_nacimiento(GregorianCalendar Fecha_de_nacimiento){
        this.Fecha_de_nacimiento = Fecha_de_nacimiento;
    }
    
    
    public void setTelefono(int Telefono){
        this.Telefono = Telefono;
    }
    
    public void setEmail(String Email){
        this.Email = Email;
    }
    
    
    public void setAsiento (String Asiento ){
        this.Asiento = Asiento ;
    }
    
    public void setNacionalidad (String Nacionalidad){
        this.Nacionalidad = Nacionalidad;
    }
    
    public void setDocumento (int Documento){
        this.Documento = Documento;
    }
    
    
    
    
    
    
    
    
    
    public String getNombres(){
        return Nombres;
    }
    
    
    public String getApellidos(){
        return Apellidos;
    }
    
    
    public GregorianCalendar getFecha_de_nacimiento(){
        return Fecha_de_nacimiento;
    }
    
    
    public int getTelefono(){
        return Telefono;
    }
    
    public String getEmail(){
        return Email;
    }
    
    
    public String getAsiento (){
        return Asiento ;
    }
    
    public String getNacionalidad (){
        return Nacionalidad;
    }
    
    public int getDocumento (){
        return Documento;
    }
    
    
    
    
    
    public Pasajero(String Nombres, String Apellidos, GregorianCalendar Fecha_de_nacimiento, int Telefono, String Email, String Asiento, String Nacionalidad, int Documento){
        this.setNombres(Nombres);
        this.setApellidos(Apellidos);
        this.setFecha_de_nacimiento(Fecha_de_nacimiento);
        this.setTelefono(Telefono);
        this.setEmail(Email);
        this.setAsiento(Asiento);
        this.setNacionalidad(Nacionalidad);
        this.setDocumento(Documento);
    }
    
    
    
    public Pasajero(){
        this.setNombres(null);
        this.setApellidos(null);
        this.setFecha_de_nacimiento(null);
        this.setTelefono(0);
        this.setEmail(null);
        this.setAsiento(null);
        this.setNacionalidad(null);
        this.setDocumento(0);
    }
        
        
    
    @Override
    public String toString(){
        return
        "Nombres: " + this.Nombres + "\n" +
        "Apellidos: " +this.Apellidos + "\n" +
                
                
        "Fecha_de_nacimiento: " +imprimir_horario(this.Fecha_de_nacimiento) + "\n" +
                
                
        "Telefono: " + this.Telefono + "\n" +
                
        "Email: " +this.Email + "\n" +
                
        "Asiento: " +this.Asiento + "\n" +
                
        "Nacionalidad: " +this.Nacionalidad+ "\n" +
                
                
        "Documento: " + this.Documento;
        
    }
       
}
