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
public class LibroDigital extends Libro {
    private int paginas;
    private boolean hashipervinculo;
    private ArrayList<String> hipervinculos;
    
    
        public LibroDigital (String titulo, ArrayList<Autor> autores, String isbn, String genero, String formato, float valor, Editorial editorial, int paginas, int numejemplares, boolean hashipervinculo, ArrayList<String> hipervinculos){
            super (titulo, autores, isbn, genero, formato, valor, editorial);
            this.hashipervinculo = hashipervinculo;
            this.hipervinculos=hipervinculos;
            
           
        }

}
