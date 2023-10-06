package Double;
public class DoubleLinkedList 
{
    private DoubleNode head;
    private DoubleNode tail;
    private int size;
    
    public DoubleLinkedList()
    {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }
    
    public void setHead(DoubleNode head)
    {
        this.head = head;
    }
    public void setTail(DoubleNode tail)
    {
        this.tail = tail;
    }
    public int getSize()
    {
        return size;
    }
    public DoubleNode getTail()
    {
        return tail;
    }
    public DoubleNode getHead()
    {
        return head;
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
            System.out.print(" [ "+pointer.getData()+" ] ");
            pointer = pointer.getNext();
        }
    }
//============================================================================== PRIMITIVAS
    public void InsertBegin(Object data)
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
    
//============================================================================== EJERCICIOS
    public void Sort()
    {
        DoubleNode left = getHead();
        while (left!=null)
        {
            DoubleNode right = left.getNext();
            while (right!=null)
            {
                if ((int) left.getData() > (int) right.getData())
                {
                    int data = (int) left.getData();
                    left.setData(right.getData());
                    right.setData(data);
                }
                right = right.getNext();
            }
            left = left.getNext();
        }
    }
    
    public void InsertInOrder(Object data)
            //EJERCICIO 9
    {
        this.Sort();
        DoubleNode node = new DoubleNode(data);
        DoubleNode right = getHead().getNext();
        while (right!=null)
        {
            DoubleNode left = right.getPrev();
            if ((int) left.getData() <= (int) node.getData() && (int) node.getData() <= (int) right.getData())
            {
                node.setPrev(left);
                node.setNext(right);
                right.setPrev(node);
                left.setNext(node);
            }
            right = right.getNext();
        }
        size++;
    }
    
}
