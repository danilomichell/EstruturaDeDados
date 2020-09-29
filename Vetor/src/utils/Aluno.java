package utils;

public class Aluno {
    private int idade;
    private String nome;

    public Aluno() {
        this.idade = 0;
        this.nome = " ";
    }

    public Aluno(int idade, String nome) {
        this.idade = idade;
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
}
