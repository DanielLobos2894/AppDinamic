package model;

import java.util.List;

public interface IEstudianteDAO {
	
	/*
	 * C cread  crear
	 * R read   leer
	 * U update actualizar
	 * D delete borrar
	 */
	
	
	public void crear(Estudiante E);
	public Estudiante read(int id);
	public List<Estudiante> read();
	public void update(Estudiante E);
	public void delete(Estudiante E);
	public void delete(int id);

}
