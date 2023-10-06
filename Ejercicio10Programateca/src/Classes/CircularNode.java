package Classes;

public class CircularNode
{
    private Object data;
    private CircularNode next;
    private CircularNode prev;

    public CircularNode(Object data) {
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

    public CircularNode getNext() {
        return next;
    }

    public void setNext(CircularNode next) {
        this.next = next;
    }

    public CircularNode getPrev() {
        return prev;
    }

    public void setPrev(CircularNode prev) {
        this.prev = prev;
    }

    public void ShowAtributtes() 
    {
        if (this.data instanceof Repair)
        {
            System.out.println("\n================");
            Repair repair = (Repair) this.data;
            System.out.println("Compañía: "+repair.getCompany());
            System.out.println("Modelo: "+repair.getModel());
            System.out.println("Dirección: "+repair.getAdress());
            if (repair.getTec()==null)
            {
                System.out.println("Técnico: no asignado");
            }
            else
            {
                System.out.println("Técnico: "+repair.getTec().getName());
            }
            System.out.println("================\n");
        }
        else if (this.data instanceof Tecnician)
        {
            System.out.println("\n================");
            Tecnician tec = (Tecnician) this.data;
            System.out.println("Nombre: "+tec.getName());
            System.out.println("Servicios: "+tec.getServices());
            System.out.println("================\n");
        }
    }
        
}
