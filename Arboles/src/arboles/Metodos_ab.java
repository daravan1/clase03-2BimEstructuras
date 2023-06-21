/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arboles;

import java.util.Scanner;

/**
 *
 * @author SALA H
 */
public class Metodos_ab {

    Scanner entrada;
    Nodo raiz;

    public Metodos_ab() {
        this.entrada = new Scanner(System.in);
        this.raiz = null;
    }

    public int menu() {
        System.out.println("Operaciones con arboles binarios de busqueda");
        System.out.println("--------------------------------------------");
        System.out.println("Insertar    [1]");
        System.out.println("Recorrer [2]");
        System.out.println("Eliminar      [3]");
        System.out.println("Salir       [0]");
        return entrada.nextInt();
    }

    public boolean arbolVacio(Nodo raiz) {
        return (raiz == null);
    }

    public Nodo insertar(int num, Nodo actual) {
        if (arbolVacio(actual)) {
            Nodo nuevo = new Nodo(num);
            return nuevo;
        } else if (num > actual.dato) {
            actual.der = insertar(num, actual.der);
        } else {
            actual.izq = insertar(num, actual.izq);
        }
        return actual;
    }

    public void preOrden(Nodo actual) {
        if (actual != null) {
            System.out.println(actual.dato + "");
            preOrden(actual.izq);
            preOrden(actual.der);
        }
    }

    public void inOrden(Nodo actual) {
        if (actual != null) {
            inOrden(actual.izq);
            System.out.println(actual.dato + " ");
            inOrden(actual.der);

        }
    }

    public void postOrden(Nodo actual) {
        if (actual != null) {
            postOrden(actual.izq);
            postOrden(actual.der);
            System.out.println(actual.dato + " ");
        }
    }
}
