
package ProyectoFinal;

/**
 *
 * @author T107
 */
import java.io.*;
public class Persistencia {
  
   Cuenta c; 
   
   public void guardar(Cuenta c ){
       try{
         //paso 1 para guardar :crear el archivo fisico 
           File f=new File("archivaldo.xxx");
         // paso 2. encadenamos el archvo fisico a la salida 
           FileOutputStream fos=new FileOutputStream(f); 
          //paso 3. creamos e objeto serializar 
           ObjectOutputStream oos=new ObjectOutputStream(fos ); 
           oos.writeObject(c); 
           System.out.println("Guargado exitisamente "); 
           
         
       }catch(Exception e){
           System.out.println(e.getMessage());
           
       } 
            

   }
   public Cuenta leer(){
       Cuenta c=new Cuenta(); 
       try{
           //paso 1 abrir el archivo a leerse 
           File f=new File("archivaldo.xxx");
           //el siguiente rengon indica que el archivo leera(entra el archivo)
           FileInputStream fis=new FileInputStream(f);
           //paso3- creamos el contemido 
           ObjectInputStream ois=new ObjectInputStream(fis); 
           c=(Cuenta )ois.readObject();
           
       }catch(Exception e){
           
       }
       return c; 
   }
}

