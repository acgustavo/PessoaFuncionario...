package br.com.gu.entidades;

public class Gerente extends Funcionario{

	@Override
	public double ganhaBonos() {
		return getSalario()*1.10;
	}
	

}
