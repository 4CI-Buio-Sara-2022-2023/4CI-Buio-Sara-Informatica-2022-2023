public class FilmModel {
    private String titolo;
    private String regista;
    private String durata;

    public FilmModel(String titolo, String regista, String durata) {
        this.titolo = titolo;
        this.regista = regista;
        this.durata = durata;
    }

    public FilmModel() {
        this.titolo = "anonimo";
        this.regista = "anonimo";
        this.durata = "anonimo";
    }

    public String getTitolo() {
        return titolo;
    }

    public void setTitolo(String titolo) {
        if(titolo!=null) this.titolo = titolo;
    }

    public String getRegista() {
        return regista;
    }

    public void setRegista(String regista) {
        if(regista!=null) 
            this.regista = regista;
    }

    public String getDurata() {
        return durata;
    }

    public void setDurata(String durata) {
        if(durata!=null) 
            this.durata = durata;
    }

    public int getDurataInt(){ 
        String[] durata = this.durata.split(":"); 
        return(Integer.parseInt(durata[0]) *60 + Integer.parseInt(durata[1]));
    }

    public double getDurataDouble(){ 
        String[] durata = this.durata.split(":"); 
        return(Double.parseDouble(durata[0]) *60 + Double.parseDouble(durata[1]));
    }

    @Override
    public String toString() {
        return "Film {" + "titolo=" + titolo + ", regista=" + regista + ", durata=" + durata + '}';
    }
    
}
