
public class Mordidas extends Animatronicos{
    //Atributos
    public String fallecido;
    public String culpable;
    //Constructor
    public Mordidas(String fallecido, String culpable, String nombrea, int nivelmiedo, String nombrep, String dueño) {
        super(nombrea, nivelmiedo, nombrep, dueño);
        this.fallecido = fallecido;
        this.culpable = culpable;
    }
    //Setters y getters
    public void setFallecido(String fallecido){
        this.fallecido = fallecido;
    }
    public void setCulpable(String culpable){
        this.culpable = culpable;
    }
    public String getFallecido(){
        return fallecido;
    }
    public String getCulpable(){
        return culpable;
    }
    //Mordidas
    public void mordida1(){
        fallecido = "Jeremy Fitzgerald";
        culpable = "Freddy";
    }
    public void mordida2(){
        fallecido = "Fritz Smith";
        culpable = "Circus Baby";
    }


    
}
