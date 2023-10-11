/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio1programateca;

import java.util.Scanner;

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
        LinkedList l = new LinkedList();
        for (int i = 1; i < 10; i++) 
        {
            l.InsertBegin(i);
        }
        LinkedList n = new LinkedList();
        for (int i = 4; i < 100; i+=7) 
        {
            n.InsertBegin(i);
        }
        LinkedList m = new LinkedList();
        for (int i = 20; i < 25; i+=2) 
        {
            m.InsertBegin(i);
        }
        l.Show();
        System.out.println("");
        n.Show();
        System.out.println("");
        m.Show();
        LinkedList z = l.SumWith(m, n);
        z.Show();
    }
}