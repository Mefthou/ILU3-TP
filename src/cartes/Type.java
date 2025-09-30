package cartes;

public enum Type {
	 FEU("Feu rouge", "Feu vert", "Prioritaire"),
	 ESSENCE("Panne d'essence","Essence","citerne"), 
	 CREVAISON ("Crevaison", "Roue de secours","increvable"),
	 ACCIDENT ("Accident", "Repparation","as du volant");
	
	private String attaque;
	private String parade;
	private String botte;
	
	private Type(String attaque, String parade, String botte) {
		this.attaque = attaque;
		this.parade = parade;
		this.botte = botte;
	}

	public String getAttaque() {
		return attaque;
	}

	public String getParade() {
		return parade;
	}

	public String getBotte() {
		return botte;
	}


	
}
