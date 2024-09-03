/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TugasPraktikum3;

/**
 *
 * @author ASUS
 */

public class Mobil {
    private String merk;
    private String model;
    private int tahun;
    private String warna;

    // Constructor
    public Mobil(String merk, String model, int tahun, String warna) {
        this.merk = merk;
        this.model = model;
        this.tahun = tahun;
        this.warna = warna;
    }

    // Method to display information

    
        // Getter and Setter for merk
    public String getMerk() {
        return merk;
    }

    public void setMerk(String merk) {
        this.merk = merk;
    }

    // Getter and Setter for model
    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    // Getter and Setter for tahun
    public int getTahun() {
        return tahun;
    }

    public void setTahun(int tahun) {
        this.tahun = tahun;
    }
    // Getter and Setter for warna
    public String getWarna() {
        return warna;
    }

    public void setWarna(String warna) {
        this.warna = warna;
    }

    // Method to display information
    public void displayInfo() {
        System.out.println("Merk: " + merk + ", Model: " + model + ", Tahun: " + tahun + ", Warna: " + warna);
    }
    // Method to start the engine
    public void startEngine() {
        System.out.println("Mesin mobil " + merk + " menyala");
    }

}

