package EJERCICIO_1;
import java.util.ArrayList;
import java.util.List;
//Gaspar Paucar Wilber Andrihu
/**
 *
 * @author Usuario
 */
public class Ejercicio_1 {
    public static void main(String args[]){
        
        List<Persona> lis_persona = new ArrayList();
        
        for (int i = 0; i < 10; i++){
            Persona per = new Persona();
            per.setCodigo(1);
            per.setNombre("Andrihu" + i);
            per.setApellido("Gaspar" + i);
            per.setEdad(25 + i);
            lis_persona.add(per);
        }
        System.out.println("Tamaño de Lista: " + lis_persona.size());
        
        for(Persona p: lis_persona){
            System.out.println("Codigo: " + p.getCodigo());
            System.out.println("Nombre: " + p.getNombre());
            System.out.println("Apellido: " + p.getApellido());
            System.out.println("Edad: " + p.getEdad());
            System.out.println("------------------------------------");
        }
                
    }
}
