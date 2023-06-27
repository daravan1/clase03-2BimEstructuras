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
            preOrden(actual.izq);
            preOrden(actual.der);
        }
    }

    public void inOrden(Nodo actual) {
        if (actual != null) {
            inOrden(actual.izq);
            System.out.print(actual.dato + " ");
            inOrden(actual.der);

        }
    }

    public void postOrden(Nodo actual) {
        if (actual != null) {
            postOrden(actual.izq);
            postOrden(actual.der);
            System.out.print(actual.dato + " ");
        }
    }
    
    public int reemplazar(Nodo actual){
        Nodo a = actual.izq;
        Nodo p = actual;
        int valor;
        
        while(a.der != null){
            p =a;
            a = a.der;
        }
        valor = a.dato;
        if (p  == actual) {
            p.izq = a.izq;
        }else{
            p.der = a.izq;
        }
        
        return valor;
    }
    
    public Nodo eliminar(int num, Nodo actual){
        if (actual == null) {
            System.out.println("El elemento no existe en el arbol");
        }else if(num > actual.dato){
            actual.der = eliminar(num, actual.der);
        }else if (num < actual.dato){
            actual.izq = eliminar(num, actual.izq);
        }else{
            Nodo aux =actual;
            if (aux.izq == null) { //if (arbolVacia(aux.izq))
                return aux.der;
            }
            else if (aux.der == null) {
                return aux.izq;
            }else{
                aux.dato = reemplazar(aux);
            }
        }
        return actual;
    }
}
