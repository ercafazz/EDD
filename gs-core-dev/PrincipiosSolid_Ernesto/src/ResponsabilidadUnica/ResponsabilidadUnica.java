package ResponsabilidadUnica;


public class ResponsabilidadUnica {

    public static void main(String[] args) 
    {
        Cliente cliente = new Cliente("Ernesto", 22);
        Compra compra = new Compra(122.45, 10);
    
        //GENERAMOS LA FACTURA CON UNA CLASE CUYO ÚNICO PROPÓSITO ES ESE
        FactureGenerator fg = new FactureGenerator();
        String facture = fg.GenerateFacture(cliente, compra);
    }
    
}