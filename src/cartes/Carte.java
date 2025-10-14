package cartes;

public abstract class Carte {

	@Override
	public boolean equals(Object obj) {
		if(obj != null && obj.getClass() == getClass()) {
			return true;
		}
		return false;
	}
	
}
