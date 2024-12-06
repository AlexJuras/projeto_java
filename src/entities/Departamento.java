package entities;

import java.util.ArrayList;
import java.util.List;

public class Departamento {
    private int idDepartamento;
    private String nome;
    private Funcionario gestor;
    private List<Funcionario> funcionarios = new ArrayList<>();
    private List<Recrutamento> recrutamentos = new ArrayList<>();

    // Metodo Construtor Vazio
    public Departamento() {

    }

    // Metodo Construtor
    public Departamento(int idDepartamento, String nome, Funcionario gestor) {
        this.idDepartamento = idDepartamento;
        this.nome = nome;
        this.gestor = gestor;
    }

    public void adicionarFuncionario(Funcionario funcionario) {
        funcionarios.add(funcionario);
        funcionario.setDepartamento(this);
        System.out.println("Funcionário " + funcionario.getNome() + " adicionado ao departamento: " + nome);
    }

    public void adicionarRecrutamento(Recrutamento recrutamento) {
        if (!recrutamentos.contains(recrutamento)) {
            recrutamentos.add(recrutamento);
            System.out.println("Recrutamento adicionado ao departamento: " + nome);
        }
    }

    // Getters e Setters

    public int getIdDepartamento() {
        return idDepartamento;
    }

    public void setIdDepartamento(int idDepartamento) {
        this.idDepartamento = idDepartamento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Funcionario getGestor() {
        return gestor;
    }

    public void setGestor(Funcionario gestor) {
        this.gestor = gestor;
    }

    public List<Funcionario> getFuncionarios() {
        return funcionarios;
    }

    public void setFuncionarios(List<Funcionario> funcionarios) {
        this.funcionarios = funcionarios;
    }

    public List<Recrutamento> getRecrutamentos() {
        return recrutamentos;
    }

    public void setRecrutamentos(List<Recrutamento> recrutamentos) {
        this.recrutamentos = recrutamentos;
    }
}
