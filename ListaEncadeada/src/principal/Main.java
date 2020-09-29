package principal;

import utils.Aluno;
import listaencadeada.ListaSimples;

public class Main {

    public static void main(String[] args) {

        Aluno a1 = new Aluno("Anderson", 42);
        Aluno a2 = new Aluno("Ana", 31);
        Aluno a3 = new Aluno("José", 23);
        Aluno a4 = new Aluno("Jonas", 11);

        ListaSimples lista = new ListaSimples();

        lista.adicionaInicio(a1);  //funcionando
        lista.adicionaInicio(a2);  //funcionando
        lista.adicionaInicio(a3);  //funcionando        

        lista.removeInicio();  //funcionando

        lista.adicionaFim(a4);
        a1 = (Aluno) lista.Recupera(0);
        a2 = (Aluno) lista.Recupera(1);
        a4 = (Aluno) lista.Recupera(2);

        System.out.println(a1.getNome() + " - " + a1.getIdade());  //funcionando
        System.out.println(a2.getNome() + " - " + a2.getIdade());  //funcionando
        System.out.println(a4.getNome() + " - " + a4.getIdade());  //funcionando

    }
}
