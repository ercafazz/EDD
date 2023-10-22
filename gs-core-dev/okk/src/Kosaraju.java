import java.util.*;

public class Kosaraju {

    // Clase para representar un nodo de la lista enlazada
    private class Node {
        int value;
        Node next;

        Node(int value) {
            this.value = value;
            this.next = null;
        }
    }

    // Clase para representar una lista enlazada
    private class LinkedList {
        Node head;

        LinkedList() {
            this.head = null;
        }

        void add(int value) {
            Node newNode = new Node(value);
            if (head == null) {
                head = newNode;
                return;
            }

            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }

    public void DFS(int[][] graph, int v, boolean[] visited, LinkedList comp) {
        visited[v] = true;
        comp.add(v);
        for (int i = 0; i < graph.length; i++) {
            if (graph[v][i] == 1 && !visited[i]) {
                DFS(graph, i, visited, comp);
            }
        }
    }

    public LinkedList fillOrder(int[][] graph, boolean[] visited, LinkedList order) {
        int V = graph.length;

        for (int i = 0; i < V; i++) {
            if (!visited[i]) {
                DFS(graph, i, visited, order);
            }
        }
        return order;
    }

    public int[][] transpose(int[][] graph) {
        int V = graph.length;
        int[][] transposeGraph = new int[V][V];

        for (int i = 0; i < V; i++) {
            for (int j = 0; j < V; j++) {
                transposeGraph[i][j] = graph[j][i];
            }
        }
        return transposeGraph;
    }

    public List<LinkedList> getSCComponents(int[][] graph) {
        int V = graph.length;
        boolean[] visited = new boolean[V];
        LinkedList order = new LinkedList();

        fillOrder(graph, visited, order);
        int[][] reverseGraph = transpose(graph);

        visited = new boolean[V];
        Collections.reverse(order);

        List<LinkedList> SCComp = new ArrayList<>();
        Node node = order.head;
        while (node != null) {
            if (!visited[node.value]) {
                LinkedList comp = new LinkedList();
                DFS(reverseGraph, node.value, visited, comp);
                SCComp.add(comp);
            }
            node = node.next;
        }
        return SCComp;
    }
}