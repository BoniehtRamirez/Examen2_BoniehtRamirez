package examen2p2_boniehtramirez;

public class Electrico extends Vehiculo{
    private int coeficiente, motores;
    private double precio;

    public Electrico(int coeficiente, int motores, double precio, String marca, String modelo, String carroceria, long VIN) {
        super(marca, modelo, carroceria, VIN);
        this.coeficiente = coeficiente;
        this.motores = motores;
        this.precio = precio;
    }

    public int getCoeficiente() {
        return coeficiente;
    }

    public void setCoeficiente(int coeficiente) {
        this.coeficiente = coeficiente;
    }

    public int getMotores() {
        return motores;
    }

    public void setMotores(int motores) {
        this.motores = motores;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
        
}