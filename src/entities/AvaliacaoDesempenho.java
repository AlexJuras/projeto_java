package entities;

public class AvaliacaoDesempenho {
    private int idAvaliacao;
    private String periodo;
    private double nota;
    private Funcionario funcionario;

    public AvaliacaoDesempenho(int idAvaliacao, String periodo, double nota, Funcionario funcionario) {
        this.idAvaliacao = idAvaliacao;
        this.periodo = periodo;
        this.nota = nota;
        this.funcionario = funcionario;
    }

    public void avaliarColaborador() {
        System.out.println("Colaborador " + funcionario.getNome() + " avaliado com nota: " + nota);
    }

    // Getters e Setters

    public int getIdAvaliacao() {
        return idAvaliacao;
    }

    public void setIdAvaliacao(int idAvaliacao) {
        this.idAvaliacao = idAvaliacao;
    }

    public String getPeriodo() {
        return periodo;
    }

    public void setPeriodo(String periodo) {
        this.periodo = periodo;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }
}
