package es.iesrafaelalberti.daw.prog.ExamenRepaso;

public class Punto implements Grafico {

    protected int x;
    protected int y;


    public Punto(int x, int y) throws MyException {
        setX(x);
        setY(y);
    }

    public int getX() {
        return x;
    }

    public void setX(int x) throws MyException {
        if(x>800 || x<0){throw new MyException("1");}
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) throws MyException {
        if(y>600 || y<0){throw new MyException("2");}
        this.y = y;
    }


    @Override
    public boolean mover(int x, int y){
        try {
            setX(this.x+x);
            setY(this.y+y);
            return true;

        }catch (MyException e){
            return false;
        }
    }

    @Override
    public void dibujar() {
        System.out.println("Las coordenadas son: "+x+", "+y);
    }


}
