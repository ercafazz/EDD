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
        LinkedList list_B = new LinkedList();
        for (int i = 0; i < 20; i+=3) 
        {
            list_B.InsertEnd(i);
        }
        System.out.println("");
        list_B.Change(3, 1000);
        list_B.Show();
        
        list_B.InsertAtTwoPlusIndex(6, 200);
        list_B.Show();
        System.out.println("");
    }
}