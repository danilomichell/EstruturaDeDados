package listaencadeada;

import jdk.nashorn.api.tree.BreakTree;
import utils.Iterador;

public class ListaSimples<T> {

    private Celula inicio, fim;
    private int tamanho;

    public ListaSimples() {
        this.inicio = null;
        this.fim = null;
        this.tamanho = 0;
    }

    public void adicionaInicio(T elemento) {
        Celula nova = new Celula(elemento);
        if (this.tamanho == 0) {
            inicio = fim = nova;
            this.tamanho += 1;
        } else {
            nova.setProximo(inicio);
            inicio = nova;
            this.tamanho += 1;
        }
    }

    public void adiciona(T elemento, int posicao) {
        if (!existeDado()) {
            throw new ArrayIndexOutOfBoundsException("A lista está vazia!");
        } else if (posicao < 0 || posicao > tamanho()) {
            throw new ArrayIndexOutOfBoundsException("Posição Inválida");
        } else {
            Celula nova = new Celula(elemento);
            Iterador it = new Iterador(this.inicio);
            int i = 0;
            while (it.hasNext()) {
                if (tamanho() == 1) {
                    adicionaFim(elemento);
                    this.tamanho += 1;
                    break;
                }
                if (i < posicao - 1) {
                    it.next();
                    i++;
                } else {
                    nova.setProximo(it.getAtual().getProximo());
                    it.getAtual().setProximo(nova);
                    this.tamanho += 1;
                    break;
                }
            }
        }
    }

    public void adicionaFim(T elemento) {
        Celula nova = new Celula(elemento);
        if (this.tamanho == 0) {
            inicio = fim = nova;
            this.tamanho += 1;
        } else {
            fim.setProximo(nova);
            fim = fim.getProximo();
            this.tamanho += 1;
        }
    }

    public T Recupera(int posicao) {
        if (!existeDado()) {
            throw new ArrayIndexOutOfBoundsException("A lista está vazia!");
        } else if (posicao < 0 || posicao >= tamanho()) {
            throw new ArrayIndexOutOfBoundsException("Posição Inválida");
        } else {
            Iterador it = new Iterador(this.inicio);
            int i = 0;
            while (it.hasNext()) {
                if (i != posicao) {
                    it.next();
                    i++;
                } else {
                    break;
                }
            }
            return (T) it.getAtual().getElemento();
        }
    }

    public int tamanho() {;
        return this.tamanho;
    }

    public boolean existeDado() {
        return inicio != null;
    }

    public void limpa() {
        if (!existeDado()) {
            throw new ArrayIndexOutOfBoundsException("A lista está vazia!");
        }
        inicio = fim = null;
        this.tamanho = 0;
    }

    public void removeInicio() {

        if (!existeDado()) {
            throw new ArrayIndexOutOfBoundsException("A lista está vazia!");

        } else if (inicio == fim) {

            inicio = fim = null;
            this.tamanho -= 1;

        } else {

            inicio = inicio.getProximo();
            this.tamanho -= 1;
        }
    }

    public void remove(int posicao) {
        if (!existeDado()) {
            throw new ArrayIndexOutOfBoundsException("A lista está vazia!");
        } else if (posicao < 0 || posicao > tamanho()) {
            throw new ArrayIndexOutOfBoundsException("Posição Inválida");
        } else {
            Iterador it = new Iterador(this.inicio);
            int i = 0;
            while (it.hasNext()) {
                if (tamanho() == 1) {
                    limpa();
                    break;
                }
                if (i < posicao - 1) {
                    it.next();
                    i++;
                } else {
                    it.getAtual().setProximo((it.getAtual().getProximo()).getProximo());
                    this.tamanho -= 1;
                    break;
                }
            }
        }
    }

    public void removeFim() {
        if (!existeDado()) {
            throw new ArrayIndexOutOfBoundsException("A lista está vazia!");

        } else if (inicio == fim) {

            inicio = fim = null;
            this.tamanho -= 1;

        } else {
            Iterador it = new Iterador(this.inicio);
            int i = 0;
            while (it.hasNext()) {
                if (i < tamanho - 1) {
                    it.next();
                    i++;
                } else {
                    it.getAtual().setProximo(null);
                    fim = it.getAtual();
                    this.tamanho -= 1;
                    break;
                }
            }
        }
    }

}
