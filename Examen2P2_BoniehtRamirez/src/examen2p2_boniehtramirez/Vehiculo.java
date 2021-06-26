package examen2p2_boniehtramirez;

import java.io.Serializable;

public class Vehiculo implements Serializable{
    private String marca, modelo, carroceria;
    private long VIN;

    public Vehiculo(String marca, String modelo, String carroceria, long VIN) {
        this.marca = marca;
        this.modelo = modelo;
        this.carroceria = carroceria;
        this.VIN = VIN;
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

    public String getCarroceria() {
        return carroceria;
    }

    public void setCarroceria(String carroceria) {
        this.carroceria = carroceria;
    }

    public long getVIN() {
        return VIN;
    }

    public void setVIN(long VIN) {
        this.VIN = VIN;
    }

    @Override
    public String toString() {
        return marca + " " + modelo;
    }
    
}