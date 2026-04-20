public class Tester extends Pracownik {

    private boolean czyAutomatyzujacy;
    private int liczbaScenariuszy;
    public Tester(String id, String imie, String nazwisko, double stawka, boolean czyAutomatyzujacy, int liczbaScenariuszy) {
        super(id, imie, nazwisko, stawka);
        this.czyAutomatyzujacy = czyAutomatyzujacy;
        this.liczbaScenariuszy = liczbaScenariuszy;
    }
    @Override
    public double obliczKosztMiesieczny() {

        return getStawkaBazowa() + (liczbaScenariuszy * 50);
    }
    @Override
    public String przedstawSie() {
        return super.przedstawSie() + " | Tester (Automatyzujący: " + czyAutomatyzujacy + ")";
    }
    public void uruchomRaportTestow() {
        System.out.println("Uruchamiam raport dla " + liczbaScenariuszy + " scenariuszy...");
    }

}

