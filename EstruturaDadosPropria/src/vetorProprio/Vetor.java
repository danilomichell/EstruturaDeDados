package vetorProprio;

import utils.Iterador;
import java.util.*;

public class Vetor<T> {

    //Vetor Genérico	
    private T[] vetor;

    //Variável que controla quantidade de elementos do vetor
    private int qntElementos = 0;

    //Construtor específico da Classe Vetor
    public Vetor(int tam) {

        //Criando um novo vetor genérico
        vetor = (T[]) new Object[tam];

        //this.qntElementos = tam;
    }

    //Adicionar no inicio do array
    public void adicionaInicio(T elemento) {
        if (Tamanho() >= vetor.length-1) {
            redimencionar(vetor);
        }
        Iterador it = new Iterador(vetor);
        int i = 0;
        T aux1 = vetor[0];
        T aux2 = aux1;
        while (it.hasNext()) {
            if (i < Tamanho() && vetor[i] != null) {
                if (vetor[i + 1] == null) {
                    aux2 = vetor[i + 1];
                    vetor[i + 1] = aux1;
                    break;
                }
                aux2 = vetor[i + 1];
                vetor[i + 1] = aux1;
                aux1 = aux2;
            } else {
                break;
            }
            i++;
        }
        vetor[0] = elemento;
        qntElementos++;
    }

    //Adiciona por posição
    public void adiciona(T elemento, int pos) {
        if (Tamanho() >= vetor.length-1) {
            redimencionar(vetor);
        }
        if ((pos < 0 && pos > vetor.length)) {
            throw new ArrayIndexOutOfBoundsException("Posição Inválida");
        }
        Iterador it = new Iterador(vetor);
        int i = 0;
        int contador = 0;
        T aux1 = vetor[pos];
        T aux2 = aux1;
        if (!existeDado(pos)) {
            vetor[pos] = elemento;
            qntElementos++;
        } else if (existeDado(pos)) {
            while (it.hasNext()) {
                if (contador >= pos && contador <= Tamanho()) {
                    if (vetor[i + 1] == null) {
                        aux2 = vetor[i + 1];
                        vetor[i + 1] = aux1;
                        break;
                    }
                    aux2 = vetor[i + 1];
                    vetor[i + 1] = aux1;
                    aux1 = aux2;
                }
                i++;
                contador++;
            }
            vetor[pos] = elemento;
            qntElementos++;
        }
    }

    //Adicionar no fim do array
    public void adicionaFim(T elemento) {
        if (Tamanho() >= vetor.length-1) {
            redimencionar(vetor);
        }
        Iterador it = new Iterador(vetor);
        int i = 0;
        int contador = Tamanho();
        while (it.hasNext()) {
            if (!existeDado(i) && contador == 0) {
                vetor[i] = elemento;
                qntElementos++;
                break;
            } else if (existeDado(i)) {
                contador--;
            }
            i++;
        }
    }

    //Remover fim
    public void removeFim() {
        if (vazio(vetor)) {
            throw new ArrayIndexOutOfBoundsException("Vetor vazio");
        }
        Iterador it = new Iterador(vetor);
        int i = 0;
        int contador = Tamanho();
        while (it.hasNext()) {
            if (contador == 1) {
                vetor[i] = null;
                break;
            } else if (existeDado(i)) {
                contador--;
            }
            i++;
        }
        qntElementos--;
    }

    //Remover posicao
    public void remove(int pos) {
        if (vazio(vetor)) {
            throw new ArrayIndexOutOfBoundsException("Vetor vazio");
        }
        if ((pos < 0 && pos > Tamanho()) || (!existeDado(pos))) {
            throw new ArrayIndexOutOfBoundsException("Posição Inválida");
        }
        Iterador it = new Iterador(vetor);
        int i = 0;
        while (it.hasNext()) {
            if (i >= vetor.length - 1) {
                vetor[i] = null;
                break;
            }
            if (i >= pos) {
                vetor[i] = vetor[i + 1];
            }
            i++;
        }
        qntElementos--;
    }

    //Remover inicio
    public void removeInicio() {
        if (vazio(vetor)) {
            throw new ArrayIndexOutOfBoundsException("Vetor vazio");
        }
        Iterador it = new Iterador(vetor);
        int i = 0;
        while (it.hasNext()) {
            if (i < Tamanho()) {
                vetor[i] = vetor[i + 1];
            } else {
                qntElementos--;
                break;
            }
            i++;
        }
    }

    //Retorna o valor de uma posição do vetor
    public T Recuperar(int pos) {
        if (vazio(vetor)) {
            throw new ArrayIndexOutOfBoundsException("Vetor vazio");
        }
        if ((pos < 0 && pos > Tamanho()) || (!existeDado(pos))) {
            throw new ArrayIndexOutOfBoundsException("Posição Inválida");
        }
        return vetor[pos];
    }

    //Ver se existe dado
    public boolean existeDado(int pos) {
        return vetor[pos] != null;
    }

    //Acha o tamanho
    public int Tamanho() {
        return qntElementos;
    }

    //Redimensionar
    public void redimencionar(T[] vetor) {
        T[] newVetor = (T[]) new Object[(Tamanho()+1) * 2];
        for (int i = 0; i <= Tamanho(); i++) {
            newVetor[i] = vetor[i];
        }
        this.vetor = newVetor;
    }

    //Esvazia o vetor
    public void limpa() {
        if (!vazio(vetor)) {
            Iterador it = new Iterador(vetor);
            int i = 0;
            while (it.hasNext()) {
                if (i > vetor.length - 1) {
                    break;
                } else {
                    vetor[i] = null;
                }
                i++;
            }
            qntElementos = 0;
        }

    }

    public boolean vazio(T[] vetor) {
        return Tamanho() == 0;
    }
}
