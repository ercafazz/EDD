package Classes;

public class DoubleLinkedList 
{
    private DoubleNode head;
    private DoubleNode tail;
    private int size;

    public DoubleLinkedList() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    public DoubleNode getHead() {
        return head;
    }

    public void setHead(DoubleNode head) {
        this.head = head;
    }

    public DoubleNode getTail() {
        return tail;
    }

    public void setTail(DoubleNode tail) {
        this.tail = tail;
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
    
    public void Show()
    {
        DoubleNode pointer = getHead();
        while (pointer!=null)
        {
            System.out.print(" ["+((User) pointer.getUser()).getUser()+", "+pointer.getIndex()+"]");
            pointer = pointer.getNext();
        }
    }
    
    public int FindUser(String user)
    {
        DoubleNode pointer = getHead();
        while (pointer!=null)
        {
            if (pointer.getUser().getUser().equals(user))
            {
                return 1;
            }
            pointer = pointer.getNext();
        }
        return -1;
    }
    
    public void Insertuser(User user)
    {
        int found = FindUser(user.getUser());
        if (found==1)
        {
            System.out.println("YA EXISTE ESTE USUARIO");
        }
        else
        {
            DoubleNode node = new DoubleNode(user);
            if (isEmpty())
            {
                setHead(node);
                setTail(node);
                node.setIndex(0);
            }
            else
            {
                getTail().setNext(node);
                node.setPrev(getTail());
                setTail(node);
                node.setIndex((node.getPrev()).getIndex()+1);
            }
            size++;
        }
    }
    
    public void DeleteUser(String user)
     {
        int found = FindUser(user);
        if (found==1)
        {
            DoubleNode pointer = getHead();
            while (pointer!=null)
            {
                if (pointer.getNext().getUser().getUser().equals(user))
                {
                    DoubleNode left = pointer;
                    DoubleNode middle = pointer.getNext();
                    DoubleNode right = middle.getNext();
                    
                    left.setNext(right);
                    right.setPrev(left);
                    middle.setPrev(null);
                    middle.setNext(null);
                    break;
                }
                pointer = pointer.getNext();
            }
            pointer = pointer.getNext();
            while(pointer!=null)
            {
                pointer.setIndex(pointer.getIndex()-1);
                pointer = pointer.getNext();
            }
        }
        else
        {
            System.out.println("USUARIO NO ENCONTRADO");
        }
    }
}
