
package DependencyInversion;

public class HardDrive implements StorageDevice
{

    @Override
    public void readData() {
        System.out.println("Leyendo datos");
    }

    @Override
    public void writeData() {
        System.out.println("Escribiendo datos");
    }
    
}

//MÁS ADELANTE VEREMOS COMO LAL CLASE HARDDRIVE PUEDE SER CONTROLADA