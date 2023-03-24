package Principal;

public class DobleNodo {
    private IM dato;
    private DobleNodo nodoAnterior;
    private DobleNodo nodoSiguiente;

    public DobleNodo(IM dato) {
        this.dato = dato;
        this.nodoAnterior = null;
        this.nodoSiguiente = null;
        
    }

    public IM getDato() {
        return dato;
    }

    public void setDato(IM dato) {
        this.dato = dato;
    }

    public DobleNodo getNodoAnterior() {
        return nodoAnterior;
    }

    public void setNodoAnterior(DobleNodo nodoAnterior) {
        this.nodoAnterior = nodoAnterior;
    }

    public DobleNodo getNodoSiguiente() {
        return nodoSiguiente;
    }

    public void setNodoSiguiente(DobleNodo nodoSiguiente) {
        this.nodoSiguiente = nodoSiguiente;
    }


    
}
