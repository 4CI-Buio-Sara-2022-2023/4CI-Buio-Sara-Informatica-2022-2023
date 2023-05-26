
/**
 * Aggiungi qui una descrizione della classe Banca
 * 
 * @author (il tuo nome) 
 * @version (un numero di versione o una data)
 */
import java.util.ArrayList;
import javax.swing.*;

public class Banca {
    private ArrayList<Conto>listaConti;
    public static int numeroConti;
    
    public Banca(){
        this.listaConti=new ArrayList<Conto>();
    }

    public Conto getLastCont(){
        return listaConti.get(listaConti.size()-1);
    }

    public void aggiungiConto(Conto c){
        this.listaConti.add(c);
    }

    public String toString() {
        String out="conti: \n";
        for(Conto c: listaConti){
           out+="\n"+c.toString();
        }
        return out;
    }
}