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
        System.out.println("");
        for (int i = 0; i < 19; i++) 
        {
            list.DeleteAtIndex(1);
            list.Show();
            System.out.println("");
        }
    }
    
}
