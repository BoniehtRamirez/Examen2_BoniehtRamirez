package examen2p2_boniehtramirez;

public class HibridoEnchufable extends Vehiculo{
    private int capacidadMaletero, galonesCombustible;

    public HibridoEnchufable(int capacidadMaletero, int galonesCombustible, String marca, String modelo, String carroceria, long VIN) {
        super(marca, modelo, carroceria, VIN);
        this.capacidadMaletero = capacidadMaletero;
        this.galonesCombustible = galonesCombustible;
    }

    public int getCapacidadMaletero() {
        return capacidadMaletero;
    }

    public void setCapacidadMaletero(int capacidadMaletero) {
        this.capacidadMaletero = capacidadMaletero;
    }

    public int getGalonesCombustible() {
        return galonesCombustible;
    }

    public void setGalonesCombustible(int galonesCombustible) {
        this.galonesCombustible = galonesCombustible;
    }
    
}