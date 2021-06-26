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
public class Bateria implements Serializable {

    private String marca;
    private int capacidad;
    private String autonomia;
    private int modulos;
    private int carga;
    private String tipo;
    private int tiempo;

    private static final long SerialVersionUID = 777L;

    public Bateria(String marca, int capacidad, String autonomia, int modulos, int carga, String tipo, int tiempo) {
        this.marca = marca;
        this.capacidad = capacidad;
        this.autonomia = autonomia;
        this.modulos = modulos;
        this.carga = carga;
        this.tipo = tipo;
        this.tiempo = tiempo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public String getAutonomia() {
        return autonomia;
    }

    public void setAutonomia(String autonomia) {
        this.autonomia = autonomia;
    }

    public int getModulos() {
        return modulos;
    }

    public void setModulos(int modulos) {
        this.modulos = modulos;
    }

    public int getCarga() {
        return carga;
    }

    public void setCarga(int carga) {
        this.carga = carga;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getTiempo() {
        return tiempo;
    }

    public void setTiempo(int tiempo) {
        this.tiempo = tiempo;
    }

    @Override
    public String toString() {
        return "Bateria{" + "marca=" + marca + ", capacidad=" + capacidad + ", autonomia=" + autonomia + ", modulos=" + modulos + ", carga=" + carga + ", tipo=" + tipo + ", tiempo=" + tiempo + '}';
    }

}
