import java.util.*;
public class TelevisoreTest{
    public static void main (String args[]){
        Televisore tv = new Televisore(40, "samsung", "black", 10, 15, 90, true);
        System.out.println("Con i valori standard:");
        System.out.println(tv.toString());
        tv.aumentaVolume();
        tv.diminusciLumions();
        tv.aumentaCanale();
        System.out.println("Aumentato di volume, cambio canale e diminuisco la luminosità");
        System.out.println(tv.toString());
        Televisore tv1 = new Televisore(38, "samsung", "black", 1, 2, 10, true);
        tv1.off();
        System.out.println("Televisione spenta");
        System.out.println(tv1.toString() + "\n");
        tv1.on();
        System.out.println("Televisione riaccesa");
        System.out.println(tv1.toString() +"\n");
    }
}