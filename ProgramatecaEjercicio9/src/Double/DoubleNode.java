package Double;
public class DoubleNode 
{
    private DoubleNode prev;
    private DoubleNode next;
    private Object data;
    
    public DoubleNode(Object data)
    {
        this.data = data;
        this.prev = null;
        this.next = null;
    }
    
    public void setData(Object data)
    {
        this.data = data;
    }
    public void setNext(DoubleNode next)
    {
        this.next = next;
    }
    public void setPrev(DoubleNode prev)
    {
        this.prev = prev;
    }
    public DoubleNode getNext()
    {
        return next;
    }
    public DoubleNode getPrev()
    {
        return prev;
    }
    public Object getData()
    {
        return data;
    }
    
    
}
