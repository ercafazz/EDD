/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kosarajutry_;

import javax.swing.JOptionPane;

/**
 *
 * @author ernesto
 */
public class AdjacencyMatrix 
{
    private int vertices;
    private boolean [][] A;

    public AdjacencyMatrix(int vertices) {
        this.vertices = vertices;
        this.A = new boolean[vertices][vertices];
    }

    public int getVertices() {
        return vertices;
    }

    public void setVertices(int vertices) {
        this.vertices = vertices;
    }

    public boolean[][] getMatrix() {
        return A;
    }

    public void setMatrix(boolean[][] matrix) {
        this.A = matrix;
    }
    
    public void AddRelation(int i, int j)
    {
        if (i >= 0 && i < vertices && j >= 0 && j < vertices) 
        {
            A[i][j] = true;
        } else 
        {
            JOptionPane.showMessageDialog(null, "Estás intentando accedeer a un\níndice inválido en la matriz");
        }
    }
    
    public void Show()
    {
        System.out.println("");
        for (int i = 0; i < vertices; i++) 
        {
            for (int j = 0; j < vertices; j++) 
            {
                System.out.print("["+(A[i][j] ? 1 : 0)+"]" + "");
            }
            System.out.println("");
        }
    }
    
    public void AddVertex()
    {
        boolean [][]newA = new boolean[this.getVertices()+1][this.getVertices()+1];
        for (int i = 0; i < vertices; i++) 
        {
            for (int j = 0; j < vertices; j++) 
            {
                newA[i][j] = A[i][j];
            }
        }
        setMatrix(newA);
        vertices++;
    }

    public boolean FindRelation(int user1, int user2) 
    {
        if (A[user1][user2] == true)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    
    public boolean [][] makeACompy()
    {
        boolean [][] matrix = new boolean[this.vertices][this.vertices];
        boolean [][] self = this.getMatrix();
        for (int i = 0; i < this.vertices; i++) 
        {
            for (int j = 0; j < this.vertices; j++) 
            {
                matrix[i][j] = self[i][j];
            }
        }
        return matrix;
    }
}
