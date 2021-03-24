package br.com.bancooo.model;

import java.util.ArrayList;
import java.util.Collection;

public class Principal {

    public static void main(String[] args) {

        Cliente cliente = new Cliente();
        cliente.setNome("Victor");
        cliente.setCpf("0735454545454");
        cliente.setTelefone("32 32342022");

        Endereco end1 = new Endereco();
        end1.setCep("3603120");
        end1.setCidade("Juiz de Fora");

        Endereco end2 = new Endereco();
        end1.setCep("21940140");
        end1.setCidade("Rio de Janeiro");

        cliente.addEndereco(end1);
        cliente.addEndereco(end2);

        Funcionario funcionario = new Funcionario();
        funcionario.setNome("João");
        funcionario.setSalario(1500.0);
        funcionario.setCpf("78945612355");

        Cargo cargo1 = new Cargo();
        cargo1.setNome("Caixa");

        Cargo cargo2 = new Cargo();
        cargo1.setNome("Gerente");

        funcionario.addCargo(cargo1);
        funcionario.addCargo(cargo2);


    }

}
