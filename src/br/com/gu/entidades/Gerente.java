package br.com.gu.entidades;

public class Gerente extends Funcionario{

	@Override
	public double ganhaBonos() {
		return getSalario()*0.10;
	}
	

}
