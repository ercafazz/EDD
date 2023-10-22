/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SustituciónLiskov;

/**
 *
 * @author ernesto
 */
public class Vehiculo 
{
    private String marca;
    private Double maxSpeed;
    
    public void Arrancar()
    {
        System.out.println("Arrancó el carro");
    }
    
    public void Apagar()
    {
        System.out.println("Se apagó el carro");
    }
}
