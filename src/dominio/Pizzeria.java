
public class Pizzeria{
    //definir atributos 
    public String nombrep;
    public String dueño;
    //constructor
    public Pizzeria(String nombrep, String dueño) {
        this.nombrep = nombrep;
        this.dueño = dueño;
    }
    //getters y setters
    public void setNombrep(String nombrep){
        this.nombrep=nombrep;
    }
    public void setDueño(String dueño){
        this.dueño=dueño;
    }
    public String getNombrep(){
        return nombrep;
    }
    public String getDueño(){
        return dueño;
    }
    
    //primera pizzeria
    public void Freddy_Fazbear(){
        nombrep = "Freddy Fazbear";
        dueño = "Scott Cawthon";
    }
    //segunda pizzeria
    public void Circus_Baby(){
        nombrep = "Circus Baby";
        dueño = "William Afton";
    }
}
