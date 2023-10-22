/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AperturaYCierre;

/**
 *
 * @author ernesto
 */
public class LinkedList implements Interface
{
    private Node head;
    private int length;

    public LinkedList() {
        this.head = null;
        this.length = 0;
    }

    public void setHead(Node head) {
        this.head = head;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public Node getHead() {
        return head;
    }

    public int getLength() {
        return length;
    }
    
    @Override
    public boolean isEmpty() {
        return getHead() == null;
    }
    
    @Override
    public void insertBegin(Object data) {
        Node nodo = new Node(data);
        if (isEmpty()){
            setHead(nodo);
        } else {
            nodo.setNext(getHead());
            setHead(nodo);
        }
        length++;
    }
    
    @Override
    public void insertFinal(Object data) {
        Node nodo = new Node(data);
        if (isEmpty()){
            setHead(nodo);
        } else {
            Node pointer = getHead();
            while (pointer.getNext() != null) {
                pointer = pointer.getNext();
            }
            pointer.setNext(nodo);
        }
        length++;
    }
    
    @Override
    public void insertAtIndex(Object data, int index) {
        Node nodo = new Node(data);
        if (isEmpty() || index == 0){
            insertBegin(data);
        } else {
            if (index < getLength()) {
                Node pointer = getHead();
                int cont = 0;
                while (cont < index - 1) {
                    pointer = pointer.getNext();
                    cont++;
                }
                Node temp = pointer.getNext();
                nodo.setNext(temp);
                pointer.setNext(nodo);
                length++;
            } else if (index == getLength()) {
                insertFinal(data);
            } else {
                System.out.println("Index not valid");
            }
        }
    }
    
    @Override
    public void deleteBegin() 
    {
        if(isEmpty()) {
            System.out.println("La lista esta vacia");
        } else {
            Node pointer = getHead();
            setHead(pointer.getNext());
            pointer.setNext(null);
            length--;
        }
    }
    
    @Override
    public void deleteFinal() {
        if(isEmpty()) {
            System.out.println("La lista esta vacia");
        } else {
            Node pointer = getHead();
            while (pointer.getNext().getNext() != null) {
                pointer = pointer.getNext();
            }
            Node temp = pointer.getNext();
            pointer.setNext(null);
            length--;
        }
    }
    
    @Override
    public void deleteAtIndex(int index) {
        if(isEmpty()) {
            System.out.println("La lista esta vacia");
        } else {
            if (index == 0){
            } else {
                if (index < getLength()) {
                    Node pointer = getHead();
                    int cont = 0;
                    while (cont != index - 1) {
                        pointer = pointer.getNext();
                        cont++;
                    }
                    Node temp = pointer.getNext();
                    pointer.setNext(temp.getNext());
                    temp.setNext(null);
                    length--;
                } else if (index == getLength()) {
                } else {
                    System.out.println("Index not valid");
                }
            }
        }
    }
    
    public void Show() {
        Node pointer = getHead();
        while (pointer != null) {
            System.out.print(" [ " + pointer.getData() + " ] ");
            pointer = pointer.getNext();
        }
    }
}
