
package Classes;

public class Voiture extends Véhicule {

	private int nombreportes ;
	
	public Voiture(String marque, String modéle, String immatriculation , int nombreportes) {
		super(marque, modéle, immatriculation);
		this.nombreportes=nombreportes ;
		
	}

   

	public int getNombreportes() {
		return nombreportes;
	}

	public void setNombreportes(int nombreportes) {
		this.nombreportes = nombreportes;
	}

    @Override
    public String toString() {
         
        String affichage="voiture"+getMarque()+""+"Imatriculation"+""+getImmatriculation()+""+
                "Modéle"+""+getModéle()+"Nombre de portes"+""+getNombreportes();
        return affichage ;
    }
 
	
	 
	}
 
 