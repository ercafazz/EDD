/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AperturaYCierre;

/**
 *
 * @author ernesto
 */
public class DoubleNode 
{
    private Object data;
    private DoubleNode next;
    private DoubleNode prev;

    public DoubleNode(Object data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }

    public Object getData() {
        return data;
    }

    public DoubleNode getNext() {
        return next;
    }

    public DoubleNode getPrev() {
        return prev;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public void setNext(DoubleNode next) {
        this.next = next;
    }

    public void setPrev(DoubleNode prev) {
        this.prev = prev;
    }
}
