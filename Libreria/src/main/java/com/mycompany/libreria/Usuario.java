/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.libreria;

/**
 *
 * @author strdh
 */
public class Usuario {
    private String nombre;
    private List<Prestable> librosPrestados;

    public Usuario(String nombre) {
        this.nombre = nombre;
        this.librosPrestados = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void prestarLibro(Prestable libro) {
        if (libro.estaDisponible()) {
            libro.prestar();
            librosPrestados.add(libro);
            System.out.println("El libro ha sido prestado a " + nombre + ".");
        } else {
            System.out.println("El libro no está disponible.");
        }
    }

    public void devolverLibro(Prestable libro) {
        if (librosPrestados.contains(libro)) {
            libro.devolver();
            librosPrestados.remove(libro);
            System.out.println("El libro ha sido devuelto por " + nombre + ".");
        } else {
            System.out.println("El libro no está en la lista de libros prestados.");
        }
    }

    public void listarLibrosPrestados() {
        if (librosPrestados.isEmpty()) {
            System.out.println(nombre + " no tiene libros prestados.");
        } else {
            System.out.println("Libros prestados por " + nombre + ":");
            for (Prestable libro : librosPrestados) {
                if (libro instanceof Libro) {
                    Libro l = (Libro) libro;
                    System.out.println(" - " + l.getTitulo() + " de " + l.getAutor());
                }
            }
        }
    }
}

