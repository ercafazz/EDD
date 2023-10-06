package Classes;

public class CircularList 
{
    private CircularNode head;
    private int size;

    public CircularList() {
        this.head = null;
        this.size = 0;
    }

    public CircularNode getHead() {
        return head;
    }

    public void setHead(CircularNode head) {
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
    
    public void Show()
    {
        if (getSize()==0)
        {
            System.out.println("No hay elementos en esta lista");
        }
        else
        {
            System.out.print("\nLISTA");
            CircularNode pointer = getHead();
            do
            {
                pointer.ShowAtributtes();
                pointer = pointer.getNext();
            } while (pointer!=getHead());
        }
    }
    
    public void InsertBegin(Object data) 
    {
        CircularNode node = new CircularNode(data);
        if (isEmpty())
        {
            setHead(node);
        }
        else
        {
            CircularNode first = getHead();
            CircularNode last = getHead().getPrev();
            node.setNext(first);
            node.setPrev(last);
            last.setNext(node);
            first.setPrev(node);
            setHead(node);
        }
        size++;
    }
}
