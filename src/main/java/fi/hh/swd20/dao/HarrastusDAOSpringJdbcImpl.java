package fi.hh.swd20.dao;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;




import java.util.List;

import javax.inject.Inject;

import org.springframework.dao.IncorrectResultSizeDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCreator;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.stereotype.Repository;

import fi.hh.swd20.bean.Harrastus;
import fi.hh.swd20.dao.HarrastusDAO;



@Repository
public class HarrastusDAOSpringJdbcImpl implements HarrastusDAO {

	@Inject
	private JdbcTemplate jdbcTemplate;

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	/**
	 * Tallettaa parametrina annetun henkil�n tietokantaan. Tietokannan
	 * generoima id asetetaan parametrina annettuun olioon.
	 */
	public void talleta(Harrastus h) {
		final String sql = "insert into harrastus(nimi, kuvaus, pvm, aika) values(?,?,?,?)";

		// anonyymi sis�luokka tarvitsee vakioina v�litett�v�t arvot,
		// jotta roskien keruu onnistuu t�m�n metodin suorituksen p��ttyess�.
		final String nimi = h.getNimi();
		final String kuvaus = h.getKuvaus();
		final String pvm= h.getPvm();
		final double aika= h.getAika();
	

		// jdbc pist�� generoidun id:n t�nne talteen
		KeyHolder idHolder = new GeneratedKeyHolder();

		// suoritetaan p�ivitys itse m��ritellyll� PreparedStatementCreatorilla
		// ja KeyHolderilla
			
		jdbcTemplate.update(new PreparedStatementCreator() {
			public PreparedStatement createPreparedStatement(
					Connection connection) throws SQLException {
				PreparedStatement ps = connection.prepareStatement(sql,
						new String[] { "id" });
				ps.setString(1, nimi);
				ps.setString(2, kuvaus);
				ps.setString(3, pvm);
				ps.setDouble(4, aika);
				return ps;
			}
		}, idHolder);

		// tallennetaan id takaisin beaniin, koska
		// kutsujalla pit�isi olla viittaus samaiseen olioon
		h.setId(idHolder.getKey().intValue());

	}

	

	public Harrastus etsi(int id) {
		String sql = "select id, nimi, kuvaus, pvm, aika from harrastus where id = ?";
		Object[] parametrit = new Object[] {id};
		RowMapper<Harrastus> mapper = new HarrastusRowMapper();

		Harrastus h;
		try {
			h = jdbcTemplate.queryForObject(sql, parametrit, mapper);
		} catch (IncorrectResultSizeDataAccessException e) {
			throw new HarrastustaEiLoydyPoikkeus(e);
		}
		return h;

	}

	
	public List<Harrastus> haeKaikki(String pvm) {
		String sql = "select id, nimi, kuvaus, pvm, aika from harrastus where pvm = ?";
		Object[] parametrit = new Object[] {pvm};
		RowMapper<Harrastus> mapper = new HarrastusRowMapper();
		List<Harrastus> harrastus = jdbcTemplate.query(sql, mapper, parametrit);
		return harrastus;
	}
	
	public List<Harrastus> poista(int id) {
	String sql = "delete from harrastus where id=?";
	Object[] parametrit = new Object[] {id};
	RowMapper<Harrastus> mapper = new HarrastusRowMapper();
	List<Harrastus> harrastus = jdbcTemplate.query(sql, mapper, parametrit);
	return harrastus;
	}
	
	
	
}
