package br.com.bancooo.model;

import java.util.ArrayList;
import java.util.Collection;

public class Cliente extends Pessoa {

    private Boolean vip;

    private Collection<Endereco> enderecos = new ArrayList<>();


    public void listarEnderecos() {
        for (Endereco endereco: this.getEnderecos()) {
            System.out.println("Endereço:");
            System.out.println("CEP: " + endereco.getCep());
            System.out.println("Logradouro: " + endereco.getLogradouro());
            System.out.println("Número: " + endereco.getNumero());
            System.out.println("Complemento: " + endereco.getComplemento());
            System.out.println("Cidade: " + endereco.getCidade());
            System.out.println("UF: " + endereco.getUf());
        }
    }

    public Collection<Endereco> getEnderecos() {
        return enderecos;
    }

    public void setEnderecos(Collection<Endereco> enderecos) {
        this.enderecos = enderecos;
    }

    public void addEndereco(Endereco endereco) {
        this.enderecos.add(endereco);
    }
}
