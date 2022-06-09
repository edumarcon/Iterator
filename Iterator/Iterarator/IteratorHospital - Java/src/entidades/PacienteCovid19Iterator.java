package entidades;

import java.util.ArrayList;

public class PacienteCovid19Iterator implements Iterator {
	protected ArrayList<Paciente> lista;
	private int cont = 0;

	protected PacienteCovid19Iterator(ArrayList<Paciente> lista) {
		this.lista = lista;
		cont = 0;
	}

	public void first() {
		cont = 0;
	}

	public void next() {
		cont++;
	}

	public boolean isDone() {
		return cont == lista.size();
	}

	public Paciente currentItem() {
		if (isDone()) {
			cont = lista.size() - 1;
		} else if (cont < 0) {
			cont = 0;
		}
		return lista.get(cont);
	}

}
