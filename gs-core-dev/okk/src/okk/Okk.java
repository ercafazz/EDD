/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package okk;

import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author ernesto
 */
public class Okk {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         // Example usage
        int V = 5; // Number of vertices
        int[][] graph = new int[V][V]; // Initialize adjacency matrix
        // Populate adjacency matrix with appropriate edges
        // ...

        Kosaraju k = new Kosaraju();

        List<LinkedList> scComponents = k.getSCComponents(graph);
        System.out.println("Strongly Connected Components: " + scComponents);
    }
    
}
