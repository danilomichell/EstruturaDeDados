package pilha;

public class Principal {

    public static void main(String[] args) {
        Aluno ver = null;
        Aluno a1 = new Aluno("Anderson", 42);
        Aluno a2 = new Aluno("Luis", 23);
        Aluno a3 = new Aluno("Jorge", 63);
        Aluno a4 = new Aluno("Marta", 13);
        Aluno a5 = new Aluno("Pedro", 3);
        Pilha pilha = new Pilha();

        pilha.push(a1);
        ver = (Aluno) pilha.top();
        System.out.println(ver.getNome());
        pilha.push(a2);
        ver = (Aluno) pilha.top();
        System.out.println(ver.getNome());
        pilha.push(a3);
        ver = (Aluno) pilha.top();
        System.out.println(ver.getNome());
        pilha.push(a4);
        ver = (Aluno) pilha.top();
        //pilha.limpa();
        System.out.println(ver.getNome());
        pilha.pop();
        ver = (Aluno) pilha.top();
        System.out.println(ver.getNome());
        pilha.pull(a5);
        ver = (Aluno) pilha.top();
        System.out.println(ver.getNome());
        pilha.limpa();
        ver = (Aluno) pilha.top();
        System.out.println(ver.getNome());
    }

}
