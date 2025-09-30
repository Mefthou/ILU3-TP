package cartes;

public class JeuDeCartes {
	private Configuration[] typesDeCartes = new Configuration[19];
	
	public JeuDeCartes() {
        typesDeCartes[0]  = new Configuration(new Borne(25), 10);
        typesDeCartes[1]  = new Configuration(new Borne(50), 10);
        typesDeCartes[2]  = new Configuration(new Borne(75), 10);
        typesDeCartes[3]  = new Configuration(new Borne(100), 12);
        typesDeCartes[4]  = new Configuration(new Borne(200), 4);

        typesDeCartes[5]  = new Configuration(new Parade(Type.FEU), 14);      // Feu Vert
        typesDeCartes[6]  = new Configuration(new FinLimite(), 6);
        typesDeCartes[7]  = new Configuration(new Parade(Type.ESSENCE), 6);   // Bidon d'essence

        typesDeCartes[8]  = new Configuration(new Parade(Type.CREVAISON), 6); // Roue de secours
        typesDeCartes[9]  = new Configuration(new Parade(Type.ACCIDENT), 6);  // Réparation
        typesDeCartes[10] = new Configuration(new Attaque(Type.FEU), 5);      // Feu Rouge
        typesDeCartes[11] = new Configuration(new DebutLimite(), 4);          // Limite 50

        typesDeCartes[12] = new Configuration(new Attaque(Type.ESSENCE), 3);  // Panne d'essence
        typesDeCartes[13] = new Configuration(new Attaque(Type.CREVAISON), 3);// Crevaison
        typesDeCartes[14] = new Configuration(new Attaque(Type.ACCIDENT), 3); // Accident

        typesDeCartes[15] = new Configuration(new Botte(Type.FEU), 1);        // Prioritaire
        typesDeCartes[16] = new Configuration(new Botte(Type.ESSENCE), 1);    // Citerne
        typesDeCartes[17] = new Configuration(new Botte(Type.CREVAISON), 1);  // Increvable
        typesDeCartes[18] = new Configuration(new Botte(Type.ACCIDENT), 1);   // As du volant
    }
	
    public String affichageJeuDeCartes() {
        StringBuilder sb = new StringBuilder();
        sb.append("JEU :\n\n");
        for (Configuration c : typesDeCartes) {
            sb.append(c.getNbExemplaires())
              .append(' ')
              .append(c.getCarte().toString())
              .append('\n');
        }
        return sb.toString();
    }
    
    public Carte[] donnerCartes() {
        int total = 0;
        for (Configuration c : typesDeCartes) total += c.getNbExemplaires();
        Carte[] toutes = new Carte[total];
        int i = 0;
        for (Configuration c : typesDeCartes) {
            for (int k = 0; k < c.getNbExemplaires(); k++) {
                toutes[i++] = c.getCarte(); 
            }
        }
        return toutes;
    }

	
	private static class Configuration{
		private int nbExemplaires ;
		private Carte carte;

		private Configuration(Carte carte,int nbExemplaires) {
			this.carte = carte;
			this.nbExemplaires = nbExemplaires;
		}
		
		public Carte getCarte() {
			return carte;
		}

		public int getNbExemplaires() {
			return nbExemplaires;
		}
		
		
	}
	
	

}
