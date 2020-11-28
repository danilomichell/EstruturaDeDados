package pilha;

public class Celula {

    private Celula anterior;
    private Object elemento;

    public Celula() {
    }

    public Celula(Object elemento) {
        this.elemento = elemento;
    }

    public Celula getAnterior() {
        return anterior;
    }

    public void setAnterior(Celula anterior) {
        this.anterior = anterior;
    }

    public Object getElemento() {
        return elemento;
    }

    public void setElemento(Object elemento) {
        this.elemento = elemento;
    }

}