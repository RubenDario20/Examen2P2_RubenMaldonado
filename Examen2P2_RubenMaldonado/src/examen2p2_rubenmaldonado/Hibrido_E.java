/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen2p2_rubenmaldonado;

import java.io.Serializable;

/**
 *
 * @author Ruben Dario Arias
 */
public class Hibrido_E implements Serializable {
        private String marca; 
    private String modelo;
    private int vin;
    private String carroceria;
    private int maletero;
    private int galones;
    
        private static final long SerialVersionUID=777L;

    public Hibrido_E(String marca, String modelo, int vin, String carroceria, int maletero, int galones) {
        this.marca = marca;
        this.modelo = modelo;
        this.vin = vin;
        this.carroceria = carroceria;
        this.maletero = maletero;
        this.galones = galones;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getVin() {
        return vin;
    }

    public void setVin(int vin) {
        this.vin = vin;
    }

    public String getCarroceria() {
        return carroceria;
    }

    public void setCarroceria(String carroceria) {
        this.carroceria = carroceria;
    }

    public int getMaletero() {
        return maletero;
    }

    public void setMaletero(int maletero) {
        this.maletero = maletero;
    }

    public int getGalones() {
        return galones;
    }

    public void setGalones(int galones) {
        this.galones = galones;
    }

    @Override
    public String toString() {
        return "Hibrido_E{" + "marca=" + marca + ", modelo=" + modelo + ", vin=" + vin + ", carroceria=" + carroceria + ", maletero=" + maletero + ", galones=" + galones + '}';
    }
    
    
}
