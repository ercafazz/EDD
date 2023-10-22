
package ResponsabilidadUnica;

public class Compra 
{
    private Double total;
    private int cantidad;

    public Compra(Double total, int cantidad) {
        this.total = total;
        this.cantidad = cantidad;
    }

    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    
    
}
