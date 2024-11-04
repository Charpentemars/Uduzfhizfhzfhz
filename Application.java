import java.util.ArrayList;

public class Application extends Production {
	private String laPlateforme;
	private String leDescriptif;
	
	public Application(int unIdentifiant, String unNom, ArrayList<Developpeur> desDeveloppeurs, String unePlateforme, String unDescriptif) {
		super(unIdentifiant, unNom, desDeveloppeurs);
		this.laPlateforme = unePlateforme;
		this.leDescriptif = unDescriptif;
	}
	
	@Override public String Afficher() {
		return super.Afficher() + "\nPlateforme : " + this.laPlateforme + "\nDescriptif : " + this.leDescriptif;
	} 
}
