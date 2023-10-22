
package AperturaYCierre;

public class DoubleLInkedList implements Interface
{
    private DoubleNode head;
    private DoubleNode tail;
    private int size;

    public DoubleLInkedList() {
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
    
    @Override
    public void insertBegin(Object data) 
    {
        DoubleNode node = new DoubleNode(data);
        if (isEmpty())
        {
            setHead(node);
            setTail(node);
        }
        else
        {
            getHead().setPrev(node);
            node.setNext(getHead());
            setHead(node);
        }
        size++;
    }

    @Override
    public void insertFinal(Object data) 
    {
        if (isEmpty())
        {
            insertBegin(data);
        }
        else
        {
            DoubleNode node = new DoubleNode(data);
            getTail().setNext(node);
            node.setPrev(getTail());
            setTail(node);
            size++;
        }
    }

    @Override
    public void insertAtIndex(Object data, int index) 
    {
        if (isEmpty())
        {
            insertBegin(data);
        }
        else
        {
            if (index > getSize() || index < 0)
            {
                System.out.println("INVALID INDEX");
            }
            else if (index == 0)
            {
                insertBegin(data);
            }
            else if (index == getSize())
            {
                insertFinal(data);
            }
            else
            {
                DoubleNode node = new DoubleNode(data);
                if (index <= getSize()/2)
                {
                    DoubleNode pointer = getHead();
                    int cont = 0;
                    while (cont != index-1)
                    {
                        pointer = pointer.getNext();
                        cont++;
                    }
                    DoubleNode left = pointer;
                    DoubleNode right = pointer.getNext();
                    
                    left.setNext(node);
                    node.setPrev(left);
                    right.setPrev(node);
                    node.setNext(right);
                }
                else
                {
                    DoubleNode pointer = getTail();
                    int cont = getSize()-1;
                    while (cont != index)
                    {
                        pointer = pointer.getPrev();
                        cont--;
                    }
                    DoubleNode right = pointer;
                    DoubleNode left = pointer.getPrev();
                    
                    left.setNext(node);
                    node.setPrev(left);
                    right.setPrev(node);
                    node.setNext(right);
                }
                size++;
            }
        }
    }

    @Override
    public void deleteBegin() 
    {
        if (isEmpty())
        {
            System.out.println("LISTA VACÍA");
        }
        else
        {
            if (getHead() == getTail())
            {
                setHead(null);
                setTail(null);
            }
            else
            {
                DoubleNode pointer = getHead();   
                setHead(pointer.getNext());
                getHead().setPrev(null);
                pointer.setNext(null);
            }
            size--;
        }
    }

    @Override
    public void deleteFinal() 
    {
        if (isEmpty())
        {
            System.out.println("LISTA VACÍA");
        }
        else
        {
            if (getHead()==getTail())
            {
                setHead(null);
                setTail(null);
            }
            else
            {
                DoubleNode pointer = getTail().getPrev();
                getTail().setPrev(null);
                pointer.setNext(null);
                setTail(pointer);
            }
            size--;
        }
    }

    @Override
    public void deleteAtIndex(int index) 
    {
        if (isEmpty()) {
            System.out.println("LISTA VACÍA");
        }
        else {
            if (index < 0 || index > getSize()) {
                System.out.println("ÍNDICE INVÁLIDO");
            }
            else if (index == 0) {
                deleteBegin();
            }
            else if (index == getSize()) {
                deleteFinal();
            }
            else {
                if (index <= getSize()/2){
                    DoubleNode pointer = getHead();
                    int cont = 0;
                    while (cont < index-1)
                    {
                        pointer = pointer.getNext();
                        cont++;
                    }
                    DoubleNode left = pointer;
                    DoubleNode middle = pointer.getNext();
                    DoubleNode right = pointer.getNext().getNext();
                    left.setNext(right);
                    right.setPrev(left);
                    middle.setPrev(null);
                    middle.setNext(null);
                }
                else {
                    DoubleNode pointer = getTail();
                    int cont = getSize()-1;
                    while(cont != index)
                    {
                        pointer = pointer.getPrev();
                        cont--;
                    }
                    DoubleNode middle = pointer;
                    DoubleNode left = pointer.getPrev();
                    DoubleNode right = pointer.getNext();
                    left.setNext(right);
                    right.setPrev(left);
                    middle.setPrev(null);
                    middle.setNext(null);
                }
                size--;
            }
        }
    }

    @Override
    public boolean isEmpty() 
    {
        return getHead() == null && getTail() == null;
    }
    
    public void Show()
    {
        DoubleNode pointer = getHead();
        while (pointer != null)
        {
            System.out.print(" [ "+pointer.getData()+" ] ");
            pointer = pointer.getNext();
        }
    }
}
