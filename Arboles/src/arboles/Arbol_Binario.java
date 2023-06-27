/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arboles;

/**
 *
 * @author SALA H
 */
public class Arbol_Binario {
    //Arbol binario de busqueda

    public static void main(String[] args) {

        int op, num;
        Metodos_ab myArbol = new Metodos_ab();
        do {
            op = myArbol.menu();
            switch (op) {
                case 1 ->{
                    System.out.println("Valor a insertar:");
                    num = myArbol.entrada.nextInt();
                    myArbol.raiz = myArbol.insertar(num, myArbol.raiz);
                }
                case 2 ->{
                    myArbol.preOrden(myArbol.raiz);
                    System.out.println("");
                    myArbol.inOrden(myArbol.raiz);
                    System.out.println("");
                    myArbol.postOrden(myArbol.raiz);
                    System.out.println("");
                        }

                case 3 ->{
                    System.out.println("Valor a eliminar: ");
                    num = myArbol.entrada.nextInt();
                    myArbol.raiz = myArbol.eliminar(num, myArbol.raiz);
                }
            }
        } while (op != 0);
    }

}
