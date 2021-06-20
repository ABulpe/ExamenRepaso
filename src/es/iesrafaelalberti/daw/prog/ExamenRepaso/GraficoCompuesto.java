package es.iesrafaelalberti.daw.prog.ExamenRepaso;

import java.util.ArrayList;

import java.util.List;

public class GraficoCompuesto implements Grafico{

    private List<Grafico> conjunto;

    public GraficoCompuesto(){
        this.conjunto = new ArrayList<Grafico>();
    }

    public List<Grafico> getConjunto() {
        return conjunto;
    }

    public void setConjunto(ArrayList<Grafico> conjunto) {
        this.conjunto = conjunto;
    }

    public void añadirGrafico(Grafico grafico){
        conjunto.add(grafico);
    }

    public void eliminarGrafico(Grafico grafico){
        conjunto.remove(grafico);
    }

    @Override
    public boolean mover(int x, int y) throws MyException {

        for(Grafico grafico: conjunto){

            if(!grafico.mover(x, y)) return false;

        }
        return true;
    }

    @Override
    public void dibujar() {
        for(Grafico grafico : conjunto){
            grafico.dibujar();

        }
    }
}
