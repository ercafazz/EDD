/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio1programateca;

/**
 *
 * @author ernesto
 */
public class LinkedList 
{
    private Node head;
    private int length;

    public LinkedList() {
        this.head = null;
        this.length = 0;
    }

    public Node getHead() {
        return head;
    }

    public void setHead(Node head) {
        this.head = head;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }
    
    public boolean isEmpty()
    {
        return getHead() == null;
    }
    
    public void InsertBegin(Object data)
    {
        Node node = new Node(data);
        if (isEmpty())
        {
            setHead(node);
        }
        else
        {
            node.setNext(getHead());
            setHead(node);
        }
        length++;
    }
    
    public void InsertEnd(Object data)
    {
        Node node = new Node(data);
        if (isEmpty())
        {
            InsertBegin(data);
        }
        else
        {
            Node pointer = getHead();
            while (pointer.getNext()!=null)
            {
                pointer = pointer.getNext();
            }
            pointer.setNext(node);
        }
        length++;
    }
    
    public void Show()
    {
        Node pointer = getHead();
        while (pointer.getNext()!=null)
        {
            System.out.println(" [ "+pointer.getData()+" ] ");
            pointer=pointer.getNext();
        }
    }
    
    public LinkedList Reverse()
    {
        LinkedList new_list = new LinkedList();
        Node pointer = getHead();
        while (pointer.getNext()!=null)
        {
            new_list.InsertBegin(pointer.getData());
            pointer = pointer.getNext();
        }
        return new_list;
    }
}
