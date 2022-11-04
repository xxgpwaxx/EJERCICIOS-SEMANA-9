package EJERCICIO_3;
import java.util.ArrayList;
import java.util.Scanner;
//Gaspar Paucar Wilber Andrihu
/**
 *
 * @author Usuario
 */
public class ListaNumeros {
    
    ArrayList<Double> listitaNumeros;
    
    public static void main(String[] args) {
        ListaNumeros miLista = new ListaNumeros();
        miLista.listitaNumeros = new ArrayList();
        miLista.leerOpcion();
    }
    
    public void leerOpcion(){
        Scanner teclado = new Scanner(System.in);
        int opcion;
        do{
            System.out.println("\nLista de Numeros");
            System.out.println("[1] Agregar");
            System.out.println("[2] Buscar");
            System.out.println("[3] Modificar elemento");
            System.out.println("[4] Eliminar elemento");
            System.out.println("[5] Insertar elemento");
            System.out.println("[6] Mostrar elemento");
            System.out.println("[7] Salir\n");
            System.out.println("Ingresar Opcion (1-7): ");
            opcion = teclado.nextInt();
            
            switch (opcion){
                case 1:
                    ingresarValor();
                    break;
                case 2:
                    buscarValor();
                    break;
                case 3:
                    modificarValor();
                    break;
                case 4:
                    eliminarValor();
                    break;
                case 5:
                    insertarValor();
                    break;
                case 6:
                    mostrarValor();
                    break;
                case 7:

            }
        }while (opcion != 7);
    }
    
    public void ingresarValor(){
        Scanner teclado = new Scanner(System.in);
        double valor;
        System.out.print("Ingresar valor: ");
        valor = teclado.nextDouble();
        listitaNumeros.add(valor);
    }
    public void buscarValor(){
        Scanner teclado = new Scanner(System.in);
        double valor;
        int indice;
        System.out.print("Valor a buscar: ");
        valor = teclado.nextDouble();
        indice = listitaNumeros.indexOf(valor);
        if(indice != -1){
            System.out.println("Dato se encuentra en posicion: "+indice);
        }else{
            System.out.println("Dato no se encuentra");
        }
    }
    public void modificarValor(){
        Scanner teclado = new Scanner(System.in);
        double valor, nuevoValor;
        int indice;
        System.out.print("Valor a modificar: ");
        valor = teclado.nextDouble();
        indice = listitaNumeros.indexOf(valor);
        if(indice != -1){
            System.out.print("Nuevo Valor: ");
            nuevoValor = teclado.nextDouble();
            listitaNumeros.set(indice, nuevoValor);
        }else{
            System.out.println("Dato no se encuentra");
        }
        
    }
    public void eliminarValor(){
        Scanner entrada = new Scanner(System.in);
        double valor;
        int indice;
        System.out.print("Valor a modificar: ");
        valor = entrada.nextDouble();
        indice = listitaNumeros.indexOf(valor);
        if(indice != -1){
            listitaNumeros.remove(indice);
            System.out.println("Dato eliminado");
        }else{
            System.out.println("Dato no se encuentra");
        }
    }
    public void insertarValor(){
        Scanner teclado = new Scanner(System.in);
        double valor;
        int indice;
        System.out.print("Valor a insertar: ");
        valor = teclado.nextDouble();
        System.out.print("Posicion donde desea insertar: ");
        indice = teclado.nextInt();
        listitaNumeros.add(indice, valor);
    }
    public void mostrarValor(){
        if(!listitaNumeros.isEmpty()){
            System.out.println("Elementos de la lista: ");
            for(int i = 0; i < listitaNumeros.size(); i++){
                System.out.println(listitaNumeros.get(i));
            }
        }else{
            System.out.println("No existe valores en la lista");
        }
    }
    
    
}
