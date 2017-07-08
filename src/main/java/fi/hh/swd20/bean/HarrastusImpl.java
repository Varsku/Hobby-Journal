package fi.hh.swd20.bean;


import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import fi.hh.swd20.validator.AlkaaIsollaKirjaimella;

public class HarrastusImpl implements Harrastus {
	
	private int id;
	

	@AlkaaIsollaKirjaimella
	@Size(min=3, max=50)
	private String nimi;
	

	@AlkaaIsollaKirjaimella
	@Size(min=3, max=255)
	private String kuvaus;
	
	
	@Pattern(regexp="^(3[01]|[12][0-9]|0[1-9]).(1[0-2]|0[1-9]).[0-9]{4}$")
	private String pvm;
	

	private double aika;
	
	
	public int getId() {
		return id;
		
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNimi() {
		return nimi;
	}
	public void setNimi(String nimi) {
		this.nimi = nimi;
	}
	public String getKuvaus() {
		return kuvaus;
	}
	public void setKuvaus(String kuvaus) {
		this.kuvaus = kuvaus;
	}
	
	public String getPvm() {
		return pvm;
	}
	public void setPvm(String pvm) {
		this.pvm = pvm;
	}
	public double getAika() {
		return aika;
	}
	public void setAika(double aika) {
		this.aika = aika;
	}
	@Override
	public String toString() {
		return "Harrastus [nimi=" + nimi + ", kuvaus=" + kuvaus + ", pvm="
				+ pvm + ", aika=" + aika + "]";
	}
	
}
	
	
	