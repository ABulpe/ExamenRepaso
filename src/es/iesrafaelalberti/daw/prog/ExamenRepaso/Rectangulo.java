package es.iesrafaelalberti.daw.prog.ExamenRepaso;

public class Rectangulo extends Punto{

    private int ancho;
    private int alto;

    public Rectangulo(int ancho, int alto, int x, int y) throws MyException {
        super(x, y);
        setAlto(alto);
        setAncho(ancho);
    }

    public int getAncho() {
        return ancho;
    }

    public void setAncho(int ancho) throws MyException {
        if (ancho < 0){throw new MyException("4");}
        else if(x + ancho > 800){throw new MyException("5");}
        this.ancho = ancho;
    }



    public void setAlto(int alto) throws MyException {
        if (alto < 0){throw new MyException("4");}
        else if(y + alto > 600){throw new MyException("5");}
        this.alto = alto;

    }

    @Override
    public void dibujar() {
        System.out.println("alto: "+ alto +" ancho: "+ancho+" X: "+x+" Y: "+y);
    }
}
