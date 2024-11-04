import java.util.ArrayList;

public class Developpeur {
	private String leNom;
	private String lePrenom;
	private String laClasse;
	private ArrayList<Production> lesProductions;
	
	public Developpeur(String unNom, String unPrenom, String uneClasse, ArrayList<Production> desProductions) {
		this.leNom = unNom;
		this.lePrenom = unPrenom;
		this.laClasse = uneClasse;
		this.lesProductions = desProductions;
	}

	public String getLeNom() {
		return leNom;
	}

	public void setLeNom(String unNom) {
		this.leNom = unNom;
	}

	public String getLePrenom() {
		return lePrenom;
	}

	public void setLePrenom(String unPrenom) {
		this.lePrenom = unPrenom;
	}

	public String getLaClasse() {
		return laClasse;
	}

	public void setLaClasse(String uneClasse) {
		this.laClasse = uneClasse;
	}

	public ArrayList<Production> getLesProductions() {
		return lesProductions;
	}

	public void setLesProductions(ArrayList<Production> desProductions) {
		this.lesProductions = desProductions;
	}
	
	
}
