
package SustituciónLiskov;


public class SustituciónLiskov {

    public static void main(String[] args) 
    {
        //DONDE SE ESPERA UN OBJETO DE LA CLASE VEHICULO
        //UTILIZAMOS UN OBJETO DE LA SUBCLASE CARRO
        Vehiculo v = new Carro();
        
        //UTILIZAMOS MÉTODOS DE LA CLASE PADRE
        v.Arrancar();
        
        //TAMBIÉN PODEMOS EXTENDER CON MÉTODOS DE LA SUBCLASE
        ((Carro) v).Frenar();
        
        v.Apagar();
    }
    
}
