/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciosprogramateca;

/**
 *
 * @author ernesto
 */
public class ArrayLinkedList 
{
    private Integer head;
    private int size;
    private int maxSize;
    private ArrayNode [] array;

    public ArrayLinkedList(int maxSize) 
    {
        this.head = null;
        this.size = 0;
        this.maxSize = maxSize;
        this.array = new ArrayNode[0];
    }

    public Integer getHead() {
        return head;
    }

    public void setHead(Integer head) {
        this.head = head;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getMaxSize() {
        return maxSize;
    }

    public void setMaxSize(int maxSize) {
        this.maxSize = maxSize;
    }

    public ArrayNode[] getArray() {
        return array;
    }

    public void setArray(ArrayNode[] array) {
        this.array = array;
    }
    
    public void InsertBegin(Object data)
    {
        ArrayNode node = new ArrayNode(data);
        if (isEmpty())
        {
            setArray(new ArrayNode[1]);
            getArray()[0] = node;
            setHead(0);
            size++;
        }
        else
        {
            if (getSize() == getMaxSize())
            {
                System.out.println("LÍMITE ALCANZADO");
            }
            else
            {
                int position = searchSpace();
                if (position != -1)
                {
                    node.setNext(getHead());
                    getArray()[position] = node;
                    setHead(position);
                }
                else
                {
                    ArrayNode [] newArray = new ArrayNode[getSize()+1];
                    for (int i = 0; i < getSize(); i++) 
                    {
                        newArray[i] = getArray()[i];
                    }
                    newArray[newArray.length-1] = node;
                    setArray(newArray);
                    node.setNext(getHead());
                    setHead(newArray.length-1);
                }
                size++;
            }
        }
    }
    
    public void InsertEnd(Object data)
    {
        ArrayNode node = new ArrayNode(data);
        if (isEmpty())
        {
            InsertBegin(data);
        }
        else
        {
            if (getSize()==getMaxSize())
            {
                System.out.println("LISTA LLENA");
            }
            else
            {
                int position = searchSpace();
                if (position != -1)
                {
                    Integer pointer = getHead();
                    while (pointer!=null)
                    {
                        pointer = getArray()[pointer].getNext();
                    }
                    getArray()[pointer].setNext(position);
                    getArray()[position] = node;
                }
                else
                {
                    ArrayNode []newArray = new ArrayNode[getArray().length+1];
                    for (int i = 0; i < getArray().length; i++) 
                    {
                        newArray[i] = getArray()[i];
                    }
                    newArray[newArray.length-1] = node;
                    setArray(newArray);
                    Integer pointer = getHead();
                    while (getArray()[pointer].getNext() != null) {
                    pointer = getArray()[pointer].getNext();
                    }
                    newArray[pointer].setNext(getArray().length-1);
                }
                size++;
            }
        }
    }
    
    public boolean isEmpty()
    {
        return getHead() == null;
    }

    private int searchSpace() 
    {
        for (int i = 0; i < getSize()-1; i++) 
        {
            if (getArray()[i] == null)
            {
                return i;
            }
        }
        return -1;
    }
    
    public void Print()
    {
        Integer pointer = getHead();
        while (pointer != null)
        {
            System.out.print(" [ "+getArray()[pointer].getData()+" ] ");
            pointer = getArray()[pointer].getNext();
        }
        System.out.println("");
    }
        
}
