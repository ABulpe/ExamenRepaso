package es.iesrafaelalberti.daw.prog.ExamenRepaso;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class EditorGrafico{

    public static void main(String[] args) throws MyException {

        Circulo circulo = new Circulo(10, 15, 20);
        Rectangulo rectangulo = new Rectangulo(10, 10, 20, 20);
        Punto punto = new Punto(10, 10);
        GraficoCompuesto conjunto = new GraficoCompuesto();
        conjunto.añadirGrafico(circulo);
        conjunto.añadirGrafico(rectangulo);
        conjunto.añadirGrafico(punto);
        conjunto.dibujar();

        System.out.println("Selecciona una de las siguientes opciones: \n 1 - Mover \n 2 - Salir ");
        Scanner entrada = new Scanner(System.in);
        String opcion;
        opcion = entrada.nextLine();
        opcion.toLowerCase();

        switch (opcion) {

            case "mover":
                System.out.println("Introduce la X: ");
                int y;
                int x;
                while (true) {
                    try {
                        x = entrada.nextInt();
                        entrada.nextLine();
                        break;

                    } catch (InputMismatchException e) {
                        entrada.nextLine();
                        System.out.println("Debes introducir un número");

                    }
                }
                System.out.println("Introduce la Y: ");

                while (true) {
                    try {
                        y = entrada.nextInt();
                        entrada.nextLine();
                        break;

                    } catch (InputMismatchException e) {
                        entrada.nextLine();
                        System.out.println("Debes introducir un número");
                    }
                }
                conjunto.mover(x,y);
                conjunto.dibujar();
            case "salir":
                System.out.println();
                System.out.println("Saliendo del programa :C");

        }
    }

}
