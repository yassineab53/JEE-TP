package net.yassine.tp3;

/**
 * @author $ {USER}
 **/
public class Etudiant {
    private String cin,nom;
    private double moyenne;
    private String image;
    public Etudiant(String cin, String nom, double moyenne, String image) {
        this.cin = cin;
        this.nom = nom;
        this.moyenne = moyenne;
        this.image = image;
    }
    public String getCin() {
        return cin;
    }
    public void setCin(String cin) {
        this.cin = cin;
    }
    public String getNom() {
        return nom;
    }
    public void setNom(String nom) {
        this.nom = nom;
    }
    public double getMoyenne() {
        return moyenne;
    }
    public void setMoyenne(double moyenne) {
        this.moyenne = moyenne;
    }
    public String getImage() {
        return image;
    }
    public void setImage(String image) {
        this.image = image;
    }

   /* @Override
    public boolean equals(Etudiant E1){
        return this.equals(this.cin == E1.cin);
    }*/
   @Override
   public boolean equals(Object obj) {
       if (this == obj) return true;
       if (obj == null || getClass() != obj.getClass()) return false;
       Etudiant etudiant = (Etudiant) obj;
       return cin.equals(etudiant.cin);
   }

   /* @Override
    public int hashCode() {
        return cin.hashCode();
    }*/

}
