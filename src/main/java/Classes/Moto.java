
package Classes;
public class Moto extends Véhicule {
 
	
	private int vitesseMax ;
	public Moto(String marque, String modéle, String immatriculation , int vitesseMax) {
		super(marque, modéle, immatriculation);
		this.vitesseMax=vitesseMax ;
	}

    public int getVitesseMax() {
        return vitesseMax;
    }

    public void setVitesseMax(int vitesseMax) {
        this.vitesseMax = vitesseMax;
    }
	
	 public String toString() {
         
        String affichage="Moto"+getMarque()+""+"Imatriculation"+""+getImmatriculation()+""+
                "Modéle"+""+getModéle()+"a une vitesse Maximale"+""+getVitesseMax();
        return affichage ;
    }

}
