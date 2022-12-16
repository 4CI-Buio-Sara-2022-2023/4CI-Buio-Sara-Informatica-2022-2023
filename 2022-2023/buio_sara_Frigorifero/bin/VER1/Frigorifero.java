public class Frigorifero{
    private String marca;
    private String modello;
    private double litriFrigo;
    private double litrFreezer;
    private double prezzo;
    private boolean acceso;
    private double consumokwat;
    private double temperaturaFrigo;
    private double temperaturaFreezer;
    public Frigorifero(){
        this.marca = "anonimo";
        this.modello = "anonimo";
        this.litriFrigo = 0.0;
        this.litrFreezer = 0.0;
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
}