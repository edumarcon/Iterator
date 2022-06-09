package entidades;

public class PacienteInfluenzaIterator implements Iterator{
	protected Paciente[] lista;
	protected int cont;
	
	public PacienteInfluenzaIterator(Paciente[] lista) {
		this.lista = lista;
	}
	
	@Override
	public void first() {
		cont = 0;
		
	}

	@Override
	public void next() {
		cont++;
	}

	@Override
	public boolean isDone() {
		return cont == lista.length;
	}

	@Override
	public Paciente currentItem() {
		if(isDone()) {
			cont = lista.length - 1;
		}else if(cont < 0) {
			cont = 0;
		}
		return lista[cont];
	}
	
}
