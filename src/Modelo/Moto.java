/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author Jhonk
 */
public class Moto extends Vehiculo{
    
    public Moto(String marca, String modelo, int año) {
        super(marca, modelo, año);
    }
    
     @Override
    public void conducir() {
        System.out.println("Conduciendo una moto " + getMarca() + " " + getModelo());
    }
}
