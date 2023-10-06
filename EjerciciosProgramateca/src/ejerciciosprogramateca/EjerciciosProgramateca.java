/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejerciciosprogramateca;

/**
 *
 * @author ernesto
 */
public class EjerciciosProgramateca 
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        
        ArrayLinkedList list = new ArrayLinkedList(10);
        for (int i = 0; i < 10; i++) 
        {
            list.InsertEnd(i);
        }
        
        list.Print();
    }
    
    
}
