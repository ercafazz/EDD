package Main;

import Classes.DoubleLinkedList;
import Classes.User;

public class Main 
{

    public static void main(String[] args) 
    {
        DoubleLinkedList l = new DoubleLinkedList();
        User user1 = new User("RAMÓN");
        l.Insertuser(user1);
        User user2 = new User("JOSÉ");
        l.Insertuser(user2);
        User user3 = new User("ANDREA");
        l.Insertuser(user3);
        User user4 = new User("EMILIO");
        l.Insertuser(user4);
        User user5 = new User("ANDRÉS");
        l.Insertuser(user5);
        User user6 = new User("JOAQUÍN");
        l.Insertuser(user6);
        User user7 = new User("ISABELLA");
        l.Insertuser(user7);
        l.Show();
        l.DeleteUser("ANDREA");
        System.out.println("");
        l.Show();
        System.out.println("");
    }
    
}
