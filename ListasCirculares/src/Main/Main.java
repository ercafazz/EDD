package Main;

import Classes.CircleList;

public class Main 
{

    public static void main(String[] args) 
    {
        CircleList list = new CircleList();
        
        for (int i = 90; i > -1; i-=10) 
        {
            list.InsertBegin(i);
        }
        
        System.out.println("LISTA INICIAL");
        list.Show();
        
        System.out.println("\n\nAGREGAR AL FINAL 9999");
        list.InsertAtEnd(9999);
        list.Show();
        
        System.out.println("\n\nAGREGAR 9999 EN EL ÍNDICE 3");
        list.InsertAtIndex(3, 9999);
        list.Show();
        
        System.out.println("\n\nAGREGAR 9999 EN EL ÍNDICE 7");
        list.InsertAtIndex(7, 9999);
        list.Show();
        
        System.out.println("\n\nBORRAR EL PRIMER ELEMENTO");
        list.DeleteBegin();
        list.Show();
        
        System.out.println("\n\nBORRAR EL ÚLTIMO ELEMENTO");
        list.DeleteAtEnd();
        list.Show();
        
        System.out.println("\n\nBORRAR EL INDICE 3");
        list.DeleteAtIndex(3);
        list.Show();
        
        System.out.println("\n\nBORRAR EL ÍNDICE 7");
        list.DeleteAtIndex(7);
        list.Show();
        
        System.out.println("\n");
    }
    
}
