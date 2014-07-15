package ProyectoFinal;
/**
 *
 * @author fernando david flores caravantes 
 * 1-agregar setters y getters
 * 2-agregar costructor que inicializa atributos 
 * 3-sobreescribir el metodo toString 
 * 4-encapsular
 * 5-preparar la clase para ser serializada (comprimida )
 */
public class ProyectoFinal {

    public static void main(String[] args ){
        //primmero creamos una cuenta 
        Cuenta c=new Cuenta ("nomina ", 123,10000);
        Persistencia p=new Persistencia(); 
        p.guardar(c); 
        
    }
}
