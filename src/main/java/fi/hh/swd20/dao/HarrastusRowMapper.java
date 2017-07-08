package fi.hh.swd20.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import fi.hh.swd20.bean.Harrastus;
import fi.hh.swd20.bean.HarrastusImpl;



public class HarrastusRowMapper implements RowMapper<Harrastus> {

	public Harrastus mapRow(ResultSet rs, int rowNum) throws SQLException {
		Harrastus h = new HarrastusImpl();
		h.setId(rs.getInt("id"));
		h.setNimi(rs.getString("nimi"));
		h.setKuvaus(rs.getString("kuvaus"));
		h.setPvm(rs.getString("pvm"));
		h.setAika(rs.getDouble("aika"));
		
		return h;
	}

}