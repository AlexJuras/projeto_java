package aplication;

import entities.Funcionario;

import java.time.LocalDate;
import java.util.Date;

public class Main {
    public static void main(String[] args){

        Funcionario funcionario = new Funcionario();
        funcionario.setNome("Alex");
        funcionario.setIdFuncionario(24601);
        funcionario.setCpf("000.000.000-00");
        funcionario.setCargo("Atendente de Suporte Online");
        funcionario.setSalario(1300.00);

        LocalDate dataAdmissao = LocalDate.of(2024, 10, 9); //Não soube usar o tipo date e acabei usando esse LocalDate professor
        funcionario.setDataAdmissao(dataAdmissao);


        System.out.println(funcionario);
    }

}
