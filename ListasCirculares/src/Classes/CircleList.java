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
}
