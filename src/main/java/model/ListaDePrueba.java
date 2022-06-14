package model;

import java.util.ArrayList;

public class ListaDePrueba {
	
	private ArrayList<Estudiante> estudiantes;
	
	public ListaDePrueba() {

		estudiantes = new ArrayList<Estudiante>();
		
		LLenaLista();
				
	}
	
	private void LLenaLista() {
		
		this.estudiantes.add(new Estudiante(1,"18.880.791-7","Daniel L.","Dl@gmail.com","9-82638437"));
		this.estudiantes.add(new Estudiante(2,"18.251.794-1","Barbara S.","BS@gmail.com","9-85858585"));
	}

	public ArrayList<Estudiante> getEstudiantes() {
		
		
		return estudiantes;
	}
		
		
	
	
	
}


