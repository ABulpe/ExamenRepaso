package test;

import es.iesrafaelalberti.daw.prog.ExamenRepaso.Circulo;
import es.iesrafaelalberti.daw.prog.ExamenRepaso.MyException;
import es.iesrafaelalberti.daw.prog.ExamenRepaso.Rectangulo;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RectanguloTest {

    Rectangulo myRectangulo;
    @BeforeEach
    void setUp() throws MyException {
        myRectangulo = new Rectangulo(10,10,20,20);
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void exceptionTest() throws MyException{
        assertThrows(MyException.class, () -> new Rectangulo(50,50,760,580));
        assertDoesNotThrow(()->myRectangulo);
    }

    @Test
    void moverTest() throws Exception{
        myRectangulo.mover(5,5);
        assertEquals(25,myRectangulo.getX());
        assertEquals(25,myRectangulo.getY());
        assert myRectangulo.mover(900,900) == false;
    }

    @Test
    void getXTest() throws MyException {
        assertEquals(20,myRectangulo.getX());
    }


    @Test
    void DibujarTest()  {
       myRectangulo.dibujar();
    }


}