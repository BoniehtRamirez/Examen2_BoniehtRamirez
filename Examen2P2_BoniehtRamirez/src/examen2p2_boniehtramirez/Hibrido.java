package examen2p2_boniehtramirez;

public class Hibrido extends Vehiculo{
    private int kilometros, pasajeros;
    private double precio;

    public Hibrido(int kilometros, int pasajeros, double precio, String marca, String modelo, String carroceria, long VIN) {
        super(marca, modelo, carroceria, VIN);
        this.kilometros = kilometros;
        this.pasajeros = pasajeros;
        this.precio = precio;
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

    
}
