public class Televisore{
    private int pollici;
    private String schermo;
    private String colore;
    private int canale;
    private int volume;
    private int luminos;
    private boolean acceso;
    public Televisore(){
        this.pollici = 0;
        this.schermo = "anonimo";
        this.colore = "anonimo";
        this.canale = 0;
        this.volume = 0;
        this.luminos = 0;
        this.acceso = false;
    }
    public Televisore(int pollici, String schermo, String colore, int canale, int volume, int luminos, boolean acceso){
	    if(pollici>0) this.pollici = pollici;
	    else this.pollici = 0;
	    if (schermo!=null) this.schermo = schermo;
	    else this.schermo = "anonimo";
	    //correggi tutto prima che mi arrabbi
	this.colore = colore;
	this.canale = canale;
	this.volume = volume;
	this.luminos = luminos;
	this.acceso = acceso;
    }
    public int getPollici(){
        return this.pollici;
    }
    private void setPollici(int pol){
        if(pol>=24){
            this.pollici = pol;
        }
    }
    public String getSchermo(){
        return this.schermo;
    }
    private void setSchermo(String s){
        if (s == "lcd"|| s == "oled" || s == "miniled"){
            this.schermo = s;
        }
	
        /*if (s == "oled"){
            this.schermo = s;
        }
        if (s == "miniled"){
            this.schermo = s;
        }*/
    }
    public String getColore(){
        return this.colore;
    }
    private void setColore(String col){
        if (col != null)
		if (col == "black" !! col == "grey"){
            	this.colore = col;
        	}
        /*if (col == "grey"){
            this.colore = col;
        }*/
    }
    public void on(){
        this.acceso = true;
    }
    public void off(){
        this.acceso = false;
    }
    public int getCanale(){
        return this.canale;
    }
    public void setCanale(int can){
	    if(can>0) this.canale = can;
    }
    public void aumentaCanale(){
        this.canale++;
    }
    public void diminuisciCanale(){
	    if (this.canale>1)
        this.canale--;
    }
    public int getVolume(){
        return this.volume;
    }
    public void setVolume(int vol){
        if(vol>0) this.volume = vol;
    }
    public void aumentaVolume(){
        this.volume++;
    }
    public void diminuisciVolume(){
        if(this.volume>1) this.volume--;
    }
    public int getLuminos(){
        return this.luminos;
    }
    public void aumentaLuminos(){
        this.luminos++;
    }
    public void diminusciLumions(){
        if (this.luminos>1) this.luminos--;
    }
    public String toString(){
        String out = "I pollici sono: " + this.pollici + "\n" + "Lo schermo è: " + this.schermo + "\n" + "Il colore della televisione è: " + this.colore + "\n";
        if (this.acceso == true){
             out += "La televisione è:  accesa" + "\n" + "Canale: " + this.canale + "\n" + "luminosità pari a: " + this.luminos + "\n" + "volume: " + this.volume + "\n";
        }else{
            out +=  "La televisione è:  spenta";
        }
        return out;
    }
}
