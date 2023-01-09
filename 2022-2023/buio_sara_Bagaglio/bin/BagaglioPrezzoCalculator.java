import java.util.*;
public class BagaglioPrezzoCalculator {
    private static final double COSTO_PER_KG=5.00;
    private static final double SOVRAPPREZZO=10.00;
    private Bagaglio bag;
    
    public BagaglioPrezzoCalculator(){
        bag = new Bagaglio();
    }
    public void start(){
        this.descriviAttività();
        this.prendiInput();
        this.calcolaPrezzo(); // se non salvi il valore restituito, non calcoli nulla
        this.visualizzaRisultati();
    }
    public double calcolaPrezzo(){ // a chi lo restituisci?
        if (bag.sovrapprezzo()){ 
            return (bag.getWeight()*COSTO_PER_KG+SOVRAPPREZZO);
        }else{
            return (bag.getWeight()*COSTO_PER_KG);
        }
    }
    public void descriviAttività(){
        System.out.println("Descrizione attività");
    }
    public void prendiInput(){
        Scanner in = new Scanner(System.in);
        System.out.println("Dimmi il peso");
        bag.setWeight(in.nextDouble());
    }
    public void visualizzaRisultati(){
        bag.toString();
        System.out.println("Il bagaglio costa " + this.calcolaPrezzo());
    }
}
