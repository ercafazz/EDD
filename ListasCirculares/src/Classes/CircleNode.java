package Classes;

public class CircleNode 
{
    private Object data;
    private CircleNode next;
    private CircleNode prev;

    public CircleNode(Object data) {
        this.data = data;
        this.next = this;
        this.prev = this;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public CircleNode getNext() {
        return next;
    }

    public void setNext(CircleNode next) {
        this.next = next;
    }

    public CircleNode getPrev() {
        return prev;
    }

    public void setPrev(CircleNode prev) {
        this.prev = prev;
    }
    
    
}
