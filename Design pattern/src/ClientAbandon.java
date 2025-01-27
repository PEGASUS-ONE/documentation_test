public class ClientAbandon {
    public static void main(String[] args) {
        DirectionCourse d = new DirectionCourse();
        Categorie Class40 = new Categorie("Class40");
        Categorie Imoca = new Categorie("Imoca");
        Categorie Ultim = new Categorie("Ultim");
        Categorie RhumMono = new Categorie("RhumMono");
        Categorie RhumMulti = new Categorie("RhumMulti");
        Categorie Multi50 = new Categorie("Multi50");
        d.ajouterObservateur(Class40);
        d.ajouterObservateur(Imoca);
        d.ajouterObservateur(Ultim);
        d.ajouterObservateur(RhumMono);
        d.ajouterObservateur(RhumMulti);
        d.ajouterObservateur(Multi50);
        Abandon abo1 = new Abandon("mega7", "Class40", "Edward");


        System.out.println(d.getObservateurs());


        d.getAbandons().add(abo1);

        System.out.println(Class40.getListeAbandons());


    }
}
