package edu.badpals.cotxox.tarifa;

import edu.badpals.cotxox.carrera.Carrera;

public class Tarifa {
    static final double COSTE_MILLA = 1.35d;
    static final double COSTE_MINUTO = 0.35d;
    static final double COSTE_MINIMO = 5.0d;
    static final byte PORCENTAJE_COMISION = 20;

    public Tarifa(){};

    public static double getCosteDistancia(double distancia){
        return COSTE_MILLA * distancia;
    }
    public static double getCosteTiempo(int tiempo){
        return COSTE_MINUTO * tiempo;
    }
    public static double getCosteTotalEsperado(Carrera carrera){
        double costeTotal = getCosteDistancia(carrera.getDistancia()) + getCosteTiempo(carrera.getTiempoEsperado());
        return costeTotal>COSTE_MINIMO? costeTotal : COSTE_MINIMO;
    }
}
