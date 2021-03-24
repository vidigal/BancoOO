package br.com.bancooo.model;

import java.util.ArrayList;
import java.util.Collection;

public class Funcionario extends Pessoa {

    private Double salario;

    private Collection<Cargo> cargos = new ArrayList<>();

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    public Collection<Cargo> getCargos() {
        return cargos;
    }

    public void setCargos(Collection<Cargo> cargos) {
        this.cargos = cargos;
    }

    public void addCargo(Cargo cargo) {
        this.cargos.add(cargo);
    }
}
