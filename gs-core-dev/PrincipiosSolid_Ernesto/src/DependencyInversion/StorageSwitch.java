
package DependencyInversion;

public class StorageSwitch 
        //ESTA ES LA CLASE QUE CONTROLA LAS CLASES PERTENECIENTES A
        //LOS DISPOSITIVOS DE ALMACENAMIENTO
{
    public void controlDevice(StorageDevice device) {
        if (device != null) {
            device.readData();
        }
    }
    public void writeDataToDevice(StorageDevice device) {
        if (device != null) {
            device.writeData();
        }
    }
}
