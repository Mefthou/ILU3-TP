package cartes;

import java.util.Objects;

public class Borne extends Carte {
	private int km;
	
	public Borne(int km) {
		this.km = km;
	}

	@Override
	public String toString() {
		return km + "KM" ;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Borne other = (Borne) obj;
		return km == other.km;
	}
	

	
}
