package entities;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Funcionario {
    private String nome;
    private int idFuncionario;
    private String cpf;
    private String cargo;
    private double salario;
    private LocalDate dataAdmissao;
    private Departamento departamento;
    private List<Beneficio> beneficios = new ArrayList<>();

    //Metodo construtor vazio
    public Funcionario (){

    }

    //Metodo construtor
    public Funcionario(String nome, int idFuncionario, String cpf, String cargo, double salario, LocalDate dataAdmissao) {
        this.nome = nome;
        this.idFuncionario = idFuncionario;
        this.cpf = cpf;
        this.cargo = cargo;
        this.salario = salario;
        this.dataAdmissao = dataAdmissao;
    }

    public void registrarPonto() {
        System.out.println("Ponto registrado para o funcionário: " + nome);
    }

    public void solicitarFerias() {
        System.out.println(nome + " solicitou férias.");
    }

    public void adicionarBeneficio(Beneficio beneficio) {
        if (!beneficios.contains(beneficio)) {
            beneficios.add(beneficio);
            beneficio.associarFuncionario(this);
            System.out.println("Benefício " + beneficio.getDescricao() + " associado ao funcionário: " + nome);
        }
    }

    // Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdFuncionario() {
        return idFuncionario;
    }

    public void setIdFuncionario(int idFuncionario) {
        this.idFuncionario = idFuncionario;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public LocalDate getDataAdmissao() {
        return dataAdmissao;
    }

    public void setDataAdmissao(LocalDate dataAdmissao) {
        this.dataAdmissao = dataAdmissao;
    }

    public Departamento getDepartamento() {
        return departamento;
    }

    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }

    public List<Beneficio> getBeneficios() {
        return beneficios;
    }

    public void setBeneficios(List<Beneficio> beneficios) {
        this.beneficios = beneficios;
    }

    @Override
    public String toString() {
        return "Funcionario{" +
                "nome='" + nome + '\'' +
                ", idFuncionario=" + idFuncionario +
                ", cpf='" + cpf + '\'' +
                ", cargo='" + cargo + '\'' +
                ", salario=" + salario +
                ", dataAdmissao=" + dataAdmissao +
                '}';
    }
}
