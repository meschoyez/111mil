/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package veterinariaherencia;

import java.util.ArrayList;

/**
 *
 * @author meschoyez
 */
public class VeterinariaHerencia {
    private ArrayList<Perro> perros;
    private ArrayList<Gato> gatos;
    private ArrayList<Cucha> cuchas;
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        VeterinariaHerencia vet = new VeterinariaHerencia();
        
        vet.ListarPerros();
        vet.ListarGatos();
        vet.ListarCuchas();
    }
    
    public VeterinariaHerencia () {
        perros = new ArrayList<>();
        gatos = new ArrayList<>();
        cuchas = new ArrayList<>();
        InicializarVeterinaria();
    }
    
    public void InicializarVeterinaria () {
        perros.add(new Perro("terrbald", "marron", "Toby"));
        perros.add(new Perro("cordubensis", "negro"));
        perros.add(new Perro("setter", "gris", "Picante"));
        
        gatos.add(new Gato("siames", "crema", "Daisy"));
        gatos.add(new Gato("comun", "marron"));
        
        cuchas.add(new Cucha(Material.MADERA, Tamano.MEDIANO, "blanco", false, "Toby"));
        cuchas.add(new Cucha(Material.TELA, Tamano.CHICO, "rosa", true, "Daisy"));
    }
    
    public void ListarCuchas () {
        System.out.println("Cuchas registrados:");
        for (Cucha c : cuchas) {
            System.out.println(c);
        }
    }
    
    public void ListarGatos () {
        System.out.println("Gatos registrados:");
        for (Gato g : gatos) {
            System.out.println(g);
        }
    }
    
    public void ListarPerros () {
        System.out.println("Perros registrados:");
        for (Perro p : perros) {
            System.out.println(p);
        }
    }
    
}
