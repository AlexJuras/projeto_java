package entities;

public class Recrutamento {
    private int idVaga;
    private String descricao;
    private String status;
    private Departamento departamento;

    //Metodo Construtor vazio
    public Recrutamento() {

    }

    //Metodo Construtor
    public Recrutamento(int idVaga, String descricao, String status, Departamento departamento) {
        this.idVaga = idVaga;
        this.descricao = descricao;
        this.status = status;
        this.departamento = departamento;
    }

    public void publicarVaga() {
        System.out.println("Vaga publicada: " + descricao + " no departamento: " + departamento.getNome());
    }

    public void avaliarCandidato() {
        System.out.println("Candidato avaliado para a vaga: " + descricao);
    }

    // Getters e Setters

    public int getIdVaga() {
        return idVaga;
    }

    public void setIdVaga(int idVaga) {
        this.idVaga = idVaga;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Departamento getDepartamento() {
        return departamento;
    }

    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }
}
