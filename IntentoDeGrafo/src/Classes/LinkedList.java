package Classes;

public class LinkedList 
{
    private Node head;
    private int size;

    public LinkedList() 
    {
        this.head = null;
        this.size = 0;
    }

    public Node getHead() {
        return head;
    }

    public void setHead(Node head) {
        this.head = head;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
    
    public boolean isEmpty()
    {
        return getHead() == null;
    }
    
    public void InsertLast(String user)
    {
        int value = FindUser(user);
        if (value==1)
        {
            System.out.println("Este usuario ya existe");
        }
        else
        {
            Node node = new Node(user);
            if (isEmpty())
            {
                setHead(node);
                node.setIndex(0);
            }
            else
            {
                int index = getSize();
                Node pointer = getHead();
                while (pointer.getNext()!=null)
                {
                    pointer = pointer.getNext();
                }
                pointer.setNext(node);
                node.setIndex(index);
            }
            size++;
        }
    }
    
    public void Show()
    {
        Node pointer = getHead();
        while (pointer!=null)
        {
            System.out.print(" ["+pointer.getData()+", "+pointer.getIndex()+"]");
            pointer = pointer.getNext();
        }
        System.out.println("");
    }
    
    public void DeleteUser(String user)
    {
        int value = FindUser(user);
        if (value == -1)
        {
            System.out.println("USUARIO NO ENCONTRADO");
        }
        else
        {
            Node pointer = getHead();
            while (pointer!=null)
            {
                if (pointer.getNext().getData().equals(user))
                {
                    Node aux = pointer.getNext().getNext();
                    pointer.getNext().setNext(null);
                    pointer.setNext(aux);
                    break;
                }
                pointer = pointer.getNext();
            }
            pointer = pointer.getNext();
            while (pointer!=null)
            {
                pointer.setIndex(pointer.getIndex()-1);
                pointer = pointer.getNext();
            }
        }
    }
    
    public int FindUser(String user)
    {
        Node pointer = getHead();
        while (pointer!=null)
        {
            if (pointer.getData().equals(user))
            {
                return 1;
            }
            pointer = pointer.getNext();
        }
        return -1;
    }
    
}
