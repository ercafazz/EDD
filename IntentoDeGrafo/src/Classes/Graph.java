package Classes;

public class Graph 
{
    private boolean [][] A;

    public Graph(int vertices) {
        A = new boolean[vertices][vertices];
    }

    public boolean[][] getA() {
        return A;
    }

    public void setA(boolean[][] A) {
        this.A = A;
    }
    
    public void AgregarRelacion(int i, int j)
    {
        if (i<0 || i>= A.length || j<0 || j>= A.length || i==j)
        {
            System.out.println("ÍNDICE INVÁLIDO");
        }
        A[i][j] = true;
    }
    
    public boolean FindRelacion(int i, int j)
    {
        return A[i][j];
    }
    
    
}
