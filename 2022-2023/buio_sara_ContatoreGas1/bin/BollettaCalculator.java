/**
 * Aggiungi qui una descrizione della classe BollettaCalculator
 * 
 * @author Sara Buio 
 * @version (un numero di versione o una data)
 */
import java.util.*;
public class BollettaCalculator{
    Scanner in = new Scanner(System.in);
    private ContatoreGas contGas;
    public static final double VALORE_MAX = 9999.9;
    public BollettaCalculator(){
        this.contGas = new ContatoreGas();
    }
    public void start(){
        this.descrizioneApp();
        this.inputDati();
        this.visualizzaRisultati();
    }
    public void descrizioneApp(){
        System.out.println("Questa applicazione, dopo aver cacolato il costo della bolletta del mese precedente e quella dei due precedenti, confronta i due valori e dice quale è stata la più economica.");
    }
    public void inputDati(){
        System.out.println("Dimmi il costo del gas al kw della tua zona: ");
        contGas.setPrezzoalkw(in.nextDouble());
        System.out.println("Quanti kw hai consumato nell'ultimo mese? ");
        contGas.setQuantikw1(in.nextDouble(), this.VALORE_MAX);
        System.out.println("Quanti kw hai consumato nel penultimo mese? ");
        contGas.setQuantikw2(in.nextDouble(), this.VALORE_MAX);
    }
    public void visualizzaRisultati(){
        System.out.println(contGas.toString());
    }
}