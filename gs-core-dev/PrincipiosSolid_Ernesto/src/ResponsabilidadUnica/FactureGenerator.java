
package ResponsabilidadUnica;

public class FactureGenerator 
// ÚNICA RESPONSABILIDAD:
        // GENERAR UNA FACTURA PARA EL CLIENTE
        
// SE ESTARÍA VIOLANDO EL PRINCIPIO SI DENTRO DE LA CLASE CLIENTE O FACTURA DESARROLLAMOS EL MÉTODO GENERAR FACTURA

{

    public String GenerateFacture(Cliente cliente, Compra compra)
    {
        String facture = "Factura de la compra\n";
        
        facture+= cliente.getName()+"--";
        facture+= cliente.getAge()+" años\n";
        
        facture+=compra.getCantidad()+" productos\n";
        facture+="Total a pagar"+compra.getTotal()+" $";
        
        return facture;
    }
    
    
}
