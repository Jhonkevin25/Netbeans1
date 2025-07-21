/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author Jhonk
 */
public class Prueba {
    
    public static void main(String[] args) {
        Vehiculo miCoche = new Coche("Toyota", "Corolla", 2022);
        Vehiculo miMoto = new Moto("Honda", "CBR500R", 2021);

        miCoche.conducir(); 
        miMoto.conducir(); 
    }
}

