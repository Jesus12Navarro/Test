/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.libreria;

/**
 *
 * @author strdh
 */

public class Libro implements Libreria.Prestable {
    private String titulo;
    private String autor;
    private boolean disponible;

    public Libro(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
        this.disponible = true;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public boolean estaDisponible() {
        return disponible;
    }

    public void prestar() {
        if (disponible) {
            disponible = false;
        } else {
            System.out.println("El libro '" + titulo + "' ya está prestado.");
        }
    }

    public void devolver() {
        disponible = true;
    }
}

