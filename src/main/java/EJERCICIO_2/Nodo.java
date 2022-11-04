package EJERCICIO_2;
//Gaspar Paucar Wilber Andrihu
/**
 *
 * @author Usuario
 */
public class Nodo {
    private int dato;
    private Nodo siguiente;
    
    // Insertar Inicio
    public Nodo(int dato, Nodo siguiente){
        this.dato = dato;
        this.siguiente = siguiente;
    }
    
    //Insertar por el ultimo
    public Nodo(int dato){
        this.dato = dato;
        this.siguiente = null;
    }

    public int getDato() {
        return dato;
    }

    public void setDato(int dato) {
        this.dato = dato;
    }

    public Nodo getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }

    @Override
    public String toString() {
        return "Nodo{" + "dato=" + dato + ", siguiente=" + siguiente + '}';
    }
    
    
}
