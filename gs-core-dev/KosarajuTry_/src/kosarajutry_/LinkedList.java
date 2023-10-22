package kosarajutry_;

public class LinkedList 
{
    private Node head;
    private int length;

    public LinkedList() {
        this.head = null;
        this.length = 0;
    }

    public void setHead(Node head) {
        this.head = head;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public Node getHead() {
        return head;
    }

    public int getLength() {
        return length;
    }
    
    public boolean isEmpty() {
        return getHead() == null;
    }
    public void insertBegin(Object data) 
    {
        if (Exist(data))
        {
        }
        else
        {
            Node nodo = new Node(data);
            if (isEmpty())
            {
                setHead(nodo);
            } 
            else 
            {
                nodo.setNext(getHead());
                setHead(nodo);
            }
            length++;
        }
    }
    
    public void insertFinal(Object data) {

            Node nodo = new Node(data);
        if (isEmpty()){
            setHead(nodo);
        } else {
            Node pointer = getHead();
            while (pointer.getNext() != null) {
                pointer = pointer.getNext();
            }
            pointer.setNext(nodo);
        }
        length++;

    }
    
    public Object deleteFinal() {
    if (isEmpty()) {
        System.out.println("La lista está vacía");
        return null;
    } else if (getHead().getNext() == null) {
        // Solo hay un elemento en la lista, eliminar la cabeza
        Node temp = getHead();
        setHead(null);
        length--;
        return temp.getData();
    } else {
        Node pointer = getHead();
        while (pointer.getNext().getNext() != null) {
            pointer = pointer.getNext();
        }
        Node temp = pointer.getNext();
        pointer.setNext(null);
        length--;
        return temp.getData();
    }
}

    
    public void Show()
    {
        Node pointer = getHead();
        while (pointer!=null)
        {
            System.out.print(" ["+pointer.getData()+"] ");
            pointer = pointer.getNext();
        }
        System.out.println("");
    }
    
    public boolean contains(Object data)
    {
        if (isEmpty())
        {
            return false;
        }
        else
        {
            Node pointer = getHead();
            while (pointer!=null)
            {
                if ((int) pointer.getData()==(int) data)
                {
                    return true;
                }
                pointer = pointer.getNext();
            }
            return false;
        }
        
    }
    
    public boolean Exist(Object data)
    {
        Node pointer = getHead();
        while (pointer!=null)
        {
            if (pointer.getData()==data)
            {
                return true;
            }
            pointer = pointer.getNext();
        }
        return false;
    }
    
    public void SetAsVisited(int index)
    {
        if (isEmpty())
        {
            
        }
        else
        {
            int cont = 0;
            Node pointer = getHead();
            
            while (cont!=index)
            {
                pointer = pointer.getNext();
                cont++;
            }
            pointer.setData(true);
        }
    }

    public boolean CheckIfVisited(int vertex) 
    {
        Node pointer = getHead();
        int cont = 0;
        while (cont != vertex)
        {
            pointer = pointer.getNext();
            cont++;
        }
        return (boolean) pointer.getData();
    }

    public void Construct(int length)
    {
        boolean b = false;
        int cont = 1;
        while (cont<=length)
        {
            Node node = new Node(null);
            insertFinal(node);
            cont++;
        }
        Node pointer = getHead();
        while (pointer!=null)
        {
            pointer.setData(b);
            pointer = pointer.getNext();
        }
    }

    public void Deconstruct() 
    {
        Node pointer = getHead();
        while (pointer!=null)
        {
            pointer.setData(false);
            pointer = pointer.getNext();
        }
    }
    
    public void Clear()
    {
        this.setHead(null);
        this.length = 0;
    }
}