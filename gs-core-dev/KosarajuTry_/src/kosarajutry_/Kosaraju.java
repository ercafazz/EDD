package kosarajutry_;

public class Kosaraju 
{        
    public LinkedList getSCC(boolean [][] matrix)
    {
        LinkedList visited = new LinkedList();
        visited.Construct(matrix.length);
        LinkedList stack = new LinkedList();
        LinkedList scc = new LinkedList();
                
        //FirstDFS
        for (int vertex = 0; vertex < matrix.length; vertex++) 
        {
            if (!visited.CheckIfVisited(vertex))
            {
                findOrder(vertex, stack, matrix, visited);
            }
        }
        
        //Matriz Transpuesta
        transpose(matrix);
        
        //SecondDFS
        visited.Deconstruct();
        LinkedList currentSCC = new LinkedList();
        while (!stack.isEmpty())
        {
            int vertex = (int) stack.deleteFinal();
            if (!visited.CheckIfVisited(vertex))
            {
                currentSCC.Clear();
                dfs(vertex, matrix, visited, currentSCC);
                if (!currentSCC.isEmpty()) 
                {
                    scc.insertFinal(currentSCC);
                    currentSCC.Show();
                }
            }
        }
        return scc;
    }
    
    public static void findOrder(int vertex, LinkedList stack, boolean [][] matrix, LinkedList visited)
    {
        visited.SetAsVisited(vertex);
        for (int i = 0; i < matrix.length; i++) 
        {
            if ((matrix[vertex][i]) && (!visited.CheckIfVisited(i)))
            {
                findOrder(i, stack, matrix, visited);
            }
        }
        stack.insertFinal(vertex);
    }
    
    public static void transpose(boolean [][] matrix)
    {
        for (int i = 0; i < matrix.length; i++) 
        {
            for (int j = 0; j < matrix.length; j++) 
            {
                if(matrix[i][j])
                {
                    matrix[i][j]=false;
                    matrix[j][i]=true;
                }
            }
        }
    }
    
    public static void dfs(int vertex, boolean [][] matrix, LinkedList visited, LinkedList currentSCC)
    {
        visited.SetAsVisited(vertex);
        currentSCC.insertFinal(vertex);
        
        for (int i = 0; i < matrix.length; i++) 
        {
            if ((matrix[vertex][i]) && (!visited.CheckIfVisited(i)))
            {
                dfs (i, matrix, visited, currentSCC);
            }
        }
    }
}