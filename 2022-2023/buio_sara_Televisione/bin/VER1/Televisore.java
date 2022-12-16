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
	this.pollici = pollici;
	this.schermo = schermo;
	this.colore = colore;
	this.canale = canale;
	this.volume = volume;
	this.luminos = luminos;
	this.acceso = acceso;
    }
}