public class Frigorifero{
    private String marca;
    private String modello;
    private double litriFrigo;
    private double litriFreezer;
    private double prezzo;
    private boolean acceso;
    private double consumokwat;
    private double temperaturaFrigo;
    private double temperaturaFreezer;
    public Frigorifero(){
        this.marca = "anonimo";
        this.modello = "anonimo";
        this.litriFrigo = 0.0;
        this.litriFreezer = 0.0;
        this.prezzo = 0.0;
        this.consumokwat = 0.0;
        this.temperaturaFrigo = 0.0;
        this.temperaturaFreezer = 0.0;
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
    public double getLitriFrigo(){
        return this.litriFrigo;
    }
    public void setLitriFrigo(double lfg){
        this.litriFrigo = lfg;
    }
        public double getLitriFreezer(){
        return this.litriFreezer;
    }
    public void setLitriFreezer(double lfe){
        this.litriFreezer = lfe;
    }
    public double getPrezzo(){
        return this.prezzo;
    }
    public void setPrezzo(double pr){
        this.prezzo = pr;
    }
    public double getConsumokwat(){
        return this.consumokwat;
    }
    public void setConsumokwat(double cK){
        this.consumokwat = cK;
    }
    public double getTemperaturaFrigo(){
        return this.temperaturaFrigo;
    }
    public void setTemperaturaFrigo(double tfrig){
        this.temperaturaFrigo = tfrig;
    }
    public double getTemperaturaFreezer(){
        return this.temperaturaFreezer;
    }
    public void setTemperaturaFreezer(double tfree){
        this.temperaturaFreezer = tfree;
    }
    public Frigorifero(String m, String mod, double lfrig, double lfree,double p, boolean acc, double conk, double tfrig, double tfree){
        if(m != null){
            this.marca = m;
        } else{
            this.marca = "anonimo";
        }
        if(mod != null){
            this.modello = mod;
        }else{
            this.modello = "anonimo";
        }
        if(lfrig < 500.0 && lfrig > 100.0){
            this.litriFrigo = lfrig;
        }else{
            this.litriFrigo = 0.0;
        }
        if(lfree <= 100.0 && lfree >= 10.0){
            this.litriFreezer = lfree;
        }else{
            this.litriFreezer = 0.0;
        }
        if(p < 0.0){
            this.prezzo = 0.0;
        }else{
            this.prezzo = p;
        }
        this.acceso = acc;
        if(conk >= 0.0){
            this.consumokwat = conk;
        }else{
            this.consumokwat = 0.0;
        }
        if(tfrig <= 10.0 && tfrig >= 2.0){
            this.temperaturaFrigo = tfrig;
        }else{
            this.temperaturaFrigo = 0.0;
        }
        if(tfree >= -20.0 && tfree <= -2.0){
            this.temperaturaFreezer = tfree;
        }else{
            this.temperaturaFreezer =0.0;
        }
    }
    public void p1(){
        this.acceso = true;
        this.consumokwat = 130.4;
        this.temperaturaFrigo = 4.2;
        this.temperaturaFreezer = -12.3;
    }
    public void p2(){
        this.acceso = true;
        this.consumokwat = 110.8;
        this.temperaturaFrigo = 5.9;
        this.temperaturaFreezer = -7.3;
    }
    public void p3(){
        this.acceso = true;
        this.consumokwat = 150.1;
        this.temperaturaFrigo = 2.7;
        this.temperaturaFreezer = -18.6;
    }
    public void off(){
        this.acceso = false;
    }
    public void on(){
        this.acceso = true;
    }
    public String toString(){
        String out = "Il frigorifero di marca: " + this.marca + ", modello " + this.modello + ", costa " + this.prezzo + " euro";
        if(this.acceso == true){
            out += " è acceso " + "\n";
            out += "La capacità del frigorifero è di " + this.litriFrigo + ", invece quella del freezer è di " + this.litriFreezer + "\n" + "La temperatura del frigo è " + this.temperaturaFrigo + ", invece la temperatura del freezer è " + this.temperaturaFreezer + "\n" + "In questo momento sta consumando " + this.consumokwat + " KW" + "\n";
        }else{
            out += " è spento " + "\n";
            out += "La capacità del frigorifero è di " + this.litriFrigo + ", invece quella del freezer è di " + this.litriFreezer;
        }
        return out;
    }
}
