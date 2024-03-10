package edu.badpals.cotxox.conductores;

import java.util.ArrayList;

public class Conductor {
    private String nombre = "";
    private String modelo = "";
    private String matricula = "";
    private double valoracionMedia = 0.0d;
    private boolean ocupado = false;
    private ArrayList<Byte> valoraciones = new ArrayList<>();

    public Conductor(){};

    public Conductor(String nombre){
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public double getValoracion() {
        return this.calcularValoracionMedia();
    }
    public int getNumeroValoraciones(){
        return this.valoraciones.size();
    }

    public void setValoracion(byte valoracion) {
        this.valoraciones.add(valoracion);
    }

    public void setOcupado(boolean ocupado) {
        this.ocupado = ocupado;
    }
    public boolean isOcupado() {
        return this.ocupado;
    }
    private double calcularValoracionMedia(){
        double media = this.valoraciones
                        .stream()
                        .mapToDouble(b -> b)
                        .average()
                        .orElse(0.0);
        return media;
    }
}
