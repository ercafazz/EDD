
package InterfaceSegregation;


public interface MedStudents 
{
    public void AssignAnatomytest();
    public void AssignHistologyTest();
}

// SI UTILIZÁRAMOS UNA INTERFAZ ESTUDIANTE DE PROPÓSITO GENERAL VIOLARÍAMOS EL 
// PRINCIPIO POR ASIGNARLE A LAS CLASES DE TIPO MEDSTUDENT LOS MÉTODOS QUE SÓLO USARÍAN
// LAS CLASES DE TIPO ENGINEERSTUDENT