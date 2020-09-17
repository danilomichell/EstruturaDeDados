package vetorProprio;

import utils.Aluno;
import vetorProprio.Vetor;

public class Main {

    public static void main(String[] args) {
        Vetor<Aluno> vetor = new Vetor<Aluno>(2);
        Aluno a = new Aluno(12, "Jorge");
        Aluno a2 = new Aluno(18, "Maria");
        Aluno a3 = new Aluno(18, "Marta");
        Aluno a4 = new Aluno(18, "Monica");
        Aluno a5 = new Aluno(28, "Pedro");   
        vetor.adiciona(a5, 1);
        vetor.adicionaFim(a);
        vetor.adicionaFim(a2);
        vetor.adicionaFim(a3);
        
        System.out.println(vetor.Tamanho());

        for (int i = 1; i < vetor.Tamanho(); i++) {
            System.out.println(vetor.Recuperar(i).getNome());
        }
        System.out.println("");
        vetor.adicionaInicio(a4);
        for (int i = 0; i < vetor.Tamanho(); i++) {
            System.out.println(vetor.Recuperar(i).getNome());
        }
        System.out.println("");
        vetor.removeFim();
        vetor.removeInicio();
        for (int i = 0; i < vetor.Tamanho(); i++) {
            System.out.println(vetor.Recuperar(i).getNome());
        }
    }
}
