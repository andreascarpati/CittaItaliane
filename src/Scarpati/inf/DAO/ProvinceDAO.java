package Scarpati.inf.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import Scarpati.inf.Model.Province;
import Scarpati.inf.Model.Regioni;

public class ProvinceDAO {
	public void setPronvice(Regioni reg) {
		List<Province> prov = new ArrayList<Province>();

		final String sql = "SELECT * FROM regione,provincia WHERE regione.CodRegione=provincia.regione and regione.nome=?";

		try {
			Connection conn = ConnectDB.getConnection();
			PreparedStatement st = conn.prepareStatement(sql);
			st.setString(1, reg.getNome());
			ResultSet rs = st.executeQuery();

			while (rs.next()) {
				prov.add(new Province(rs.getInt("provincia.codice"), rs.getString("provincia.nome"),
						rs.getString("provincia.sigla"), rs.getInt("provincia.regione")));
			}
			conn.close();
			reg.setProvince(prov);

		} catch (SQLException e) {
			e.printStackTrace();
			throw new RuntimeException("Errore Db");
		}
	}

}
