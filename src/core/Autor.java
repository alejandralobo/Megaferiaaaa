/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package core;

import java.util.ArrayList;

/**
 *
 * @author aleja
 */
public class Autor  extends Persona{
    
    private ArrayList<Libro> libros;

    public Autor(ArrayList<AudioLibro> libros, String nomnbre, int cedula) {
        super(libros, nomnbre, cedula);
    }
    
    
    public boolean addLibro(Libro libro){
        
       if (!this.libros.contains(libro)){
           this.libros.add(libro);
           return true;
       }
       return false;
    }
}
