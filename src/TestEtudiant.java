public class TestEtudiant {
    public static void main(String[] arg) {
        Etudiant etud1 = new Etudiant(12345, "Ahmed");
        //Etudiant etud1 = new Etudiant(); // The default constructor is deleted by system after creating a custom one
         //Etudiant etud1 = new Etudiant(299,"Ahmed"); // We had not to redeclare an object
        etud1.specialité="Informatique";
        Etudiant etud2 = new Etudiant(288,"Ali","Math");
        etud2.specialité=etud1.specialité;
        System.out.println(etud1.nom+" "+etud1.specialité);
        System.out.println(etud2.nom+" "+etud2.specialité);
        etud1=etud2;
        etud2.nom="Amel";
        System.out.println(etud1.nom+" "+etud1.specialité);
    }}