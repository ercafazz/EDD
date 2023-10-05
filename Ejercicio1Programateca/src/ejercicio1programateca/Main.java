/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio1programateca;

/**
 *
 * @author ernesto
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        LinkedList list_A = new LinkedList();
        for (int i = 0; i < 10; i+=2) {
            list_A.InsertEnd(i);
        }
        System.out.println("Lista A");
        list_A.Show();
        
        LinkedList list_B = new LinkedList();
        for (int i = 1; i < 10; i+=2) {
            list_B.InsertEnd(i);
        }
        System.out.println("\nLista B");
        list_B.Show();
        System.out.println("");
        
        System.out.println("Lista C");
        LinkedList list_C = list_A.Merge(list_B);
        list_C.Show();
    }
}