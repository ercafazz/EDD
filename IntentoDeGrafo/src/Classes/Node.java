package Classes;
//ESTOY PROBANDO EL GIT MERGE

public class Node 
{
    private Node next;
    private Object data;
    private Integer index;

    public Node(Object data) 
    {
        this.next = null;
        this.data = data;
        this.index = null;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }    
    
    
    
}
