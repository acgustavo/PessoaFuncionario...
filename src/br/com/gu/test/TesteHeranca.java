package br.com.gu.test;

import br.com.gu.entidades.Programador;
import br.com.gu.entidades.Sexo;

public class TesteHeranca {
	public static void main(String[] args) {
		Programador gustavo = new Programador();
		
		gustavo.setNome("Gustavo Enrique");
		gustavo.setCpf("999.999.999-99");
		gustavo.setSexo(Sexo.masculino);
		gustavo.setSalario(5000);

		//salva(gustavo);
	}
	
}
