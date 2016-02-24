package br.com.gu.entidades;

public class Programador extends Funcionario{

	@Override
	public double ganhaBonos() {
		return getSalario()*0.20;
	}
	

}
