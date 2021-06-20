package test;

import es.iesrafaelalberti.daw.prog.ExamenRepaso.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GraficoCompuestoTest {

    Circulo myCirculo;
    Punto myPunto;
    Rectangulo myRectangulo;
    GraficoCompuesto myConjunto;

    @BeforeEach
    void setUp() throws MyException {
        myCirculo = new Circulo(10,20,30);
        myRectangulo = new Rectangulo(20,10,30,40);
        myPunto = new Punto(10,15);
        myConjunto = new GraficoCompuesto();
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void añadirGraficoTest(){
        myConjunto.añadirGrafico(myCirculo);
        myConjunto.añadirGrafico(myPunto);
        myConjunto.añadirGrafico(myRectangulo);
        myConjunto.dibujar();
    }

    @Test
    void dibujarTest(){
        myConjunto.añadirGrafico(myRectangulo);
        myConjunto.dibujar();
    }

    @Test
    void moverTest() throws MyException {
        myConjunto.añadirGrafico(myRectangulo);
        myConjunto.dibujar();
        myConjunto.mover(30,40);
        myConjunto.dibujar();
        assert myConjunto.mover(100,100) == true;
        myConjunto.dibujar();
        assert myConjunto.mover(900,900) == false;
        myConjunto.dibujar();

    }


    }


