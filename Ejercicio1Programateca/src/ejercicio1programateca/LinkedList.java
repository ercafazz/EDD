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
    
    public void DeleteBegin()
    {
        if (isEmpty())
        {
            System.out.println("No hay elementos");
        }
        else
        {
            Node pointer = getHead();
            setHead(pointer.getNext());
            pointer.setNext(null);
            length--;
        }
    }
    
    public void DeleteEnd()
    {
        Node pointer = getHead();
        while (pointer.getNext().getNext()!=null)
        {
            pointer = pointer.getNext();
        }
        pointer.setNext(null);
        length--;
    }
    
    public void Show()
    {
        Node pointer = getHead();
        while (pointer!=null)
        {
            System.out.print(" [ "+pointer.getData()+" ] ");
            pointer=pointer.getNext();
        }
        System.out.println("");
    }
    
    public LinkedList Reverse_And_Delete()
            //EJERCICIO 1 Y 2 
    {
        LinkedList new_list = new LinkedList();
        Node pointer = getHead();
        this.Show();
        System.out.println("");
        while (pointer!=null)
        {
            new_list.InsertBegin(pointer.getData());
            pointer = pointer.getNext();
            this.DeleteBegin();
            this.Show();
            System.out.println("");
        }
        return new_list;
    }
    
    public LinkedList Merge(LinkedList list_B)
            //EJERCICIO 3
    {
        LinkedList list_C = new LinkedList();
        Node pointerA = this.getHead();
        while (pointerA!=null)
        {
            list_C.InsertEnd(pointerA.getData());
            pointerA = pointerA.getNext();
        }
        Node pointerB = list_B.getHead();
        while (pointerB!=null)
        {
            list_C.InsertEnd(pointerB.getData());
            pointerB = pointerB.getNext();
        }
        
        Node left = list_C.getHead();
        while (left!=null)
        {
            Node right = left.getNext();
            while (right!=null)
            {
                if ((int) (left.getData()) > (int) (right.getData()))
                {
                    int leftData = (int) left.getData();
                    int rightData = (int) right.getData();
                    left.setData(rightData);
                    right.setData(leftData);
                }
                right = right.getNext();
            }
            left = left.getNext();
        }
        return list_C;
    }
    
    public LinkedList SumWith (LinkedList b, LinkedList c)
    {
        LinkedList newList= new LinkedList();
        
        Node pointerThis = getHead();
        Node pointerB = b.getHead();
        Node pointerC = c.getHead();
        
        boolean booleanA = true;
        boolean booleanB = true;
        boolean booleanC = true;
        
        while (booleanA==true || booleanB==true || booleanC==true)
        {
            int cont = 0;
            if (pointerThis!=null)
            {
                cont+=(int) pointerThis.getData();
                pointerThis = pointerThis.getNext();
            }
            else    {    booleanA=false;    }   
            
            if (pointerB!=null)
            {
                cont+=(int) pointerB.getData();
                pointerB = pointerB.getNext();
            }
            else    {    booleanB=false;    }     
            
            if (pointerC!=null)
            {
                cont+=(int) pointerC.getData();
                pointerC = pointerC.getNext();
            }
            else    {    booleanC=false;    }     
            
            if (booleanA==false && booleanB==false && booleanC==false)
            {
                break;
            }
            newList.InsertEnd(cont);
        }
        return newList;
    }
}