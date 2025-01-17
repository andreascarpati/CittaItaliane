package Scarpati.inf.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import Scarpati.inf.Model.Citta;
import Scarpati.inf.Model.Province;

public class CittaDAO {
	public void setCitta(Province prov) {
		List<Citta> citta = new ArrayList<Citta>();

		final String sql = "SELECT * FROM provincia,citta WHERE provincia.codice=citta.provincia and provincia.nome=?";

		try {
			Connection conn = ConnectDB.getConnection();
			PreparedStatement st = conn.prepareStatement(sql);
			st.setString(1, prov.getNome());
			ResultSet rs = st.executeQuery();

			while (rs.next()) {
				citta.add(new Citta(rs.getInt("citta.codice"), rs.getString("citta.nome"), rs.getString("citta.cap"),
						rs.getInt("citta.provincia")));
			}
			prov.setCitta(citta);
			conn.close();

		} catch (SQLException e) {
			e.printStackTrace();
			throw new RuntimeException("Errore Db");
		}
	}

}
