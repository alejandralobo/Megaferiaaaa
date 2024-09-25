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
public class Megaferia {

    private ArrayList<Stand> Stands;
    private ArrayList<Editorial> editoriales;

    public Megaferia() {
        this.Stands = new ArrayList<>();
        this.editoriales = new ArrayList<>();
    }

    public void createStand(float precio) {
        //crea stands a megaferia
        this.Stands.add(new Stand(precio));

    }

    public void verifyStands() {
        for (Stand stand : this.Stands) {
            System.out.println(stand);
        }
    }

    public boolean addEditorial(Editorial editorial) {
        if (!this.editoriales.contains(editorial)) {
            this.editoriales.add(editorial);
            return true;
        }
        return false;
    }
    

}
