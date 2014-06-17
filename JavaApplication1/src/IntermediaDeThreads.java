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
    }
    
    @Override 
    public void run(){
        
        
        System.out.println("Soy un Thread intermedio "); 
    }
        
    
}//Termina clase IntermediaDeThreads 
