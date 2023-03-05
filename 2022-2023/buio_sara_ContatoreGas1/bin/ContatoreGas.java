/**
 * Aggiungi qui una descrizione della classe ContatoreGas
 * 
 * @author Sara Buio 
 * @version (un numero di versione o una data)
 */
public class ContatoreGas{
    public double prezzokw;
    public double kw1;
    public double kw2;
    public ContatoreGas(){
        prezzokw = 0.0;
        kw1 = 0.0;
        kw2 = 0.0;
    }
    public ContatoreGas(double prezzokw, double kw1, double kw2){
        if(prezzokw != 0){
            this.prezzokw = prezzokw;
        }else{
            this.prezzokw = 0.0;
        }
        if(kw1 != 0.0){
            this.kw1 = kw1;
        }else{
            this.kw1 = 0.0;
        }
        if(kw2 != 0.0){
            this.kw2 = kw2;
        }else{
            this.kw2 = 0.0;
        }
    }
    public double getPrezzoalkw(){
        return prezzokw;
    }
    public void setPrezzoalkw(double p){
        this.prezzokw = p;
    }
    public double getQuantikw1(){
        return kw1;
    }
    public void setQuantikw1(double q1, double max){
        if (q1 < max){
            this.kw1 = q1;
        }
    }
    public double getQuantikw2(){
        return kw2;
    }
    public void setQuantikw2(double q2, double max){
        if (q2 < max){
            this.kw2 = q2;
        }
    }
    public double rilevazionePenultimoMese(){
        return (this.prezzokw * this.kw2);
    }
    public double rilevazioneUltimoMese(){
        return (this.prezzokw * this.kw1);
    }
    public String minorCosto(){
        if(this.rilevazionePenultimoMese() < this.rilevazioneUltimoMese()){
            return "La bolletta piu economica è stata quella del penultimo mese con un costo pari a: " + this.rilevazionePenultimoMese() + " €" + "\n";
        }else{
            return "La bolletta piu economica è stata quella dell'utimo mese con un costo pari a: " + this.rilevazioneUltimoMese() + " €" + "\n";
        }
    }
    public String toString(){
        String out = "Il prezzo al kw del gas è di: " + this.prezzokw + "\n" + "Durante il mese appena passato sono stati spesi: " + this.rilevazioneUltimoMese() + " €" + "\n" + "Mentre due mesi fa sono stati spesi: " + this.rilevazionePenultimoMese() + " €" + "\n";
        out += this.minorCosto();
        return out;
    }
}