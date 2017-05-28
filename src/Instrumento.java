/**
 * Created by NACHZEHER on 28/05/2017.
 */
public abstract class Instrumento {

    protected enum Nota {DO, RE, MI, FA, SOL, LA, SI}

    protected Nota notas[];
    protected int nNotas;
    static protected int maxNotas = 100;

    public Instrumento(){

        notas = new Nota[maxNotas];
        nNotas = 0;
    }

    public void add(Nota n){
        if(nNotas < notas.length){
            notas[nNotas]=n;
            nNotas++;
        }
    }

    abstract void interpretar();


}
