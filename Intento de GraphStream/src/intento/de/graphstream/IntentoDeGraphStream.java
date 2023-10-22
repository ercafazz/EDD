/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package intento.de.graphstream;

import org.graphstream.graph.*;
import org.graphstream.graph.implementations.SingleGraph;

public class IntentoDeGraphStream 
{
    public static void main(String[] args) {
        
        System.setProperty("org.graphstream.ui", "swing");

        // Crear el grafo
        Graph graph = new SingleGraph("Graph");
        
        String stylesheet = "node { z-index: 1; text-mode: normal; text-alignment: center; text-background-mode: none; text-size: 15; size: 60px; fill-mode: dyn-plain; text-color: white; } edge { z-index: 0; arrow-shape: arrow; fill-mode: dyn-plain; }";

        graph.setAttribute("ui.stylesheet", stylesheet);

        // Agregar nodos al grafo y establecer etiquetas
        Node node1 = graph.addNode("1");
        node1.setAttribute("ui.label", "Valeria");  // Establecer etiqueta para el nodo 1
        
        Node node2 = graph.addNode("2");
        node2.setAttribute("ui.label", "ERNESTO");  // Establecer etiqueta para el nodo 2
        
        Node node3 = graph.addNode("3");
        node3.setAttribute("ui.label", "José");  // Establecer etiqueta para el nodo 1
        
        Node node4 = graph.addNode("4");
        node4.setAttribute("ui.label", "Claudia");  // Establecer etiqueta para el nodo 2
        
        // Agregar aristas si es necesario
        graph.addEdge("A", "1", "2", true);
        graph.addEdge("B", "4", "1", true);
        graph.addEdge("C", "3", "2", true);
        // Visualizar el grafo
        graph.setAttribute("layout.force.stabilization", 10);
        graph.display();
    }
}