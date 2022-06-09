package entidades;

public interface Iterator {
	void first();
	
	void next();
	
	boolean isDone();
	
	Paciente currentItem();
	
}
