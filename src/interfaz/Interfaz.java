package interfaz;
import java.io.*;
import dominio.*;
import java.util.*;

public class Interfaz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String decision;
        
        System.out.println("Bienvenido a el programa que te ayudara a conocer todo lo que necesitas sobre las pizzerias de FNAF");
        System.out.println(" las opciones son : Freddy Fazbear y Circus Baby");
        System.out.println("Para saber de Freddy Fazbear escribe 1 y para Circus Baby escribe 2");
        System.out.println("Para salir escribe 3");
        decision = sc.nextLine();
        if (decision!="1" | decision!="2" | decision!="3"){
            System.out.println("Valor introducido incorrecto");
        }
        else{
            if (decision=="1"){
                System.out.println("El nombre de la pizzeria es: "+ Freddy_Fazbear.getNombrep());
                System.out.println("El dueño de la pizzeria es: "+ Freddy_Fazbear.getDueño());
                
                System.out.println("Los animatronicos de la pizzeria son: "+ Freddy.getNombrea());
                System.out.println("El nivel de miedo de los animatronicos es: "+ Freddy.getNivelmiedo());
                System.out.println("Los animatronicos de la pizzeria son: "+ Bonnie.getNombrea());
                System.out.println("El nivel de miedo de los animatronicos es: "+ Bonnie.getNivelmiedo());
                System.out.println("Los animatronicos de la pizzeria son: "+ Chica.getNombrea());
                System.out.println("El nivel de miedo de los animatronicos es: "+ Chica.getNivelmiedo());
                System.out.println("Los animatronicos de la pizzeria son: "+ Foxy.getNombrea());
                System.out.println("El nivel de miedo de los animatronicos es: "+ Foxy.getNivelmiedo());

                System.out.println("El nombre de la persona fallecida es: "+ mordida1.getFallecido());
                System.out.println("El culpable de la mordida fue: "+ mordida1.getCulpable());

            }
            if (decision=="2"){
                System.out.println("El nombre de la pizzeria es: "+ Circus_Baby.getNombrep());
                System.out.println("El dueño de la pizzeria es: "+ Circus_Baby.getDueño());
                
                System.out.println("Los animatronicos de la pizzeria son: "+ Circus_Baby.getNombrea());
                System.out.println("El nivel de miedo de los animatronicos es: "+ Freddy.getNivelmiedo());
                System.out.println("Los animatronicos de la pizzeria son: "+ Bonnie.getNombrea());
                System.out.println("El nivel de miedo de los animatronicos es: "+ Bonnie.getNivelmiedo());
                System.out.println("Los animatronicos de la pizzeria son: "+ Chica.getNombrea());
                System.out.println("El nivel de miedo de los animatronicos es: "+ Chica.getNivelmiedo());
                System.out.println("Los animatronicos de la pizzeria son: "+ Foxy.getNombrea());
                System.out.println("El nivel de miedo de los animatronicos es: "+ Foxy.getNivelmiedo());

                System.out.println("El nombre de la persona fallecida es: "+ mordida2.getFallecido());
                System.out.println("El culpable de la mordida fue: "+ mordida2.getCulpable());

                

            }
            else{
                System.out.println("Gracias por usar el programa :)");
            }
        }
        
        sc.close();

    }
       
}


    
    
        
       
    
    

        
