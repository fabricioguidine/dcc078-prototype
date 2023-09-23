package org.example;
public class Funcionario implements Cloneable {
    private int matricula;
    private String nome;
    private Declaração declaração;
    public Funcionario(int matricula, String nome, Declaração declaração) {
        this.matricula = matricula;
        this.nome = nome;
        this.declaração = declaração;
    }
    public int getMatricula() {
        return matricula;
    }
    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public Declaração getDeclaração() {
        return declaração;
    }
    public void setDeclaração(Declaração declaração){
        this.declaração = declaração;
    }
    @Override
    public Funcionario clone() throws CloneNotSupportedException {
        Funcionario funcionarioClone = (Funcionario) super.clone();
        funcionarioClone.declaração = (Declaração) funcionarioClone.declaração.clone();
        return funcionarioClone
    }
    @Override
    public String toString() {
        return "Cliente{" +
                "matricula=" + matricula +
                ", nome='" + nome + '\'' +
                ", declaracao=" + declaração +
                '}';
    }
}