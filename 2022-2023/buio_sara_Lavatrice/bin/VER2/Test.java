import java.util.*;
public class Test{
    public static void main (String args[]){
        Scanner input = new Scanner(System.in);
        Lavatrice l0 = new Lavatrice("Samsung", "wc350", 400.0, 3, 1, 1, 8, false, 1.0);
        System.out.println("Lavatrice spenta");
        System.out.println(l0.toString() + "\n");
        Lavatrice l1 = new Lavatrice("Samsung", "wc400", 400.0, 1, 2, 1, 7, true, 1.0);
        System.out.println("Lavatrice accesa");
        System.out.println(l1.toString() + "\n");
        l1.programmaColorati();
        System.out.println("Lavatrice accesa con impostato il programma colorati");
        System.out.println(l1.toString() + "\n");
        l1.programmaBianchi();
        System.out.println("Lavatrice accesa con impostato il programma bianchi");
        System.out.println(l1.toString() + "\n");
        l1.programmaScuri();
        System.out.println("Lavatrice accesa con impostato il programma Scuri");
        System.out.println(l1.toString() + "\n");
    }
}