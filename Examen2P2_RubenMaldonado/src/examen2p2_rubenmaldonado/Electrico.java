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
public class Electrico implements Serializable{

    private String marca;
    private String modelo;
    private int vin;
    private String carroceria;
    private String coeficiente;
    private int cantidad_motores;
    private int recarga;
    
        private static final long SerialVersionUID=777L;

    public Electrico(String marca, String modelo, int vin, String carroceria, String coeficiente, int cantidad_motores, int recarga) {
        this.marca = marca;
        this.modelo = modelo;
        this.vin = vin;
        this.carroceria = carroceria;
        this.coeficiente = coeficiente;
        this.cantidad_motores = cantidad_motores;
        this.recarga = recarga;
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

    public String getCoeficiente() {
        return coeficiente;
    }

    public void setCoeficiente(String coeficiente) {
        this.coeficiente = coeficiente;
    }

    public int getCantidad_motores() {
        return cantidad_motores;
    }

    public void setCantidad_motores(int cantidad_motores) {
        this.cantidad_motores = cantidad_motores;
    }

    public int getRecarga() {
        return recarga;
    }

    public void setRecarga(int recarga) {
        this.recarga = recarga;
    }

    @Override
    public String toString() {
        return "Electrico{" + "marca=" + marca + ", modelo=" + modelo + ", vin=" + vin + ", carroceria=" + carroceria + ", coeficiente=" + coeficiente + ", cantidad_motores=" + cantidad_motores + ", recarga=" + recarga + '}';
    }
    
    
    

}
