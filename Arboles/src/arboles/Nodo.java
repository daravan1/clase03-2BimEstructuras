/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arboles;

/**
 *
 * @author UTPL
 */
public class Nodo {

    int dato;
    Nodo izq;
    Nodo der;

    public Nodo(int d) {
        this.dato = d;
        this.izq = null;
        this.der = null;
    }

    public void establecerDato(int dato) {
        this.dato = dato;
    }

    public void establecerIzq(Nodo izq) {
        izq = null;
    }

    public void establecerDer(Nodo der) {
        der = null;
    }

    public int obtenerDato() {
        return dato;
    }

    public Nodo obtenerIzq() {
        return izq;
    }
    public Nodo obtenerDer() {
        return der;
    }
}
 