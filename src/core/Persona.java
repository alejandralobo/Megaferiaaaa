/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package core;

import java.util.ArrayList;

/**
 *
 * @author loboam
 */
public abstract class Persona {

    private ArrayList<AudioLibro> libros;
    private String nomnbre;
    private int cedula;

    public Persona(ArrayList<AudioLibro> libros, String nomnbre, int cedula) {
        this.libros = libros;
        this.nomnbre = nomnbre;
        this.cedula = cedula;
    }

    public boolean addLibro(AudioLibro libro) {
        if (!this.libros.contains(libro)) {
            this.libros.add(libro);
            return true;
        }
        return false;
    }

}
