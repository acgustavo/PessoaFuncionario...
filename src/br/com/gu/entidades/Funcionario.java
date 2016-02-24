package br.com.gu.entidades;

public abstract class Funcionario extends PessoaFisica {
	private double salario;

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public abstract double ganhaBonos();

}
