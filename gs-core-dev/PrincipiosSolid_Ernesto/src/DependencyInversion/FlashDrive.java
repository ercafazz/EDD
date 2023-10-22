
package DependencyInversion;

public class FlashDrive implements StorageDevice
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
