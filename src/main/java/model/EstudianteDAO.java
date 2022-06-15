package model;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class EstudianteDAO implements IEstudianteDAO {

	@Override
	public void crear(Estudiante E) {
		
		String sql ="insert into estudiante (rut, nombre, email, telefono) values ('"+ E.getRut()+"', '"+E.getNombre()+"', '"+E.getEmail()+"', '"+E.getTelefono()+"')";

		try {

			Connection c = CoenexionBDsustantiva.getCon();

			Statement s = c.createStatement();

			s.execute(sql);

		} catch (Exception e2) {
			System.err.println("Error en metodo create");
			e2.printStackTrace();
		}
	}

	@Override
	public Estudiante read(int id) {

		Estudiante E = null;

		try {

			Connection c = CoenexionBDsustantiva.getCon();

			Statement s = c.createStatement();

			String sql = "Select id,rut,nombre,email,telefono from estudiante where id = " + id;

			ResultSet rs = s.executeQuery(sql);

			while (rs.next()) {
				E = new Estudiante(rs.getInt("id"), rs.getString("rut"), rs.getString("nombre"), rs.getString("email"),
						rs.getString("telefono"));

			}

		} catch (Exception e2) {
			System.out.println("Error al leer el read");
			e2.printStackTrace();
		}

		return E;
	}

	@Override
	public List<Estudiante> read() {

		List<Estudiante> listaEst = new ArrayList<Estudiante>();

		try {

			Connection c = CoenexionBDsustantiva.getCon();

			Statement s = c.createStatement();

			String sql = "Select id,rut,nombre,email,telefono from estudiante";

			ResultSet rs = s.executeQuery(sql);

			while (rs.next()) {
				Estudiante e = new Estudiante();

				e.setId(rs.getInt("id"));
				e.setRut(rs.getString("rut"));
				e.setNombre(rs.getString("nombre"));
				e.setEmail(rs.getString("email"));
				e.setTelefono(rs.getString("telefono"));

				listaEst.add(e);
			}

		} catch (SQLException e) {
			System.out.println("Error en el metodo read()");
			e.printStackTrace();

		}

		return listaEst;

	}

	@Override
	public void update(Estudiante E) {
		String sql = "update estudiante set rut = '" + E.getRut() + "', nombre ='" + E.getNombre() + "',email ='"
				+ E.getEmail() + "',telefono ='" + E.getTelefono() + "' where id = " + E.getId();

		try {

			Connection c = CoenexionBDsustantiva.getCon();

			Statement s = c.createStatement();

			s.execute(sql);

		} catch (Exception e2) {
			System.err.println("Error update");
			e2.printStackTrace();
		}

	}

	@Override
	public void delete(Estudiante E) {
		delete(E.getId());

	}

	@Override
	public void delete(int id) {
		String sql = "delete from estudiante where id = " + id;

		try {

			Connection c = CoenexionBDsustantiva.getCon();

			Statement s = c.createStatement();

			s.execute(sql);

		} catch (Exception e2) {
			System.err.println("Error en metodo Delete");
			e2.printStackTrace();
		}
	}

}
