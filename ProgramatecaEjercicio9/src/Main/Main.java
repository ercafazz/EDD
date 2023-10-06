package Main;

import Double.DoubleLinkedList;

public class Main 
{
    public static void main(String[] args) 
    {
        DoubleLinkedList l = new DoubleLinkedList();
//        for (int i = 0; i < 10; i++) 
  //      {
    //        l.InsertBegin(i);
      //  }
        l.InsertBegin(40);
        l.InsertBegin(30);
        l.InsertBegin(60);
        l.InsertBegin(70);
        l.InsertBegin(10);
        l.Show();
        System.out.println("");
        l.InsertInOrder(25);
        l.Show();
    }
    
}
