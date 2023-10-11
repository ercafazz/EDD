package Classes;

public class DoubleNode 
{
    private DoubleNode prev;
    private DoubleNode next;
    private User user;
    private Integer index;

    public DoubleNode(User user) {
        this.prev = null;
        this.next = null;
        this.user = user;
        this.index = null;
    }

    public DoubleNode getPrev() {
        return prev;
    }

    public void setPrev(DoubleNode prev) {
        this.prev = prev;
    }

    public DoubleNode getNext() {
        return next;
    }

    public void setNext(DoubleNode next) {
        this.next = next;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Integer getIndex() {
        return index;
    }

    public void setIndex(Integer index) {
        this.index = index;
    }
    
    
}
