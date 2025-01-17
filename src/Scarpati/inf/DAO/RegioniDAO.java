package Scarpati.inf.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import Scarpati.inf.Model.Regioni;

public class RegioniDAO {

	public List<Regioni> getRegioni() {
		List<Regioni> reg=new ArrayList<Regioni>();
		
		final String sql = "SELECT * FROM regione";

		try {
			Connection conn = ConnectDB.getConnection();
			PreparedStatement st = conn.prepareStatement(sql);
			ResultSet rs = st.executeQuery();

			while (rs.next()) {
				reg.add(new Regioni(rs.getInt("CodRegione"),rs.getString("Nome"),rs.getString("Popolazione")));
			}
			conn.close();

		} catch (SQLException e) {
			e.printStackTrace();
			throw new RuntimeException("Errore Db");
		}
		return reg;
	}



}
