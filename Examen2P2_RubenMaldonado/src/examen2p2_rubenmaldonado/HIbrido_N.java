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
public class HIbrido_N implements Serializable {

    private String marca;
    private String modelo;
    private int vin;
    private String carroceria;
    private int kilometros;
    private int pasajeros;
    private double precio;
    
        private static final long SerialVersionUID=777L;

    public HIbrido_N(String marca, String modelo, int vin, String carroceria, int kilometros, int pasajeros, double precio) {
        this.marca = marca;
        this.modelo = modelo;
        this.vin = vin;
        this.carroceria = carroceria;
        this.kilometros = kilometros;
        this.pasajeros = pasajeros;
        this.precio = precio;
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

    public int getKilometros() {
        return kilometros;
    }

    public void setKilometros(int kilometros) {
        this.kilometros = kilometros;
    }

    public int getPasajeros() {
        return pasajeros;
    }

    public void setPasajeros(int pasajeros) {
        this.pasajeros = pasajeros;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "HIbrido_N{" + "marca=" + marca + ", modelo=" + modelo + ", vin=" + vin + ", carroceria=" + carroceria + ", kilometros=" + kilometros + ", pasajeros=" + pasajeros + ", precio=" + precio + '}';
    }
    
    
    

}
