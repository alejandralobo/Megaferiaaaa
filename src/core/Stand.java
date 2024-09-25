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
class Stand {

    private static int idCount = 0; //contador para asignar el  id,es estatica porque es una variable de la clase 

    private int id;
    private float precio;
    private ArrayList<Editorial> editoriales; // lista vacia porque al inicio el Stand no tiene editoriales 

    public Stand(float precio) {
        this.id = Stand.idCount; // accediendo a la variable en la clase stand
        this.precio = precio;
        this.editoriales = new ArrayList<>();

        Stand.idCount++; // va incrementando 

    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "(" + this.id + "," + this.precio + ")";

    }

}
