package fi.hh.swd20.bean;



public interface Harrastus {
	
	public abstract int getId();
	
	public abstract void setId(int id);

	public abstract String getNimi();

	public abstract void setNimi(String nimi);

	public abstract String getKuvaus();

	public abstract void setKuvaus(String kuvaus);

	public abstract String getPvm();

	public abstract void setPvm(String pvm);
	
	public abstract double getAika();
	
	public abstract void setAika(double aika);

}