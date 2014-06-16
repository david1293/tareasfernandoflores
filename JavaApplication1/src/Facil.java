//Forma facil
//Los threads se crean haciendo la clase Thread 
//Ventajas: es muy facil 
//Desventajas :desgastas la herencia 
//una clase siempe hereda a a clase Object 

public class Facil extends Thread  {
//extends =hereda a Thread 
    
    public void run(){
        System.out.println("Soy un thread solitario");
    }
    
    
    
}
