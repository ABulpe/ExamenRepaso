package test;

import es.iesrafaelalberti.daw.prog.ExamenRepaso.Circulo;
import es.iesrafaelalberti.daw.prog.ExamenRepaso.MyException;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CirculoTest {

    Circulo myCirculo;

    @org.junit.jupiter.api.BeforeEach

    void setUp() throws MyException {
        Circulo myCirculo = new Circulo(10,30,40);

    }

    @org.junit.jupiter.api.AfterEach
    void tearDown() {
    }

    @Test
    void exceptionTest() throws MyException{
        assertThrows(MyException.class, () -> new Circulo(6,7,-4));
        assertDoesNotThrow(()->myCirculo);
    }

    @Test
    void moverTest() throws Exception{
        Circulo otroCirculo = new Circulo(5,10,15);
        otroCirculo.mover(5,5);
        assertEquals(15,otroCirculo.getX());
        assertEquals(20,otroCirculo.getY());
    }

    @Test
    void getXTest() throws MyException {
        Circulo otroCirculo = new Circulo(5,10,15);
        assertEquals(10,otroCirculo.getX());
    }

    @Test
    void getRadioTest() throws MyException {
        Circulo otroCirculo = new Circulo(5,10,15);
        assertEquals(5,otroCirculo.getRadio());
    }
    @Test
    void dibujarTest()throws MyException{
        Circulo otroCirculo = new Circulo(5,10,15);
        otroCirculo.dibujar();
    }

}