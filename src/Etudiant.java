public class Etudiant {
    int matricule;
    String nom;
    String specialité;

    public Etudiant(int m, String n)
    {
        this.matricule=m;
        this.nom=n;
    }
    public Etudiant(int m, String n, String s)
    {
        this.matricule=m;
        this.nom=n;
        this.specialité=s;
    }

}
