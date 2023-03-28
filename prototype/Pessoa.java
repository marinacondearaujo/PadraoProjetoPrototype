package padroescriacao_exercicios.prototype;

import padroescriacao.prototype.Aluno;
import padroescriacao_exercicios.prototype.Pessoa;
import padroescriacao_exercicios.prototype.Endereco;

public class Pessoa implements Cloneable{
    private int cpf;
    private String nome;
    private Endereco endereco;
    private String cargo;

    public Pessoa(int cpf, String nome, Endereco endereco, String cargo) {
        this.cpf = cpf;
        this.nome = nome;
        this.endereco = endereco;
        this.cargo = cargo;
    }

    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    @Override
    public Pessoa clone() throws CloneNotSupportedException {
        Pessoa pessoaClone = (Pessoa) super.clone();
        pessoaClone.endereco = (padroescriacao_exercicios.prototype.Endereco) pessoaClone.endereco.clone();
        return pessoaClone;
    }
    @Override
    public String toString() {
        return "Pessoa{" +
                "cpf=" + cpf +
                ", nome='" + nome + '\'' +
                ", endereco=" + endereco +
                ", cargo='" + cargo + '\'' +
                '}';
    }
}
