package principal;

import utils.Aluno;
import listaencadeada.ListaEncadeada;

public class Main {

    public static void main(String[] args) {
        Aluno ver = null;
        Aluno a1 = new Aluno("Anderson", 42);
        Aluno a2 = new Aluno("Ana", 31);
        Aluno a3 = new Aluno("José", 23);
        Aluno a4 = new Aluno("Jonas", 11);
        Aluno a5 = new Aluno("Rebeca", 19);

        ListaEncadeada lista = new ListaEncadeada();

        lista.adicionaFim(a1);  //funcionando
        lista.adicionaFim(a2);  //funcionando
        lista.adicionaFim(a3);  //funcionando   
        lista.adicionaInicio(a4);  //funcionando
        lista.adiciona(a5, 1);  //funcionando        

        lista.removeInicio();  //funcionando 
        lista.removeFim();  //funcionando 
        lista.remove(1);    //funcionando
        
        lista.limpa();  //funcionando
        
        for (int i = 0; i < lista.tamanho(); i++) {
            ver = (Aluno) lista.Recupera(i);
            System.out.println(ver.getNome() + " - " + ver.getIdade());
        }
    }
}
