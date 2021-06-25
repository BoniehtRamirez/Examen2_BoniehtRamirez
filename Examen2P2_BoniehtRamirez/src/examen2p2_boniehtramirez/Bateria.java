package examen2p2_boniehtramirez;

public class Bateria {
    String marca, tipoVehiculo;
    int capacidad, autonomia, modulos, carga, tiempoEnsamblaje;

    public Bateria(String marca, String tipoVehiculo, int capacidad, int autonomia, int modulos, int carga, int tiempoEnsamblaje) {
        this.marca = marca;
        this.tipoVehiculo = tipoVehiculo;
        this.capacidad = capacidad;
        this.autonomia = autonomia;
        this.modulos = modulos;
        this.carga = carga;
        this.tiempoEnsamblaje = tiempoEnsamblaje;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getTipoVehiculo() {
        return tipoVehiculo;
    }

    public void setTipoVehiculo(String tipoVehiculo) {
        this.tipoVehiculo = tipoVehiculo;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public int getAutonomia() {
        return autonomia;
    }

    public void setAutonomia(int autonomia) {
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

    public int getTiempoEnsamblaje() {
        return tiempoEnsamblaje;
    }

    public void setTiempoEnsamblaje(int tiempoEnsamblaje) {
        this.tiempoEnsamblaje = tiempoEnsamblaje;
    }

    @Override
    public String toString() {
        return marca;
    }
    
    
}