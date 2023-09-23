package org.example;

public class Declaracao implements Cloneable {
    private String cidade;
    private Integer matricula;
    public Declaracao(String cidade, Integer matricula) {
        super();
        this.cidade = cidade;
        this.matricula = matricula;
    }
    public String getCidade() {
        return cidade;
    }
    public void setCidade(String cidade) {
        this.cidade = cidade;
    }
    public Integer getMatricula() {
        return matricula;
    }
    public void setMatricula(Integer matricula) {
        this.matricula = matricula;
    }
    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
    @Override
    public String toString() {
        return "Declaracao{" +
                "cidade='" + cidade + '\'' +
                ", matricula=" + matricula +
                '}';
    }
}