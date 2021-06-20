package es.iesrafaelalberti.daw.prog.ExamenRepaso;

public class Circulo extends Punto{

    private int radio;

    public Circulo(int radio, int x, int y)throws MyException {
        super(x,y);
        setRadio(radio);
    }

    public int getRadio(){

        return radio;
    }

    public void setRadio(int radio) throws MyException {
        if (radio < 0 ){throw new MyException("4");}
        else if(x + radio > 800 || y + radio >600){throw new MyException("3");}
        this.radio = radio;
    }

    @Override
    public void dibujar() {
        System.out.println("radio: "+radio+" X: "+x+" Y: "+y);
    }

}

