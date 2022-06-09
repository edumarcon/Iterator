package principal;

import entidades.AgregadoHospital;
import entidades.PacienteCovid19;
import entidades.PacienteInfluenza;
import entidades.Iterator;

public class showMenu {
	public static void main(String[] args) {
		AgregadoHospital pacientesCovid19 = new PacienteCovid19();
		System.out.println("Pacientes com Covid-19:");
		for (Iterator aux = pacientesCovid19.criarIterator(); !aux
				.isDone(); aux.next()) {
			System.out.println(aux.currentItem().nome);
		}

		AgregadoHospital pacientesInfluenza = new PacienteInfluenza();
		System.out.println("\nPacientes com Influenza:");
		for (Iterator aux = pacientesInfluenza.criarIterator(); !aux
				.isDone(); aux.next()) {
			System.out.println(aux.currentItem().nome);
		}
	}
}