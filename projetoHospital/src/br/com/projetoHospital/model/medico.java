
package br.com.projetoHospital.model;
import java.util.ArrayList;
import java.util.List;


public class Medico {
		
		private int id;
		private String nome;
		private String especializade;
		private boolean isPlantao;
		private List<Paciente> pacientes;
		
		public Medico () {
			this.pacientes = new ArrayList<Paciente>();
		}

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public String getNome() {
			return nome;
		}

		public void setNome(String nome) {
			this.nome = nome;
		}

		public String getEspecializade() {
			return especializade;
		}

		public void setEspecializade(String especializade) {
			this.especializade = especializade;
		}

		public boolean isPlantao() {
			return isPlantao;
		}

		public void setPlantao(boolean isPlantao) {
			this.isPlantao = isPlantao;
		}

		public List<Paciente> getPacientes() {
			return pacientes;
		}

		public void setPacientes(List<Paciente> pacientes) {
			this.pacientes = pacientes;
		}
		
		
		public void cadastrarPaciente (Paciente paciente) {
			this.pacientes.add(paciente);
			System.out.println("\nPaciente cadastrado com sucesso!");
		}
		
		public void imprimirRelatorioPacientes (int tipoRelatorio) {

			if (this.pacientes.size() == 0) {
				System.out.println("Sem pacientes cadastrados");
			} else {
				//Tipos de Relatórios:
				// 1 - imprimir todos
				// 2 - imprimir internados
				// 3 - imprimir não internados
				switch(tipoRelatorio) {
				case 1:
					System.out.println("\n\n- Relatório de Pacientes: dr(a) " + this.nome + " -");
					for (Paciente paciente : this.pacientes) {
						paciente.exibirDadosPaciente();
					}
					break;
				case 2:
					System.out.println("\n\n- Relatório de Pacientes internados: dr(a) " + this.nome + " -");
					for (Paciente paciente : this.pacientes) {
						if (paciente.isInternado() == true) {
							paciente.exibirDadosPaciente();
						}
					}
					break;
				case 3:
					System.out.println("\n\n- Relatório de Pacientes não internados: dr(a) " + this.nome + " -");
					for (Paciente paciente : this.pacientes) {
						if (!paciente.isInternado() == false ) {
							paciente.exibirDadosPaciente();
						}
					}
					break;
				default:
					System.out.println("Tipo de relatório indisponível!");
				}
			}
		}
		
		
}
