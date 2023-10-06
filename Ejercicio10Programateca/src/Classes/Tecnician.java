/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

/**
 *
 * @author ernesto
 */
public class Tecnician
{
    private String name;
    private int maxServices;
    private int services;

    public Tecnician(String name) {
        this.name = name;
        this.maxServices = 8;
        this.services = 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMaxServices() {
        return maxServices;
    }

    public void setMaxServices(int maxServices) {
        this.maxServices = maxServices;
    }

    public int getServices() {
        return services;
    }

    public void setServices(int services) {
        this.services = services;
    }
    
}
