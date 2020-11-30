/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minhaFila;

public class Fila<T> {

    private Celula inicio, fim;
    private int tamanho;

    public Fila() {
        this.inicio = null;
        this.fim = null;
        this.tamanho = 0;
    }

    public void Inserir(T elemento) {
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

    public T Recupera() {
        if (!isEmpty()) {
            throw new ArrayIndexOutOfBoundsException("A lista está vazia!");
        } else {
            return (T) this.inicio.getElemento();
        }
    }

    public int tamanho() {
        return this.tamanho;
    }

    public boolean isEmpty() {
        return inicio != null;
    }

    public void Remover() {
        if (!isEmpty()) {
            throw new ArrayIndexOutOfBoundsException("A lista está vazia!");
        }
        if (inicio == fim) {

            inicio = fim = null;
            this.tamanho -= 1;

        } else {

            inicio = inicio.getProximo();
            this.tamanho -= 1;
        }
    }

    public void Alterar(T elemento) {
        Celula nova = new Celula(elemento);
        nova.setElemento(elemento);
        nova.setProximo(inicio.getProximo());
        inicio = nova;
    }

    public void Limpa() {
        if (!isEmpty()) {
            throw new ArrayIndexOutOfBoundsException("A lista está vazia!");
        }
        inicio = fim = null;
        this.tamanho = 0;
    }

}
