package model;

public class Asiakas {
	private String etunimi, sukunimi, puhelin, maili;
	public Asiakas() {
		super();		
	}
	public Asiakas(String etunimi, String sukunimi, String puhelin, String maili) {
		super();
		this.etunimi = etunimi;
		this.sukunimi = sukunimi;
		this.puhelin = puhelin;
		this.maili = maili;
		
	}
	public String getEtunimi() {
		return etunimi;
	}
	public void setEtunimi(String etunimi) {
		this.etunimi = etunimi;
	}
	public String getSukunimi() {
		return sukunimi;
	}
	public void setSukunimi(String sukunimi) {
		this.sukunimi = sukunimi;
	}
	public String getPuhelin() {
		return puhelin;
	}
	public void setPuhelin(String puhelin) {
		this.puhelin = puhelin;
	}
	public String getMaili() {
		return maili;
	}
	public void setMaili(String maili) {
		this.maili = maili;
		
	
	}
	@Override
	public String toString() {
		return "Asiakas [etunimi=" + etunimi + ", sukunimi=" + sukunimi + ", puhelin=" + puhelin + ", maili=" + maili
				+ "]";
	}}
