package Main;

import Classes.LinkedList;

public class Main 
{
    public static void main(String[] args) 
    {
        LinkedList l = new LinkedList();
        l.InsertLast("JUAN");
        l.InsertLast("JOSÉ");
        l.InsertLast("CARLOS");
        l.InsertLast("PEPA");
        l.InsertLast("ELENA");
        l.InsertLast("DANIEL");
        l.Show();
        l.DeleteUser("DANIEL");
        l.Show();
        l.InsertLast("ELENAS");
        l.Show();
    }
}