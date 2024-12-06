package entities;

import java.util.ArrayList;
import java.util.List;

public class FolhaDePagamento {
    private int idFolha;
    private int mes;
    private int ano;
    private double totalSalario;
    private List<Funcionario> funcionarios = new ArrayList<>();

    // Metodo Construtor Vazio
    public FolhaDePagamento() {

    }

    // Metodo Construtor
    public FolhaDePagamento(int idFolha, int mes, int ano) {
        this.idFolha = idFolha;
        this.mes = mes;
        this.ano = ano;
    }

    public void adicionarFuncionario(Funcionario funcionario) {
        if (!funcionarios.contains(funcionario)) {
            funcionarios.add(funcionario);
        }
    }

    public void calcularSalario() {
        totalSalario = 0;
        for (Funcionario funcionario : funcionarios) {
            totalSalario += funcionario.getSalario();
        }
        System.out.println("Salário total calculado: R$" + totalSalario);
    }

    // Getters e Setters

    public int getIdFolha() {
        return idFolha;
    }

    public void setIdFolha(int idFolha) {
        this.idFolha = idFolha;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public double getTotalSalario() {
        return totalSalario;
    }

    public void setTotalSalario(double totalSalario) {
        this.totalSalario = totalSalario;
    }

    public List<Funcionario> getFuncionarios() {
        return funcionarios;
    }

    public void setFuncionarios(List<Funcionario> funcionarios) {
        this.funcionarios = funcionarios;
    }
}
