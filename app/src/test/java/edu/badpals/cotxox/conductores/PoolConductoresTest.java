package edu.badpals.cotxox.conductores;

import edu.badpals.cotxox.carrera.Carrera;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static java.lang.System.in;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class PoolConductoresTest {

    @Test
    public void testAsignarConductor(){
        String tarjetaCredito = "4916119711304546";
        Carrera carrera = new Carrera(tarjetaCredito);

        List<Conductor> poolConductores = new ArrayList<Conductor>();
        Conductor conductor = null;

        String[] nombres = { "Samantha", "Fox", "Mola" };
        for (String nombre : nombres) {
            conductor = new Conductor(nombre);
            poolConductores.add(conductor);
        }
        PoolConductores conductores = new PoolConductores(poolConductores);
        Conductor conductorAsignado = conductores.asignarConductor();
        assertTrue(Arrays.asList(nombres).contains(conductorAsignado.getNombre()));


    }
}
