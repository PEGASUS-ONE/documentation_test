/**
 * La classe Abandon représente l'abandon d'un voilier dans une course.
 * Elle contient des informations sur le nom du voilier, la classe du voilier et le nom du skipper.
 */
public class Abandon {
    /**
     * Le nom du voilier.
     */
    public String nomVoilier;

    /**
     * La classe du voilier.
     */
    public String classeVoilier;

    /**
     * Le nom du skipper.
     */
    public String nomSkipper;

    /**
     * Constructeur avec les informations du voilier, de la classe et du skipper.
     * @param nomVoilier Le nom du voilier.
     * @param classeVoilier La classe du voilier.
     * @param nomSkipper Le nom du skipper.
     */
    public Abandon (String nomVoilier, String classeVoilier, String nomSkipper) {
        this.nomVoilier = nomVoilier;
        this.classeVoilier = classeVoilier;
        this.nomSkipper = nomSkipper;
    }

    /**
     * Retourne le nom du voilier.
     * @return Le nom du voilier.
     */
    public String getNomVoilier() {
        return nomVoilier;
    }

    /**
     * Retourne la classe du voilier.
     * @return La classe du voilier.
     */
    public String getClasseVoilier() {
        return classeVoilier;
    }

    /**
     * Retourne le nom du skipper.
     * @return Le nom du skipper.
     */
    public String getNomSkipper() {
        return nomSkipper;
    }

    /**
     * Retourne une représentation textuelle de l'abandon.
     * @return Une chaîne de caractères représentant l'abandon.
     */
    @Override
    public String toString() {
        return "Abandon{" +
                "nomVoilier='" + nomVoilier + '\'' +
                ", classeVoilier=" + classeVoilier +
                ", nomSkipper='" + nomSkipper + '\'' +
                '}';
    }
}
