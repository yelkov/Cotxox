package edu.badpals.cotxox.tarifa;

import edu.badpals.cotxox.carrera.Carrera;

public class Tarifa {
    static final double COSTE_MILLA = 1.35;
    static final double COSTE_MINUTO = 0.35;
    static final double COSTE_MINIMO = 5.0;
    static final byte PORCENTAJE_COMISION = 20;

    public Tarifa(){};

    public double getCosteDistancia(double distancia){
        return this.COSTE_MILLA * distancia;
    }
    public int getCosteTiempo(double tiempo){
        return (int)(this.COSTE_MINUTO * tiempo);
    }
    public double getCosteTotalEsperado(Carrera carrera){
        return 0.0;
    }
}
