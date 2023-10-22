package kosarajutry_;

public class KosarajuTry_ 
{
    public static void main(String[] args) 
    {
        AdjacencyMatrix adjMatrix = new AdjacencyMatrix(4);
        
        adjMatrix.AddRelation(1, 3);
        
        adjMatrix.AddRelation(2, 3);
        adjMatrix.AddRelation(2, 0);
        
        adjMatrix.AddRelation(3, 0);
        adjMatrix.AddRelation(3, 2);

        boolean [][] matrix = adjMatrix.getMatrix();
        Kosaraju k = new Kosaraju();
        LinkedList scc = k.getSCC(matrix);
    }
}
