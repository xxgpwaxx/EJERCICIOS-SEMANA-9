/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package EJERCICIO_2;
//Gaspar Paucar Wilber Andrihu
/**
 *
 * @author Usuario
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Lista lista1 = new Lista();
        lista1.Insertar_Inicio(26);
        lista1.Insertar_Inicio(50);
        lista1.Insertar_Inicio(34);
        lista1.Insertar_Inicio(37);
        lista1.Insertar_Inicio(21);
        lista1.Insertar_Inicio(10);
        lista1.Insertar_Ultimo(100);
        System.out.println("Numero pares de la lista "+lista1.Pares());
        System.out.println(lista1.Mostrar());
        
        System.out.println(lista1);
        lista1.Eliminar_Inicio();
        System.out.println(lista1);
        lista1.Eliminar_Ultimo();
        System.out.println(lista1);
        System.out.println(lista1.Mostrar());
    }
}
