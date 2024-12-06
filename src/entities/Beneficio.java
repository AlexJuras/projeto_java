package entities;

import java.util.ArrayList;
import java.util.List;

public class Beneficio {
    private int idBeneficio;
    private String descricao;
    private double valor;
    private List<Funcionario> funcionarios = new ArrayList<>();

    public Beneficio() {

    }

    public Beneficio(int idBeneficio, String descricao, double valor) {
        this.idBeneficio = idBeneficio;
        this.descricao = descricao;
        this.valor = valor;
    }

    public void associarFuncionario(Funcionario funcionario) {
        if (!funcionarios.contains(funcionario)) {
            funcionarios.add(funcionario);
            funcionario.adicionarBeneficio(this);
        }
    }

    // Getters e Setters
    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getIdBeneficio() {
        return idBeneficio;
    }

    public void setIdBeneficio(int idBeneficio) {
        this.idBeneficio = idBeneficio;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public List<Funcionario> getFuncionarios() {
        return funcionarios;
    }
}
