package entidades;

import java.util.ArrayList;

public class PacienteCovid19 implements AgregadoHospital{
	protected ArrayList<Paciente> pacientes;
	
	public PacienteCovid19() {
		pacientes = new ArrayList<Paciente>();
		pacientes.add(new Paciente("Eduardo", 20, "Masculino", "Febre"));
		pacientes.add(new Paciente("Marcon", 20, "Masculino", "Cansaço"));
		pacientes.add(new Paciente("Julio", 20, "Masculino", "Perda do paladar/olfato"));
	}
	
	public Iterator criarIterator() {
		return new PacienteCovid19Iterator(pacientes);
	}
}
