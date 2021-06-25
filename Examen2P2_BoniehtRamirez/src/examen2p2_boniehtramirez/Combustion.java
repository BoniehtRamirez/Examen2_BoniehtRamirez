package examen2p2_boniehtramirez;

public class Combustion extends Vehiculo{
    private int cilindradaMotor, cilindrosMotor, consumoCombustible;

    public Combustion(int cilindradaMotor, int cilindrosMotor, int consumoCombustible, String marca, String modelo, String carroceria, long VIN) {
        super(marca, modelo, carroceria, VIN);
        this.cilindradaMotor = cilindradaMotor;
        this.cilindrosMotor = cilindrosMotor;
        this.consumoCombustible = consumoCombustible;
    }

    public int getCilindradaMotor() {
        return cilindradaMotor;
    }

    public void setCilindradaMotor(int cilindradaMotor) {
        this.cilindradaMotor = cilindradaMotor;
    }

    public int getCilindrosMotor() {
        return cilindrosMotor;
    }

    public void setCilindrosMotor(int cilindrosMotor) {
        this.cilindrosMotor = cilindrosMotor;
    }

    public int getConsumoCombustible() {
        return consumoCombustible;
    }

    public void setConsumoCombustible(int consumoCombustible) {
        this.consumoCombustible = consumoCombustible;
    }
    
}