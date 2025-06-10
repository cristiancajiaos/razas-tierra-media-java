package main;

import java.util.ArrayList;
import java.util.List;
import tierramedia.Raza;

public class Main {

    public static void main(String[] args) {
        Raza hombre = new Raza();
        Raza elfo = new Raza();
        Raza enano = new Raza();
        
        hombre.setNombre("Hombre");
        hombre.setArma("Espada");
        
        elfo.setNombre("Elfo");
        elfo.setArma("Arco y espadas");
        
        enano.setNombre("Enano");
        enano.setArma("Hacha");
        
        List<Raza> razas = new ArrayList();
        razas.add(hombre);
        razas.add(elfo);
        razas.add(enano);
        
        // Esto da error, ya que el atributo arma es de carácter private en la clase
        // System.out.println(elfo.arma);
        
        // Esto no da error, ya que se accede a los métodos para obtener los atributos
        for(Raza raza: razas) {
            System.out.println("El " + raza.getNombre() + " puede atacar con " + raza.getArma());
        }
    }
    
    


}
