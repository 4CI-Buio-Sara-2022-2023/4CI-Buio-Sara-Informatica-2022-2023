import java.util.*;
import java.io.*;

public class FilmCalculator {
    private ArrayList<FilmModel> filmList;
    //private FilmModel film1;

    public FilmCalculator(){
        filmList=new ArrayList<FilmModel>();
        //film1=new FilmModel();
    }
    
    public void start(){
        leggi();
        scrivi();
        durata();
        durataMaggiore();
        trovaRegista();
    }

    public void leggi(){
        try{
            Scanner reader = new Scanner(new File("film.txt"));
            while(reader.hasNextLine()){
                String line = reader.nextLine();
                String[] dataline=line.split(";");
                filmList.add(new FilmModel(dataline[0], dataline[1], dataline[2]));
            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }

    public void scrivi(){
        try{
            FileWriter writer = new FileWriter(new File("output.txt"));
            for(FilmModel film1 : filmList){
                String out = "titolo: " + ";" + film1.getTitolo() + "regista: " + ";" + film1.getRegista() + "durata: " + ";" + film1.getDurata();
                writer.write(out);
            }
        }catch(Exception e){
            e.printStackTrace();
        }System.out.println(filmList + "\n");
    }

    public void durata(){ 
        for (int i = 0;  i < filmList.size()-1; i++){ 
            for (int j = 0; j < filmList.size()-i-1; j++){ 
                if (filmList.get(j).getDurataInt() > filmList.get(j + 1).getDurataInt()){ 
                    FilmModel k = filmList.get(j); 
                    filmList.set(j, filmList.get(j + 1));  
                    filmList.set(j + 1, k);
                } 
            }
        }
        System.out.println(filmList + "\n"); 
    }

    public void durataMaggiore(){
        double var=0.0;
        String nome="";
        for(int i=0; i<filmList.size(); i++){
            if(filmList.get(i).getDurataDouble()>var){
                var=filmList.get(i).getDurataDouble();
                nome=filmList.get(i).getTitolo();
            }
        }
        System.out.println("il film con la durata maggiore è: " + nome + "con la durata di: " + var + "\n");
    }

    public void trovaRegista(){
        Scanner in=new Scanner(System.in);
        System.out.println("dammi il regista che vuoi cercare");
        String regista=in.nextLine();
        for(int i=0; i<filmList.size(); i++){
            if(filmList.get(i).getRegista().equals(regista)){
                System.out.println("i film di " + regista + " " + "sono " + filmList.get(i).getTitolo() + "\n");
            }
        }
    }
}
