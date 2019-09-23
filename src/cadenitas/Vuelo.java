/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cadenitas;


import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 *
 * @author Alejandro Ortiz
 */
public class Vuelo {
    String Ciudad_partida;
    String Ciudad_llegada;
    
    GregorianCalendar Tiempo_salida;
    GregorianCalendar Tiempo_llegada;
    
    String Codigo;
    String Estado;
    
    
    
    //year, month,dayOfMonth,hourOfDay, minute)
    public static GregorianCalendar crear_horario(int year,int month_1_12,int dayOfMonth,int hourOfDay24h,int minute){
        
        GregorianCalendar horario = new GregorianCalendar(year, month_1_12 - 1,dayOfMonth,hourOfDay24h, minute);
        return horario;
    }
    
    
    public String imprimir_horario(GregorianCalendar horario){
        int year = horario.get(Calendar.YEAR);
        int mes = horario.get(Calendar.MONTH);
        int dia = horario.get(Calendar.DAY_OF_MONTH);
        int hora = horario.get(Calendar.HOUR_OF_DAY);
        int minuto = horario.get(Calendar.MINUTE);
        
        return  "[ " + year + " / " + mes + " / " + dia + " / " + hora + " : " + minuto + " ]" ;
    }
    
    
    public void SetCiudad_partida(String Ciudad_partida){
        this.Ciudad_partida = Ciudad_partida;  
    }
    
    public void SetCiudad_llegada(String Ciudad_llegada){
        this.Ciudad_llegada = Ciudad_llegada;  
    }
    
    
    
    
    
    public void SetTiempo_salida(GregorianCalendar Tiempo_salida){
        this.Tiempo_salida= Tiempo_salida;  
    }
    
    public void SetTiempo_llegada(GregorianCalendar Tiempo_llegada){
        this.Tiempo_llegada = Tiempo_llegada;  
    }
      
    
    
    
    
    public void SetCodigo(String Codigo){
        this.Codigo = Codigo;  
    }
          
    public void SetEstado(String Estado){
        this.Estado = Estado;  
    }
    
    
    
    
    
    
    
    public String getCiudad_partida(){
        return Ciudad_partida;  
    }
    
    public String getCiudad_llegada(){
        return Ciudad_llegada;  
    }
    
    
    
    
    
    public GregorianCalendar getTiempo_salida(){
        return Tiempo_salida;  
    }
    
    public GregorianCalendar getTiempo_llegada(){
        return Tiempo_llegada;  
    }
      
    
    
    
    
    public String getCodigo(){
        return Codigo;  
    }
          
    public String getEstado(){
        return Estado;  
    }
    
    
    
    
    
    
    public Vuelo(){
        this.SetCiudad_partida(null);
        this.SetCiudad_llegada(null);
        this.SetTiempo_salida(null);
        this.SetTiempo_llegada(null);
        this.SetCodigo(null);
        this.SetEstado(null);
    }
    
    
    public Vuelo(String Ciudad_partida,String Ciudad_llegada, GregorianCalendar Tiempo_salida,GregorianCalendar Tiempo_llegada ,String Codigo ,String Estado){
        this.SetCiudad_partida(Ciudad_partida);
        this.SetCiudad_llegada(Ciudad_llegada);
        this.SetTiempo_salida(Tiempo_salida);
        this.SetTiempo_llegada(Tiempo_llegada);
        this.SetCodigo(Codigo);
        this.SetEstado(Estado);
    }
    
    
    @Override
    public String toString(){
        return 
        "Ciudad de Salida: " + this.Ciudad_partida + "\n" +
        "Ciudad de Destino: " +this.Ciudad_llegada + "\n" +
                
        "Hora de salida: " +imprimir_horario(this.Tiempo_salida) + "\n" +
        "Hora de llegada: " +imprimir_horario(this.Tiempo_llegada) +"\n" +
        
        "Codigo del Vuelo: " +this.Codigo +"\n" +
        "Estado del vuelo: "+ this.Estado;
    }
    
    
    
}
