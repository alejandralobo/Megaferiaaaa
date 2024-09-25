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
class Editorial {

    private String nit;
    private String nombre;
    private String direccion;
    private ArrayList<Libro> libros;
    private ArrayList<Stand> stands;

    public boolean addLibro(Libro libro) {

        if (!this.libros.contains(libro)) {
            this.libros.add(libro);
            return true;
        }
        return false;
    }
}
