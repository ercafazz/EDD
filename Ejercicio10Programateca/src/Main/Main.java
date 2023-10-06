package Main;

import Classes.CircularList;
import Classes.CircularNode;
import Classes.Repair;
import Classes.Tecnician;
import java.util.Scanner;

public class Main 
{

    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner (System.in);
        System.out.println("Bienvenido");
        while (true)
        {
            System.out.println("\n\nSe ha iniciado un nuevo día\n\n");
            CircularList repairsList = new CircularList();
            CircularList tecniciansList = new CircularList();
            
            while (true)
            {
                System.out.print("1. Agregar reparación\n2. Agregar técnico\n3. Cerrar el día\n==>> ");
                int opt = scanner.nextInt();
                scanner.nextLine();
                
                if (opt==1)
                    //AGREGAR REPARACIÓN
                {
                    System.out.print("COMPAÑIA: ");
                    String company = scanner.nextLine();
                    System.out.print("MODELO DEL AIRE: ");
                    String model = scanner.nextLine();
                    System.out.print("DIRECCION: ");
                    String adress = scanner.nextLine();
                    
                    Repair repair = new Repair (company, model, adress);
                    repair.setTec(FindTech(tecniciansList));
                    repairsList.InsertBegin(repair);
                    repairsList.Show();
                    
                }
                else if (opt==2)
                    //AGREGAR TÉCNICO
                {
                    System.out.print("NOMBRE: ");
                    String name = scanner.nextLine();
                    
                    Tecnician tec = new Tecnician(name);
                    tecniciansList.InsertBegin(tec);
                    tecniciansList.Show();
                }
                else
                    //CERRAR EL DÍA
                {
                    break;
                }
            }
            System.out.println("Has cerrado el día\n1. Salir del sistema\n2. Iniciar nuevo día\n==>> ");
        }
    }

    private static Tecnician FindTech(CircularList tecniciansList) 
    {
        CircularNode pointer = tecniciansList.getHead();
        
        if (tecniciansList.isEmpty())
        {
            System.out.println("No se agregó ningun técnico porque no hay técnicos agregados");
            return null;
        }
        else
        {
            do
            {
                if (((Tecnician)pointer.getData()).getServices()==8)
                {
                    pointer = pointer.getNext();
                }
                else
                {
                    ((Tecnician) pointer.getData()).setServices(((Tecnician) pointer.getData()).getServices()+1);
                    return (Tecnician) pointer.getData();
                }
            } while (pointer!=tecniciansList.getHead());
            
            return null;
        
        }
        
    }
    
}
