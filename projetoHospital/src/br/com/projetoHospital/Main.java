package br.com.projetoHospital;

import java.util.ArrayList;

import java.util.List;

import br.com.projetoHospital.model.Paciente;
import br.com.projetoHospital.model.Medico;

public class Main {

	public static void main(String[] args) {
		// Instanciar 3 objetos da classe Paciente
		Paciente paciente1 = new Paciente();
		paciente1.setId(1);
		paciente1.setNome("Maria");
		paciente1.setIdade(47);
		paciente1.setSexo("Feminino");
		paciente1.setIsInternado(true);
		
		
		Paciente paciente2 = new Paciente();
		paciente2.setId(2);
		paciente2.setNome("João");
		paciente2.setIdade(59);
		paciente2.setSexo("Masculino");
		paciente2.setIsInternado(true);
		
		Paciente paciente3 = new Paciente();
		paciente3.setId(3);
		paciente3.setNome("Marco");
		paciente3.setIdade(70);
		paciente3.setSexo("Masculino");
		paciente3.setIsInternado(false);
		
		// Instanciar 1 objeto da classe Medico
		Medico medica = new Medico();
		medica.setId(1);
		medica.setNome("Ana Paula");
		medica.setEspecializade("Cardiologia");
		medica.setPlantao(true);
		
		// Cadastrar os pacientes para o medico
		medica.cadastrarPaciente(paciente1);
		medica.cadastrarPaciente(paciente2);
		medica.cadastrarPaciente(paciente3);
		
		medica.imprimirRelatorioPacientes(1);
		
		medica.imprimirRelatorioPacientes(2);
		
		medica.imprimirRelatorioPacientes(3);
		
		medica.realizarAltaPaciente(3);
	
	}

}
