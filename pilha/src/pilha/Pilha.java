package pilha;

public class Pilha<T> {

    private Celula topo;
    private int tamanho;

    public Pilha() {
        this.topo = null;
        this.tamanho = 0;
    }

    public void push(T elemento) {
        Celula nova = new Celula(elemento);
        if (this.tamanho == 0) {
            topo = nova;
            this.tamanho += 1;
        } else {
            nova.setAnterior(this.topo);
            this.topo = nova;
            this.tamanho += 1;
        }
    }

    public int tamanho() {
        return this.tamanho;
    }

    public T top() {
        if (!existeDado()) {
            throw new ArrayIndexOutOfBoundsException("A lista está vazia!");
        }
        return (T) topo.getElemento();
    }

    public void pull(T elemento) {
        Celula nova = new Celula(elemento);
        pop();
        push(elemento);
    }

    public void pop() {
        if (!existeDado()) {
            throw new ArrayIndexOutOfBoundsException("A lista está vazia!");
        }
        this.topo = this.topo.getAnterior();
        this.tamanho -= 1;
    }

    public boolean existeDado() {
        return this.topo != null;
    }

    public boolean isEmpty() {
        return tamanho() == 0;
    }

    public void limpa() {
        if (!existeDado()) {
            throw new ArrayIndexOutOfBoundsException("A lista está vazia!");
        }
        this.topo = null;
        this.tamanho = 0;
    }

    public void removeFim() {
        if (!existeDado()) {
            throw new ArrayIndexOutOfBoundsException("A lista está vazia!");

        } else if (tamanho() == 0) {
            limpa();
        } else {

        }
    }

}
