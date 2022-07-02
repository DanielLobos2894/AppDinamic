package model;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class DatosDAO implements IDatos {

	@Override
	public Datos read(int id) {
		
		Datos D = null;

		try {

			Connection c = CoenexionBDsustantiva.getCon();

			Statement s = c.createStatement();

			String sql = "select E.id,E.rut rutE ,E.nombre nombreE ,E.email emailE ,E.telefono telefonoE ,M.fecha fechaM,C.codigo codigoC ,C.nombre nombreC ,F.nombre nombreF ,F.email emailF ,F.telefono telefonoF from estudiante E "
					+ "		   join matricula M on E.id = M.id_estudiante "
					+ "        join curso C on M.id_curso = C.id "
					+ "        join facilitador F on C.id_facilitador = F.id "
					+ "where E.id = " + id;

			ResultSet rs = s.executeQuery(sql);
			
			System.out.println("read OK");

			while (rs.next()) {
				D = new Datos(rs.getInt("id"),rs.getString("rutE"), rs.getString("nombreE"), rs.getString("emailE"), rs.getString("telefonoE"), rs.getDate("fechaM"), rs.getInt("codigoC"), rs.getString("nombreF"),rs.getString("nombreF"), rs.getString("emailE"), rs.getString("telefonoF"));

			}
			

		} catch (Exception e2) {
			System.out.println("Error al leer el read");
			e2.printStackTrace();
		}

		return D;
	}

}
