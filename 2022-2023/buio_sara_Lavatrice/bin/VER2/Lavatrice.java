public class Lavatrice{
    private String marca;
    private String modello;
    private double prezzo;
    private int programma;
    private int temperatura;
    private int giriCentrifuga;
    private int kg;
    private boolean acceso;
    private double tempo;
    public Lavatrice(){
        this.marca="anonimo";
        this.modello="anonimo";
        this.prezzo=0.0;
        this.programma=0;
        this.temperatura=0;
        this.giriCentrifuga=0;
        this.kg=0;
        this.acceso=false;
        this.tempo=0.0;
    }  
    public Lavatrice(String marca, String modello, double prezzo, int programma, int temperatura, int giriCentrifuga, int kg, boolean acceso, double tempo){
        this.marca = marca;
        this.modello = modello;
        this.prezzo = prezzo;
        this.programma = programma;
        this.temperatura = temperatura;
        this.giriCentrifuga = giriCentrifuga;
        this.kg = kg;
        this.acceso = acceso;
        this.tempo = tempo;
    }
    public String getMarca(){
        return this.marca;
    }
    public void setMarca(String m){
        this.marca = m;
    }
    public String getModello(){
        return this.modello;
    }
    public void setModello(String mod){
        this.modello = mod;
    }
    public double getPrezzo(){
        return this.prezzo;
    }
    public void setPrezzo(double pr){
        this.prezzo = pr;
    }
    public int getProgramma(){
        return this.programma;
    }
    public void setProgramma(int progr){
        this.programma = progr;
    }
    public int getTemperatura(){
        return this.temperatura;
    }
    public void setTemperatura(int temp){
        this.temperatura = temp;
    }
    public int getGiriCentrifuga(){
        return this.giriCentrifuga;
    }
    public void setGiriCentrifuga(int gir){
        this.giriCentrifuga = gir;
    }
    public int getKg(){
        return this.kg;
    }
    public void setKg(int chili){
        this.kg = chili;
    }
    public boolean getAcceso(){
        return this.acceso;
    }
    public void setAcceso(boolean acc){
        this.acceso = acc;
    }
    public double getTempo(){
        return this.tempo;
    }
    public void setTempo(double t){
        this.tempo = t;
    }
    public Lavatrice(String m, String mod, double p){
        if(m != null){
            this.marca = m;
        } else{
            this.marca = "anonimo";
        }
        if(mod != null){
            this.modello = "mod";
        }else{
            this.modello = "anonimo";
        }
        if(p < 0.0){
            this.prezzo = 0.0;
        }else{
            this.prezzo = p;
        }
        this.programma = 0;
        this.temperatura = 0;
        this.giriCentrifuga = 0;
        this.kg = 0;
        this.acceso = false;
        this.tempo = 0.0;
    }
    public void programmaColorati(){
        this.temperatura = 60;
        this.giriCentrifuga = 1200;
        this.tempo = 2.00;
    }
    public void programmaBianchi(){
        this.temperatura = 60;
        this.giriCentrifuga = 1400;
        this.tempo = 2.40;
    }
    public void programmaScuri(){
        this.temperatura = 50;
        this.giriCentrifuga = 1000;
        this.tempo = 1.50;
    }
    public String toString(){
        String out = "La lavatrice " +  "\n" + "marca: " + this.marca + "\n" + "modello: " + this.modello + "\n" + "prezzo: " + this.prezzo + "\n";
        if(this.acceso){
            out += "è accesa ";
        }else{
            out += "è spenta ";
        }
        out += "il programma impostato è: " + this.programma + "\n" + "la temperatura scelta è: " + this.temperatura + "\n" + "i giri della centrifuga sono: " + this.giriCentrifuga + "\n" + "i kg sono: " + this.kg + "\n" + "il programma impiegherà: " + this.tempo + " ore";
        return out;
    }
}
