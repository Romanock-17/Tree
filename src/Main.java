import java.util.Scanner;
import java.util.ArrayList;

import Arbol.ArbolDeBusqueda;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArbolDeBusqueda arbol = new ArbolDeBusqueda();
        System.out.println("Ingrese los nodos del arbol separados por comas");
        String arbolString = sc.nextLine();
        arbol.construir(arbolString);
        System.out.println("Inorden");
        arbol.inorden();
        System.out.println("\nPreorden");
        arbol.preorden();
        System.out.println("\nPostorden");
        arbol.postorden();
        System.out.println("\nHojas");
        arbol.contarHojas();
    }
}