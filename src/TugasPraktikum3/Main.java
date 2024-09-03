/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TugasPraktikum3;

/**
 *
 * @author ASUS
 */

public class Main {
    public static void main(String[] args) {
        Mobil mobil1 = new Mobil("Toyota", "Corolla", 2020, "Merah");
        Mobil mobil2 = new Mobil("Honda", "Civic", 2019, "Biru");

        mobil1.displayInfo();
        mobil1.startEngine();

        mobil2.displayInfo();
        mobil2.startEngine();
    }
}


