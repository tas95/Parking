
package Classes;


public class Camion extends Véhicule {

	private boolean remorque ;
	public Camion(String marque, String modéle, String immatriculation , boolean remorque) {
		super(marque, modéle, immatriculation);
		this.remorque=remorque ;
	}
	public boolean isRemorque() {
		return remorque;
	}

    public void setRemorque(boolean remorque) {
        this.remorque = remorque;
    }
	
      
        
	 public String toString() {
         String affichage ;
         if(isRemorque()){
        affichage="Camion"+getMarque()+""+"Imatriculation"+""+getImmatriculation()+""+
                "Modéle"+""+getModéle()+""+"Contient un Remorque";}
         else
        {
        affichage="Camion"+getMarque()+""+"Imatriculation"+""+getImmatriculation()+""+
                "Modéle"+""+getModéle()+""+"Ne contient  pas un Remorque";}  
        return affichage ;
    }

}
