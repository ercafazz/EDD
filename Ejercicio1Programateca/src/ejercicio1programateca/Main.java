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
    public static void main(String[] args) 
    {
        LinkedList list_A = new LinkedList();
        LinkedList list_B = new LinkedList();
        LinkedList list_C = new LinkedList();
        
        for (int i = 0; i < 10; i+=2) 
        {
            list_A.InsertEnd(i);
        }
        for (int i = 0; i < 40; i+=3) 
        {
            list_B.InsertEnd(i);
        }
        for (int i = 0; i < 40; i+=6) 
        {
            list_C.InsertEnd(i);
        }
        
        System.out.println("Lista A");
        list_A.Show();
        System.out.println("\nLista B");
        list_B.Show();
        System.out.println("\nLista C");
        list_C.Show();
        
        LinkedList finalList = list_A.SumWith(list_B, list_C);
        System.out.println("\nSuma de la lista");
        finalList.Show();
    }
}