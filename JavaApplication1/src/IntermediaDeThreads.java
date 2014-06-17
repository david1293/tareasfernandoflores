//Forma intermedia de threads 
public class IntermediaDeThreads implements Runnable{
    
    
    
    public static void main (String args[]){
        //Paso 1 inicio del ciclo Crear Thread 
        Runnable r=new IntermediaDeThreads(); 
        Thread t1=new Thread(r);
        Thread t2=new Thread(r); 
        Thread t3=new Thread(r); 
        //paso 2 del ciclo inicializacion 
        
       t1.start(); 
       t2.start(); 
       t3.start(); 
       t1.setName("impresion"); 
       t2.setName("conexion"); 
       t3.setName("guardar"); 
    }
    
    @Override 
    public void run(){
        
                      try { // es una excepcion para poner a dormir a un Thread 
          
      
       System.out.println("Soy un Thread intermedio "); 
        if (Thread.currentThread().getName().equals("conexion"))Thread.sleep(8000); //para dormir conexion 
        if (Thread.currentThread().getName().equals("impresion "))Thread.sleep(6000); //para dormir impresion 
       if (Thread.currentThread().getName().equals("guardar"))Thread.sleep(8000); //para dormir guardar
        System.out.println(Thread.currentThread().getName()); 
        
                           } catch(Exception e){}  // cierra try 
        
        
    }
        
    
}//Termina clase IntermediaDeThreads 
