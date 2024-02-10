public class TestEtudiant {
    public static void main(String[] args) {
       // Etudiant etud1 = new Etudiant("Ahmed");   //type is int not string
       //Etudiant etud1 = new Etudiant();       //le constructeur par default est supprimme
        Etudiant etud1 = new Etudiant(299,"Ahmed");
        // on peut pas redeclarer une var 2 fois ou plus
        etud1.specialité="Informatique";
        Etudiant etud2 = new Etudiant(288,"Ali","Math");// integer starts with 0 treated as octal
        etud2.specialité=etud1.specialité;
        System.out.println(etud1.nom+" "+etud1.specialité);
        System.out.println(etud2.nom+" "+etud2.specialité);
        etud1=etud2;
        etud2.nom="Amel";
        System.out.println(etud1.nom+" "+etud1.specialité);    }
}