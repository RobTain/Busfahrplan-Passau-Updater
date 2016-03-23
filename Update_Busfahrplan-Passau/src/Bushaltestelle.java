public class Bushaltestelle {
	
	String linkname;
	String buslinie;
	String bushaltestelle;
	String datum;
	
	public Bushaltestelle(String linkname, String buslinie, String bushaltstelle, String datum) {
		this.linkname = linkname;
		this.buslinie = buslinie;
		this.bushaltestelle = bushaltstelle;
		this.datum = datum;
	}

	public String getLinkname() {
		return linkname;
	}

	public String getBuslinie() {
		return buslinie;
	}

	public String getBushaltestelle() {
		return bushaltestelle;
	}


	public String getDatum() {
		return datum;
	}

}
