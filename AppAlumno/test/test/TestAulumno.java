
package test;

import appalumno.Alumno;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Usuario
 */
public class TestAulumno {
    
    public TestAulumno() {
    }
    
    @Test
    public void probarPromedio(){
        Alumno alumno = new Alumno("001", "Pepe", 18.00, 16.00);
        double resultado;
        resultado= alumno.calcularPromedio();
        assertEquals((18+16)/2, resultado, 0.00);
    }
}
