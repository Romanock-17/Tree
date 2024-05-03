package Arbol;
import Nodo.Nodo;

public class ArbolDeBusqueda {
    //Atributos
    private Nodo raiz;

    public void construir (String arbol){
        String[] nodos = arbol.split(",");
        for (String nodo : nodos){
            insertar(nodo.charAt(0));
        }
        
    }
    //insertar
    public void insertar(char dato){
        if (raiz == null){
            raiz = new Nodo(dato);
        }else{
            insertarRecursivo(raiz, dato);
        }
    }
    //insertarRecursivo
    private void insertarRecursivo(Nodo nodo, char dato){
        if (dato < nodo.getDato()){
            if (nodo.getHijoIzquierdo() == null){
                nodo.setHijoIzquierdo(new Nodo(dato));
            }else{
                insertarRecursivo(nodo.getHijoIzquierdo(), dato);
            }
        }else if (dato > nodo.getDato()){
            if (nodo.getHijoDerecho() == null){
                nodo.setHijoDerecho(new Nodo(dato));
            }else{
                insertarRecursivo(nodo.getHijoDerecho(), dato);
            }
        }
    }
    //leer en inorden
    public void inorden(){
        inordenRecursivo(raiz);
    }
    //inordenRecursivo
    private void inordenRecursivo(Nodo nodo){
        if (nodo != null){
            inordenRecursivo(nodo.getHijoIzquierdo());
            System.out.print(nodo.getDato() + " ");
            inordenRecursivo(nodo.getHijoDerecho());
        }
    }
    //leer en preorden
    public void preorden(){
        preordenRecursivo(raiz);
    }
    //preordenRecursivo
    private void preordenRecursivo(Nodo nodo){
        if (nodo != null){
            System.out.print(nodo.getDato() + " ");
            preordenRecursivo(nodo.getHijoIzquierdo());
            preordenRecursivo(nodo.getHijoDerecho());
        }
    }

    //leer en postorden
    public void postorden(){
        postordenRecursivo(raiz);
    }
    //postordenRecursivo
    private void postordenRecursivo(Nodo nodo){
        if (nodo != null){
            postordenRecursivo(nodo.getHijoIzquierdo());
            postordenRecursivo(nodo.getHijoDerecho());
            System.out.print(nodo.getDato() + " ");
        }
    }

    public void contarHojas(){
        System.out.println(contarHojasRecursivo(raiz));
    }
   private int contarHojasRecursivo(Nodo nodo){
        if (nodo == null){
            return 0;
        }
        if (nodo.getHijoIzquierdo() == null && nodo.getHijoDerecho() == null){
            return 1;
        }else{
            return contarHojasRecursivo(nodo.getHijoIzquierdo()) + contarHojasRecursivo(nodo.getHijoDerecho());
        }
    }



}
