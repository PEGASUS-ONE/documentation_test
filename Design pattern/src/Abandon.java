public class Abandon {
    public String nomVoilier;
    public String classeVoilier;
    public String nomSkipper;

    public Abandon (String nomVoilier, String classeVoilier, String nomSkipper) {
        this.nomVoilier = nomVoilier;
        this.classeVoilier = classeVoilier;
        this.nomSkipper = nomSkipper;
    }

    public String getNomVoilier() {
        return nomVoilier;
    }

    public String getClasseVoilier() {
        return classeVoilier;
    }

    public String getNomSkipper() {
        return nomSkipper;
    }

    @Override
    public String toString() {
        return "Abandon{" +
                "nomVoilier='" + nomVoilier + '\'' +
                ", classeVoilier=" + classeVoilier +
                ", nomSkipper='" + nomSkipper + '\'' +
                '}';
    }
}
