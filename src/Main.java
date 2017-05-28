import javax.jws.soap.SOAPBinding;

/**
 * Created by NACHZEHER on 28/05/2017.
 */
public class Main {

    public static void main(String[] args) {

        Campana c = new Campana();
        c.add(Instrumento.Nota.DO);
        c.add(Instrumento.Nota.RE);
        c.add(Instrumento.Nota.MI);
        c.add(Instrumento.Nota.FA);
        c.add(Instrumento.Nota.SOL);
        c.add(Instrumento.Nota.LA);
        c.add(Instrumento.Nota.SI);
        c.interpretar();

        System.out.println(c);

        Piano p = new Piano();
        p.add(Instrumento.Nota.DO);
        p.add(Instrumento.Nota.RE);
        p.add(Instrumento.Nota.MI);
        p.add(Instrumento.Nota.FA);
        p.add(Instrumento.Nota.SOL);
        p.add(Instrumento.Nota.LA);
        p.add(Instrumento.Nota.SI);
        p.interpretar();

        System.out.println(p);
    }
}

