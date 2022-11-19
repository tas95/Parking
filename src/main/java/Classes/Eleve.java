package Classes;

public class Eleve {

    private String nom;
    private int TabNotes[] = new int[5];
    private int nbNotes = 0;
    private double moyenne = 0;

    public Eleve(String nom) {
        this.nom = nom;

    }

    public Eleve() {

    }

    public double getMoyenne() {
        /*double moy ,s = 0;
        for (int i=0;i<TabNotes.length;i++)
        {s=s+this.TabNotes[i];}
         moy=s/TabNotes.length ;

        if (moyenne==moy)
        {this.moyenne=moy ;}*/
        return this.moyenne / this.nbNotes;
    }

    public String getNom() {
        return nom;
    }

    public int[] getTabNotes() {
        return TabNotes;
    }

    public void AjouterNote(int note) {

        if (this.nbNotes <= TabNotes.length) {
            if (note < 0) {
                this.TabNotes[this.nbNotes] = 0;
                this.moyenne = this.moyenne + this.TabNotes[this.nbNotes];
                this.nbNotes++;
            } else if (note > 20) {
                this.TabNotes[this.nbNotes] = 20;
                this.moyenne = this.moyenne + this.TabNotes[this.nbNotes];
                this.nbNotes++;
            } else {
                this.TabNotes[this.nbNotes] = note;
                this.moyenne = this.moyenne + this.TabNotes[this.nbNotes];
                this.nbNotes++;
            }
        }

    }

    public String Affiche() {
        return (getNom() + "(" + getMoyenne() + ")");
    }

}
