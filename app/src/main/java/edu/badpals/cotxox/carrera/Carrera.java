package edu.badpals.cotxox.carrera;

import edu.badpals.cotxox.conductores.Conductor;
import edu.badpals.cotxox.tarifa.Tarifa;

public class Carrera {
    private String tarjetaCredito = "";
    private String origen = "";
    private String destino = "";
    private double distancia = 0d;
    private int tiempoEsperado = 0;
    private int tiempoCarrera = 0;
    private double costeTotal = 0d;
    private int propina = 0;
    private Conductor conductor = null;

    public Carrera(String tarjetaCredito){
        this.tarjetaCredito = tarjetaCredito;
    }
    public String getTarjetaCredito(){
        return this.tarjetaCredito;
    }

    public String getOrigen() {
        return this.origen;
    }

    public String getDestino() {
        return this.destino;
    }

    public double getDistancia() {
        return this.distancia;
    }

    public int getTiempoEsperado() {
        return this.tiempoEsperado;
    }

    public int getTiempoCarrera() {
        return this.tiempoCarrera;
    }

    public double getCosteTotal() {
        return this.costeTotal;
    }

    public int getPropina() {
        return this.propina;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public void setDistancia(double distancia) {
        this.distancia = distancia;
    }

    public void setTiempoEsperado(int tiempoEsperado) {
        this.tiempoEsperado = tiempoEsperado;
    }

    public void setTiempoCarrera(int tiempoCarrera) {
        this.tiempoCarrera = tiempoCarrera;
    }

    public void setCosteTotal(double costeTotal) {
        this.costeTotal = costeTotal;
    }

    public void setPropina(int propina) {
        this.propina = propina;
    }
    public double getCosteEsperado(){
        return Tarifa.getCosteTotalEsperado(this);
    }

    public Conductor getConductor() {
        return this.conductor;
    }

    public void setConductor(Conductor conductor) {
        this.conductor = conductor;
    }
}
