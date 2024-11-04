import java.util.ArrayList;

public class Production {
	protected int lIdentifiant;
	protected String leNom;
	protected ArrayList<Developpeur> lesDeveloppeurs;
	
	public Production(int unIdentifiant, String unNom, ArrayList<Developpeur> desDeveloppeurs) {
		this.lIdentifiant = unIdentifiant;
		this.leNom = unNom;
		this.lesDeveloppeurs = desDeveloppeurs;
	}

	public int getlIdentifiant() {
		return lIdentifiant;
	}

	public void setlIdentifiant(int unIdentifiant) {
		this.lIdentifiant = unIdentifiant;
	}

	public String getLeNom() {
		return leNom;
	}

	public void setLeNom(String unNom) {
		this.leNom = unNom;
	}

	public ArrayList<Developpeur> getLesDeveloppeurs() {
		return lesDeveloppeurs;
	}

	public void setLesDeveloppeurs(ArrayList<Developpeur> desDeveloppeurs) {
		this.lesDeveloppeurs = desDeveloppeurs;
	}
	
	public String Afficher() {
		return "Identifiant: " + this.lIdentifiant + "\nNom : " + this.leNom ;
	}
	
	
}
