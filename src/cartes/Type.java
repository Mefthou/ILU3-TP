package cartes;

public enum Type {
	 FEU("Feu rouge", "Feu vert", "Prioritaire"),
	 ESSENCE("Panne d'essence","Essence",null), 
	 CREVAISON ("Crevaison", "Roue de secours",null),
	 ACCIDENT ("Accident", "Repparation",null);
	
	private String attaque;
	private String parade;
	private String botte;
	
	private Type(String attaque, String parade, String botte) {
		this.attaque = attaque;
		this.parade = parade;
		this.botte = botte;
	}

	
}
