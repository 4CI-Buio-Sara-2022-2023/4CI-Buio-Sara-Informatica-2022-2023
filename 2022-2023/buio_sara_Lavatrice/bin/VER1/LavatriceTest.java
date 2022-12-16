import java.util.*;
public class LavatriceTest{
    public static void main(String args[]){
        Scanner input = new Scanner (System.in);
        Lavatrice l0 = new Lavatrice("Miele", "wc300", 400.0, 1, 1, 1, 8, false, 1.0);
        System.out.println("Lavatrice spenta");
        System.out.println(l0.toString() + "\n");
        Lavatrice l1 = new Lavatrice("Miele", "wc300", 400.0, 1, 1, 1, 8, true, 1.0);
        System.out.println("Lavatrice accesa");
        System.out.println(l1.toString() + "\n");
        l1.pColorati();
        System.out.println("Lavatrice accesa con impostato il programma colorati");
        System.out.println(l1.toString() + "\n");
        l1.pBianchi();
        System.out.println("Lavatrice accesa con impostato il programma bianchi");
        System.out.println(l1.toString() + "\n");
        l1.pScuri();
        System.out.println("Lavatrice accesa con impostato il programma Scuri");
        System.out.println(l1.toString() + "\n");
    }
}