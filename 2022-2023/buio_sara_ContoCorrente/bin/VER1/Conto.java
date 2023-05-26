
/**
 * Aggiungi qui una descrizione della classe Conto
 * 
 * @author (il tuo nome) 
 * @version (un numero di versione o una data)
 */
public class Conto {
    private double saldo;
    private String intestatario;
    private int ibanLocale;

    public Conto(double saldo, String intestatario){
        if(saldo>0.0 && intestatario!=null){
            this.saldo = saldo;
            this.intestatario = intestatario;
            Banca.numeroConti ++;
            this.ibanLocale = Banca.numeroConti;
        }
    }

    public Conto(String s) {
        Banca.numeroConti ++;
        this.ibanLocale = Banca.numeroConti;
        this.saldo=0.0;
        this.intestatario=s;
    }

    public Conto() {
        Banca.numeroConti ++;
        this.ibanLocale = Banca.numeroConti;
        this.saldo=0.0;
        this.intestatario="sconosciuto";
    }

    public int getIban(){
        return this.ibanLocale;
    }

    public void setSaldo(double s){
        if(s>0.0){
            this.saldo = s;
        }
    }
    public double getSaldo(){
        return this.saldo;
    }

    public void setIntestatario(String intestatario){
        if(intestatario!=null){
            this.intestatario=intestatario;
        }
    }
    public String getIntestatario(){
        return this.intestatario;
    }
    
    public void deposito(double c){
        this.saldo+=c;
    }

    public void prelievo(double b){
        this.saldo-=b;
    }

    public String toString(){
        String out = "";
        out += "Nome intestatario: " + this.intestatario;
        out += "\n Iban: " + this.ibanLocale;
        out += "\n saldo pari a: " + this.saldo;
        return out; 
    }
}
