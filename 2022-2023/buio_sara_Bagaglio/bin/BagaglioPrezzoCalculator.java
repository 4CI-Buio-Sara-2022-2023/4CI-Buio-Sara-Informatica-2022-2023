import java.util.*;
public class BagaglioPrezzoCalculator {
    private static final double COSTO_PER_KG=5.00;
    private static final double SOVRAPPREZZO=10.00;
    private Bagaglio bag;
    Scanner in = new Scanner(System.in);
    public BagaglioPrezzoCalculator(){
        bag = new Bagaglio();
    }
    public void start(){
        this.descriviAttività();
        this.prendiInput();
        this.calcolaPrezzo();
        this.visualizzaRisultati();
    }
    public double calcolaPrezzo(){
        if (bag.sovrapprezzo() == true){
            return (bag.getWeight()*SOVRAPPREZZO);
        }else{
            return (bag.getWeight()*COSTO_PER_KG);
        }
    }
    public void descriviAttività(){
        System.out.println("Descrizione attività");
    }
    public void prendiInput(){
        System.out.println("Dimmi il peso");
        bag.setWeight(in.nextDouble());
    }
    public void visualizzaRisultati(){
        bag.toString();
        System.out.println("Il bagaglio costa " + this.calcolaPrezzo());
    }
}