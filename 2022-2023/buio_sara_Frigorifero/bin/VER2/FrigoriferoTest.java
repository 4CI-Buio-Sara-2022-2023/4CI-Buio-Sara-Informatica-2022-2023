import java.util.*;
public class FrigoriferoTest{
    public static void main(String args[]){
        Frigorifero f1 = new Frigorifero("Indesit", "wch500", 540.0, 130.7, 407.32, true, 174.0, 4.0, -7.0);
        System.out.println("Frigorifero 1 con parametri inseriti");
        System.out.println(f1.toString());
        System.out.println("Frigorifero 1 spento" + "\n");
        f1.off();
        System.out.println(f1.toString());
        Frigorifero f2 = new Frigorifero("Electrolux", "72a34", 210.0, 150.7, 279.90, true, 127.3, 4.7, -5.2);
        System.out.println("Frigorifero 2 con parametri inseriti");
        System.out.println(f2.toString());
        System.out.println("Frigorifero 2 impostato sul programma 3");
        f2.p3();
        System.out.println(f2.toString());
    }
}
