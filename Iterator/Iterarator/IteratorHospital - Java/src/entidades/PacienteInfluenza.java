package entidades;

import java.util.ArrayList;

public class PacienteInfluenza implements AgregadoHospital{
	protected Paciente[] pacientes;
	
	public PacienteInfluenza() {
		pacientes = new Paciente[4];
		pacientes[0] = new Paciente("Jo�o", 21, "Masculino", "Calafrios");
		pacientes[1] = new Paciente("Maria", 39, "Feminino", "V�mito");
		pacientes[2] = new Paciente("Maria", 39, "Feminino", "Dores articulares");
		pacientes[3] = new Paciente("Jos�", 39, "Masculino", "Calafrios");
	}
	
	@Override
	public Iterator criarIterator() {
		return new PacienteInfluenzaIterator(pacientes);
	}
}