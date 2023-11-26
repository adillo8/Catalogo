
public class Animatronicos extends Pizzeria{
    //Atributos
    public String nombrea;
    public int nivelmiedo;
    //Constructor
    public Animatronicos(String nombrea, int nivelmiedo,String nombrep,String dueño){
        super(nombrep,dueño);
        this.nombrea = nombrea;
        this.nivelmiedo = nivelmiedo;
    }
    //Setters y getters
    public void setNombrea(String nombrea){
        this.nombrea = nombrea;
    }
    public void setNivelmiedo(int nivelmiedo){
        this.nivelmiedo = nivelmiedo;
    }
    public String getnombrea(){
        return nombrea;
    }
    public int getNivelmiedo(){
        return nivelmiedo;
    }
    //los animatronicos de fazbear
    public void Freddy(){
        nombrea = "Freddy";
        nivelmiedo = 5;
    }
    public void Bonnie(){
        nombrea = "Bonnie";
        nivelmiedo = 4;
    }
    public void Chica(){
        nombrea = "Chica";
        nivelmiedo = 3;
    }
    public void Foxy(){
        nombrea = "Foxy";
        nivelmiedo = 5;
    }
    //los animatronicos de circus baby
    public void Circus_Baby(){
        nombrea = "Circus Baby";
        nivelmiedo = 7;
    }
    public void Ballora(){
        nombrea = "Ballora";
        nivelmiedo = 6;
    }
    public void Funtime_Freddy(){
        nombrea = "Funtime Freddy";
        nivelmiedo = 5;
    }
    public void Funtime_Foxy(){
        nombrea = "Funtime Foxy";
        nivelmiedo = 5;
    }
    
}