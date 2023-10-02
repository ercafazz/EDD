package Classes;

public class CircleList 
{
    private CircleNode head;
    private int size;

    public CircleList() {
        this.head = null;
        this.size = 0;
    }

    public CircleNode getHead() {
        return head;
    }

    public void setHead(CircleNode head) {
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
    
    public void InsertBegin(Object data)
    {
        CircleNode node = new CircleNode(data);
        if (isEmpty())
        {
            setHead(node);
        }
        else
        {
            CircleNode last = getHead().getPrev();
            getHead().setPrev(node);
            node.setNext(getHead());
            last.setNext(node);
            node.setPrev(last);
            setHead(node);
        }
        size++;
    }
    
    public void InsertAtEnd(Object data)
    {
        CircleNode node = new CircleNode(data);
        if (isEmpty())
        {
            InsertBegin(data);
        }
        else
        {
            CircleNode last = getHead().getPrev();
            node.setNext(getHead());
            node.setPrev(last);
            last.setNext(node);
            getHead().setPrev(node);
            size++;
        }
    }
    
    public void InsertAtIndex(int index, Object data)
    {
        if (isEmpty())
        {
            InsertBegin(data);
        }
        else
        {
            if (index < 0 || index > getSize())
            {
                System.out.println("\n---ÍNDICE INVALIDO---\n");
            }
            else if (index == getSize())
            {
                InsertAtEnd(data);
            }
            else if (index == 0)
            {
                InsertBegin(data);
            }
            else
            {
                CircleNode node = new CircleNode(data);
                if (index <= getSize()/2)
                {
                    CircleNode prev = getHead();
                    int cont = 0;
                    while (cont < index-1)
                    {
                        prev = prev.getNext();
                        cont++;
                    }
                    CircleNode next = prev.getNext();
                    SetInBetween(prev, node, next);
                }
                else
                {
                    CircleNode next = getHead().getPrev();
                    int cont = getSize()-1;
                    while (cont != index)
                    {
                        next = next.getPrev();
                        cont--;
                    }
                    CircleNode prev = next.getPrev();
                    SetInBetween(prev, node, next);
                }
                size++;
            }
        }
    }
    
    public void DeleteBegin()
    {
        if (isEmpty())
        {
            System.out.println("LISTA VACÍA");
        }
        else
        {
            if (getSize()==1)
            {
                getHead().setNext(null);
                getHead().setPrev(null);
            }
            else
            {
                CircleNode next = getHead().getNext();
                CircleNode prev = getHead().getPrev();
                CircleNode middle = getHead();
                DeleteInBetween(prev,middle,next);
                setHead(next);
            }
            size++;
        }
    }
    
    public void Show()
    {
        CircleNode pointer = getHead();
        do
        {
            System.out.print(" [ "+pointer.getData()+" ] ");
            pointer = pointer.getNext();
        }   while(pointer!=getHead());
    }
    
    public void SetInBetween(CircleNode prev, CircleNode node, CircleNode next)
    {
        prev.setNext(node);
        node.setPrev(prev);
        next.setPrev(node);
        node.setNext(next);
    }
    
    public void DeleteInBetween(CircleNode prev, CircleNode middle, CircleNode next)
    {
        middle.setNext(null);
        middle.setPrev(null);
        prev.setNext(next);
        next.setPrev(prev);
    }
}
