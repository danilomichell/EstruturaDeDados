package minhaFila;

public class Principal {

    public static void main(String[] args) {
        Aluno ver = null;
        Aluno a1 = new Aluno("Anderson", 42);
        Aluno a2 = new Aluno("Ana", 31);
        Aluno a3 = new Aluno("José", 23);
        Aluno a4 = new Aluno("Jonas", 11);
        Aluno a5 = new Aluno("Rebeca", 19);
        
        Fila fila = new Fila();
        
        fila.Inserir(a1);
        fila.Inserir(a2);
        fila.Inserir(a3);
        fila.Inserir(a4);
        fila.Alterar(a5);
        //fila.Remover();
        
        ver = (Aluno) fila.Recupera();
        System.out.println(ver.getNome());
    }

}
