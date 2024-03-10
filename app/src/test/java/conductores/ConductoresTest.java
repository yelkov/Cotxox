package conductores;

import edu.badpals.cotxox.conductores.Conductor;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ConductoresTest {

    @Test
    public void test_Valoraciones(){
        Conductor conductor = new Conductor("Travis");
        conductor.setValoracion((byte)5);
        conductor.setValoracion((byte)10);
        conductor.setValoracion((byte)7);
        assertEquals(3,conductor.getNumeroValoraciones());
        assertEquals(7.33,conductor.getValoracion(),0.01);

    }
}
