package Nodo;

public class Nodo {
    private char dato;
    private Nodo HijoIzquierdo;
    private Nodo HijoDerecho;

    public Nodo(char dato){
        this.dato = dato;
        this.HijoIzquierdo = null;
        this.HijoDerecho = null;
    }

    public char getDato() {
        return dato;
    }

    public void setDato(char dato) {
        this.dato = dato;
    }

    public Nodo getHijoIzquierdo() {
        return HijoIzquierdo;
    }

    public void setHijoIzquierdo(Nodo hijoIzquierdo) {
        HijoIzquierdo = hijoIzquierdo;
    }

    public Nodo getHijoDerecho() {
        return HijoDerecho;
    }

    public void setHijoDerecho(Nodo hijoDerecho) {
        HijoDerecho = hijoDerecho;
    }
}

