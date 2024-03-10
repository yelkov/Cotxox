package edu.badpals.cotxox.tarifa;

import edu.badpals.cotxox.carrera.Carrera;

public class Tarifa {
    static final double COSTE_MILLA = 1.35;
    static final double COSTE_MINUTO = 0.35;
    static final double COSTE_MINIMO = 5.0;
    static final byte PORCENTAJE_COMISION = 20;

    public Tarifa(){};

    public static double getCosteDistancia(double distancia){
        return COSTE_MILLA * distancia;
    }
    public static int getCosteTiempo(double tiempo){
        return (int)(COSTE_MINUTO * tiempo);
    }
    public static double getCosteTotalEsperado(Carrera carrera){
        double costeTotal = getCosteDistancia(carrera.getDistancia()) + getCosteTiempo(carrera.getTiempoEsperado());
        return costeTotal>COSTE_MINIMO? costeTotal : COSTE_MINIMO;
    }
}
