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
		// TODO Auto-generated method stub

	}

	@Override
	public Facilitador read(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Facilitador> read() {

		List<Facilitador> listaFa = new ArrayList<Facilitador>();

		try {

			Connection c = CoenexionBDsustantiva.getCon();

			Statement s = c.createStatement();

			String sql = "Select id,rut,nombre,email,telefono,valorhora,banco from facilitador";

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
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(Facilitador F) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub

	}

}
