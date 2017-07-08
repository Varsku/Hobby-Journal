package fi.hh.swd20.dao;





import java.util.List;

import fi.hh.swd20.bean.Harrastus;
public interface HarrastusDAO {
	
	public abstract void talleta(Harrastus harrastus);
	
	public abstract Harrastus etsi(int id);
	
	public abstract List<Harrastus> haeKaikki(String pvm);
	
	public abstract List<Harrastus> poista(int id);

}
