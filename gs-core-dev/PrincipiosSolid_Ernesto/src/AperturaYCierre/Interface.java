
package AperturaYCierre;

public interface Interface 
        // EL USO DE INTERFACES PERMITE RESPETAR EL PRINICPIO #2
        // SE PUEDEN ABRIR CLASES QUE EXTIENDAN LOS MISMOS MÉTODOS
        // AL MISMO TIEMPO CADA UNA PUEDE IMPLEMENTAR MÉTODOS ÚNICOS
        // SIN LA NECESIDAD DE CAMBIAR EL CÓDIGO ORIGINAL
{
    public void insertBegin(Object data);
    public void insertFinal(Object data);
    public void insertAtIndex(Object data, int index);
    public void deleteBegin();
    public void deleteFinal();
    public void deleteAtIndex(int index);
    public boolean isEmpty();
}

// POR EJEMPLO, PODRÍAMOS AGREGA EN LA INTERFAZ UN MÉTODO PRINT
// LUEGO EXTENDERLO A TODAS LAS CLASES QUE IMPLEMENTEN DICHA INTERFAZ
