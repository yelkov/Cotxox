package edu.badpals.cotxox.conductores;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class PoolConductores {
    List<Conductor> poolConductores = new ArrayList<>();
    public PoolConductores(List<Conductor> poolConductores){
        this.poolConductores = poolConductores;
    };

    public List<Conductor> getPoolConductores() {
        return poolConductores;
    }
    public Conductor asignarConductor(){
        boolean asignado = false;
        List<Conductor> conductores = getPoolConductores();
        Conductor conductor = null;

        while (!asignado){
            Optional<Conductor> posibleConductor = conductores
                    .stream()
                    .filter(c -> !c.isOcupado())
                    .findAny();
            if (posibleConductor.isPresent()){
                conductor = posibleConductor.get();
                conductor.setOcupado(true);
                asignado = true;
            }
        }return conductor;
    }
}
