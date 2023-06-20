/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arboles;

/**
 *
 * @author UTPL
 */
public class Metodos {
    
    
    public void preorden(Nodo raiz){
        if (raiz != null) {
            System.out.println(raiz.dato);
            preorden(raiz.izq);
            preorden(raiz.der);
        }
    }
    
    public void inorden(Nodo raiz){
        if (raiz != null) {
            inorden(raiz.izq);
            System.out.println(raiz.dato);
            inorden(raiz.der);
            
        }
    }
    
    public void postorden(Nodo raiz){
        postorden(raiz.izq);
        postorden(raiz.der);
        System.out.println(raiz.dato);
    }
}
