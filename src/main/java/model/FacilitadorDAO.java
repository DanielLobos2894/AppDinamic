package model;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class FacilitadorDAO implements IFacilitadorDAO {

	@Override
	public void crear(Facilitador F) {

		String sql = "insert into facilitador (rut, nombre, email, telefono , valorhora ,banco, ctabancaria ) values ('"
				+ F.getRut() + "', '" + F.getNombre() + "', '" + F.getEmail() + "', '" + F.getTelefono() + "', '"
				+ F.getValorhora() + "', '" + F.getBanco() + "', '" + F.getCtabancaria() +"')";

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
	public Facilitador read(int id) {
	Facilitador F =null;
	try {
		Connection c = CoenexionBDsustantiva.getCon();

		Statement s = c.createStatement();

		String sql = "Select id,rut,nombre,email,telefono,valorhora,banco,ctabancaria from facilitador where id = " + id;

		ResultSet rs = s.executeQuery(sql);

		while (rs.next()) {
			F = new Facilitador(rs.getInt("id"), rs.getString("rut"), rs.getString("nombre"), rs.getString("email"),
					rs.getString("telefono"), rs.getString("valorhora"), rs.getString("banco"), rs.getString("ctabancaria"));
			}
		
	}catch(Exception e2){
	System.out.println("Error al leer el read");
	e2.printStackTrace();
	}

		return F;
	}

	@Override
	public List<Facilitador> read() {

		List<Facilitador> listaFa = new ArrayList<Facilitador>();

		try {

			Connection c = CoenexionBDsustantiva.getCon();

			Statement s = c.createStatement();

			String sql = "Select id,rut,nombre,email,telefono,valorhora,banco,ctabancaria from facilitador";

			ResultSet rs = s.executeQuery(sql);

			while (rs.next()) {
				Facilitador f = new Facilitador();

				f.setId(rs.getInt("id"));
				f.setRut(rs.getString("rut"));
				f.setNombre(rs.getString("nombre"));
				f.setEmail(rs.getString("email"));
				f.setTelefono(rs.getString("telefono"));
				f.setValorhora(rs.getString("valorhora"));
				f.setBanco(rs.getString("banco"));
				f.setCtabancaria(rs.getString("ctabancaria"));

				listaFa.add(f);
			}

		} catch (SQLException e) {
			System.out.println("Error en el metodo read()");
			e.printStackTrace();

		}

		return listaFa;

	}

	@Override
	public void update(Facilitador F) {
		String sql = "update estudiante set rut = '" + F.getRut() + "', nombre ='" + F.getNombre() + "',email ='"
				+ F.getEmail() + "',telefono ='" + F.getTelefono() +"', valorhora ='"+F.getValorhora()+"',banco='"+F.getBanco()+"',ctabancaria='"+F.getCtabancaria() +"' where id = " + F.getId();

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
	public void delete(Facilitador F) {
		delete(F.getId());

		}
	@Override
	public void delete(int id) {
		String sql = "delete from facilitador where id = " + id;

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
